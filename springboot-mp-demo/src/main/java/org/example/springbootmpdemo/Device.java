package org.example.springbootmpdemo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.zip.DeflaterInputStream;

@TableName
public class Device {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String deviceName;
    private String status;
    private double value;
    public Device(){};

    public Device(String deviceName, String status, double value) {
        this.deviceName = deviceName;
        this.status = status;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", status='" + status + '\'' +
                ", value=" + value +
                '}';
    }
}
