package cn.ahjz.tx_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wind on 2018/11/7.
 */
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("cn/ahjz/tx_jdbc/applicationContext.xml");

        IDeptDao dept=(IDeptDao)ac.getBean("deptDao");

        dept.save(new Dept());
        int i=1/0;
        dept.save(new Dept());
    }
}
