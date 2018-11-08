package cn.ahjz.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wind on 2018/11/6.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;


    public void run(){
        userDao.run();
    }
}
