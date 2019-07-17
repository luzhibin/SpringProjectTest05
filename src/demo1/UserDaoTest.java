package demo1;

import org.junit.Test;

public class UserDaoTest {
    @Test
    public void test(){
        UserDao userDao = new UserDao();
      /*  userDao.save();*/
        UserDaoCglibProxy userDaoCglibProxy = new UserDaoCglibProxy();
        UserDao cglibProxy = userDaoCglibProxy.createCglibProxy(userDao);
        cglibProxy.save();
        cglibProxy.update();
    }
}
