package demo1;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserDaoCglibProxy implements MethodInterceptor {
    public UserDao createCglibProxy(UserDao userDao){

        //1.创建核心类
        Enhancer enhancer = new Enhancer();
        //2.设置父类  继承方式
        enhancer.setSuperclass(userDao.getClass());//内部自动创建一个子类，继承自（）里的父类
        //3.设置回调
        enhancer.setCallback(this);
        //4.创建代理对象，就是把内部创建的子类给你
        UserDao obj = (UserDao) enhancer.create();
        return obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //执行判断
        if("save".equals(method.getName())){
            System.out.println("添加权限---------");
            return methodProxy.invokeSuper(o,objects);
        }
        return methodProxy.invokeSuper(o,objects);
    }
}
