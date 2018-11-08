package cn.ahjz.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wind on 2018/11/7.
 */
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("cn/ahjz/jdbc/applicationContext.xml");

        DeptDao dept=(DeptDao)ac.getBean("deptDao");

        dept.save(new Dept());
    }
}
