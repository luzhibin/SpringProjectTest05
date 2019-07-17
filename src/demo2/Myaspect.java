package demo2;

import org.aspectj.lang.ProceedingJoinPoint;

public class Myaspect {
    public void check(){
        System.out.println("权限校验");
    }

    public void log(Object res){
        System.out.println("日志记录"+res);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        /**/
        System.out.println("环绕前--------开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后--------提交事务");
        return proceed;
    }
}
