package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.mybatis.spring.annotation.MapperScan;

@TableName("tb_user")
@Data
@Getter
@Setter
public class User   {
    private long id;
    private  String userName;
    private String password;
    private  String name;
    private int age;
    private  String email;
}
