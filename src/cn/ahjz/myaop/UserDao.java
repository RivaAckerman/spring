package cn.ahjz.myaop;

import org.springframework.stereotype.Repository;

/**
 * Created by wind on 2018/11/6.
 */
@Repository//implements IUserDao
public class UserDao  {


    public void run() {
        System.out.println("i am running");
    }


    public void eat() {
        System.out.println("-------eat-------");
    }
}
