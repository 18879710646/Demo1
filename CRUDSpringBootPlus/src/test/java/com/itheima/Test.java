package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.Mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private UserMapper userMapper;


    /*删除*/
    @org.junit.Test
    public void  delete(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        int i = userMapper.deleteBatchIds(list);
        System.out.println(i);
    }
    @org.junit.Test
    public void  insert(){
        User user = new User();
        user.setUserName("itcast");
        user.setPassword("itheima");
        int count = userMapper.insert(user);
        System.out.println(count);
    }


    @org.junit.Test
    public void testUpdateById() {
        User user = new User();
        user.setId(2L);
        user.setPassword("1111111");
        int count = userMapper.updateById(user);
        System.out.println(count);
    }


//    分页查询
    /**
     * 分页查询：
     *  1. 当前页码：currentPage
     *  2. 每页显示条数：size
     *  注意：使用mp的分页要设置一个拦截器！！！
     */


/*
*
* eq( ) :  等于 =
ne( ) :  不等于 <>
gt( ) :  大于 >
ge( ) :  大于等于  >=
lt( ) :  小于 <
le( ) :  小于等于 <=
between ( ) :  BETWEEN 值1 AND 值2
notBetween ( ) :  NOT BETWEEN 值1 AND 值2
in( ) :  in
notIn( ) ：not in
*
* */
    @org.junit.Test
    public void testSelectPage() {
        int current = 1;//当前页码
        int size = 2;//每页显示条数
        IPage<User> page = new Page(current,size);
        userMapper.selectPage(page,null);

        List<User> records = page.getRecords();//当前页的数据
        long pages = page.getPages();//总页数 2
        long total = page.getTotal();//总记录数 4
        System.out.println(records);
        System.out.println(pages);
        System.out.println(total);
    }

}
