package cn.ahjz.dyproxy;

import cn.ahjz.conproxy.UserDaoProxy;

/**
 * Created by wind on 2018/11/6.
 */
public class App {

    public static void main(String[] args) {

        IUserDao userDao=new UserDao();

        ProxyFactory p= new ProxyFactory(userDao);

        IUserDao u = (IUserDao)p.getProxytarget();

        u.eat();

    }

}
