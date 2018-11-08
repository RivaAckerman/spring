package cn.ahjz.aop_xml;


/**
 * Created by wind on 2018/11/6.
 */

public class UserDao implements IUserDao {


    public void run() {
        System.out.println("---i am running---");
    }


    public void eat() {
        System.out.println("-------eat-------");
    }
}
