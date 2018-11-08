package cn.ahjz.cglib;

/**
 * Created by wind on 2018/11/6.
 */
public class UserDao implements IUserDao {

    @Override
    public void run() {
        System.out.println("i am running");
    }

    @Override
    public void eat() {
        System.out.println("-------eat-------");
    }
}
