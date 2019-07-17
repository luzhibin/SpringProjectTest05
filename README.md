# SpringProjectTest05  
### SpringProject--->Test5  
### Spring测试工程5：Spring-AOP(面向切面编程)  
* **1.** 了解Spring-AOP内部原理：JDK动态代理和Cglib动态代理   
* **2.** 了解AOP的相关术语  
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
	

	

	
