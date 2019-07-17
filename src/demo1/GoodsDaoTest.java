package demo1;

import org.junit.Test;

public class GoodsDaoTest {
    @Test
    public void test(){
        GoodsDao goodsDao = new GoodsDaoImpl();
//        goodsDao.save();
        GoodsJDKProxy goodsJDKProxy = new GoodsJDKProxy();
        //获取的代理对象
        GoodsDao proxy = goodsJDKProxy.createProxy(goodsDao);
        proxy.save();
        proxy.update();
    }
}
