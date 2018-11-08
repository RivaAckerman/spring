package cn.ahjz.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by wind on 2018/11/6.
 */
@Repository
public class UserDao {

    public void run(){
        System.out.println("i am running!!!");
    }

}
