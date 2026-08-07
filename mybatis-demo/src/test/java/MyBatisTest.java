import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testFindAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(1,"huxing","123",43,"huxing@gmail.com"));
        userList.add(new User(2,"majuan","123",43,"huxing@gmail.com"));
        userList.add(new User(3,"tongtong","123",43,"huxing@gmail.com"));
        userList.add(new User(4,"joy","123",43,"huxing@gmail.com"));
        Integer rows;
        rows = userMapper.addUserList(userList);
        if(rows>0)
            System.out.println("批量删除成功");
        sqlSession.commit();
        sqlSession.close();
    }
}
