# SpringProjectTest05  
### SpringProject--->Test5  
### Spring测试工程5：Spring-AOP(面向切面编程)  
* **1.** 了解Spring-AOP内部原理：JDK动态代理和Cglib动态代理   
* **2.** 了解AOP的相关术语  
  * (1)Joinpoint:连接点  
  * (2)Pointcut:切入点  
  * (3)Advice：通知  
  * (4)Introduction:引介  
  * (5)Target:被增加的对象  
  * (6)Weaving:织入  
  * (7)Proxy:代理对象  
  * (8)Aspect:切面  
* **3.** Spring中AOP的基本使用  
  * 1.引入spring基本jar包
  * 2.引入aop开发的相关jar包
  * 3.配置文件中引入aop约束  
  	* `		<?xml version="1.0" encoding="UTF-8"?>  
			<beans xmlns="http://www.springframework.org/schema/beans"  
		       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
		       xmlns:aop="http://www.springframework.org/schema/aop"  
		       xsi:schemaLocation="http://www.springframework.org/schema/beans  
		        http://www.springframework.org/schema/beans/spring-beans.xsd  
		        http://www.springframework.org/schema/aop  
		        http://www.springframework.org/schema/aop/spring-aop.xsd">  
		</beans> `
  * 4.Spring测试
	测试时，每次都需要获取工厂
	通过spring-test，就不用每次获取
	添加测试依赖包  
  * 5.测试  
  * 6.编写一个切面类  
  * 7.将切面交给spring  
  * 8.配置AOP完成对目标产生代理  
* **4.** 测试了Spring-AOP的通知类型（有5种通知类型，但只测试了其中4种）  
  * 1.前置通知  
  * 2.后置通知  
  * 3.环绕通知  
  * 4.异常抛出通知  
  * 5.最终通知（×）  
* **5.** Spring-AOP切入点表达式  
  * 基于execution函数完成  
 * **6.** AOP注解方式ApsectJ开发  
   * 引入Jar包  
   * 引入配置文件  
   * 编写切面类配置  
   * 使用注解的AOP对象目标类进行增强  
    * 在配置文件中开启以注解形式进行AOP开发  
    * 在切面类上添加注解  
   * 注解AOP通知类型  
    * @Before前置通知  
    * @AfterReturning后置通知  
     * 有返回值  
     * 没有返回值  
    * @Around环绕通知  
    * @AfterThrowing异常抛出通知  
     * 没有获取异常信息  
     * 获取异常信息  
    * @After最终通知  
   * AOP的注解切入点的配置  
   * 定义多个切入点  
   * 一个通知同时定义到多个方法当中  
   * 当使用接口时与不使用接口内部代理区别使用接口  

	
		
