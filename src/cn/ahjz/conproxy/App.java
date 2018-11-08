package cn.ahjz.conproxy;

/**
 * Created by wind on 2018/11/6.
 */
public class App {

    public static void main(String[] args) {
        IUserDao proxy= new UserDaoProxy(new UserDao());
        proxy.run();
    }

}
