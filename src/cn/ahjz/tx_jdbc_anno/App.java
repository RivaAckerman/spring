package cn.ahjz.tx_jdbc_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wind on 2018/11/7.
 */
@Transactional
public class App {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/ahjz/tx_jdbc_anno/applicationContext.xml");

        IDeptDao dept = (IDeptDao) ac.getBean("deptDao");

        test((DeptDao) dept);
    }

    public static void test(DeptDao dept) {
        dept.save(new Dept());
        int i = 1 / 0;
        dept.save(new Dept());
    }
}
