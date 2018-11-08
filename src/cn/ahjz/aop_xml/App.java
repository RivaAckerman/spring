package cn.ahjz.aop_xml;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wind on 2018/11/6.
 */

/**
 * 在AOP 编程中 符合切入点表达式的类，如果目标对象有实现接口，从容器中获取对象，一定通过接口接收
 */
public class App {

    @Test
    public void test1() {

        ApplicationContext ac=new ClassPathXmlApplicationContext("cn/ahjz/aop_xml/applicationContext.xml");

        IUserDao userDao =(IUserDao) ac.getBean("userDao");

        System.out.println(userDao.getClass());

        userDao.eat();

    }



}
