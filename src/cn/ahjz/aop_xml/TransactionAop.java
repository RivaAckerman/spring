package cn.ahjz.aop_xml;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by wind on 2018/11/7.
 */

/**
 * 切面类
 */

public class TransactionAop {


    public void begintransactionaop(){
        System.out.println("开始提交事务");
    }

    public void commit(){
        System.out.println("提交完毕");
    }

}
