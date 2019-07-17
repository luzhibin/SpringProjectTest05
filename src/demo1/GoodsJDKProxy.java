package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GoodsJDKProxy {
    public GoodsDao createProxy(GoodsDao goodsDao) {
        //对代码进行增强
        GoodsDao goodsDaoProxy = (GoodsDao) Proxy.newProxyInstance(goodsDao.getClass().getClassLoader(), goodsDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override/*当调用对象的时候，所有方法都会来到这里*/
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("save".equals(method.getName())){
                    System.out.println("权限校验------------------");
                    GoodsDao goodsDao1 = (GoodsDao) method.invoke(goodsDao, args);
                    System.out.println("添加日志------------------");
                    return goodsDao1;
                }
                return method.invoke(goodsDao,args);
            }
        });
        return goodsDaoProxy;
    }
}
