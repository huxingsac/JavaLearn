package org.example.springbootmpdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceController {
    @Autowired
    private DeviceMapper mapper;
    @GetMapping("/devices")
    public List<Device> getDevices(){
        return mapper.selectList(null);  // Spring Boot 会自动把 List<Device> 转成 JSON 数组
    }
}
