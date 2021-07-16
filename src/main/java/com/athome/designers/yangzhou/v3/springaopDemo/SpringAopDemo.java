package com.athome.designers.yangzhou.v3.springaopDemo;

/**
 * @Author:
 * @Date: 2021/7/10 15:35
 * @Description:
 * spring4 的aop执行流程：spring4  ---- springboot1.x.x
 * 正常情况：环绕通知前半部分在before之前，前置通知，后半部分在前置后置之间，后置通知，返回通知（AfterReturning）,，
 * 异常情况：环绕通知前半部分在before之前，前置通知，后置通知，异常通知  (AfterThrowing)，，，
 *
 * spring5 的aop执行流程：spring5 --- spring2.x.x
 * 正常情况：1.返回通知和后置通知顺序调换，2.环绕通知后半部分在最后
 * 异常情况：同上1
 *
 */
public class SpringAopDemo {

}
