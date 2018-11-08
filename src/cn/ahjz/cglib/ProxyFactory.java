package cn.ahjz.cglib;

import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Created by wind on 2018/11/6.
 * 返回代理对象
 */
public class ProxyFactory implements MethodInterceptor{

    //需要代理的对象
    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    //返回代理对象
    public Object getProxytarget(){

        //字节码生成工具类
        Enhancer en = new Enhancer();

        //设置父类
        en.setSuperclass(target.getClass());

        //设置回调函数
        en.setCallback(this);

        return en.create();

    }

    //事件处理器 处理目标方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        String name=method.getName();

        Object result=null;

        if(name.equals("run")){
            result=method.invoke(target,objects);
        }else {
            System.out.println("---");
            result=method.invoke(target,objects);
            System.out.println("---");
        }
        return result;
    }
}
