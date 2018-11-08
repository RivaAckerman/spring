package cn.ahjz.conproxy;

/**
 * Created by wind on 2018/11/6.
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao){
        this.userDao=userDao;
    }


    @Override
    public void run() {
        System.out.println("my name is tom");
        userDao.run();
    }
}
