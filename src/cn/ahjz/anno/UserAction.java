package cn.ahjz.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by wind on 2018/11/6.
 */

@Controller
public class UserAction {

    @Resource
    private UserService userService;

    public void run() {
        userService.run();
    }
}
