package cn.ahjz.dyproxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Created by wind on 2018/11/6.
 * 返回代理对象
 */
public class ProxyFactory {

    //需要代理的对象
    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxytarget(){

        Object proxyClass = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

                        String name = method.getName();

                        Object result=null;

                        if(name.equals("run")){
                            result= method.invoke(target, objects);
                        }else {
                            System.out.println("----------");
                            result= method.invoke(target, objects);
                            System.out.println("-----------");
                        }

                        return result;
                    }
                }

        );


        return proxyClass;
    }

}
