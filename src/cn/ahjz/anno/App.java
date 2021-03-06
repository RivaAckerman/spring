package cn.ahjz.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wind on 2018/11/6.
 */
public class App {

    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/ahjz/anno/applicationContext.xml");

        //创建对象
        UserAction u = (UserAction)ac.getBean("userAction");

        u.run();

    }

}
