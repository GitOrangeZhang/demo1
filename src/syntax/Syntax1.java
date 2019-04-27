package syntax;

import interfaces.*;

/**
 * @author:ChengZhang
 * @date: 2019/4/27
 * @time: 17:25
 */
public class Syntax1 {
    public static void main(String[] args) {
        //1.Lambda表达式的基础语法：
        //Lambda是一个匿名函数
        //参数列表 方法体

        // ()：用来描述参数列表
        // {}：用来描述方法体
        // ->：Lambda运算符，读作goes to

        //无参无返
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("Hello World!!!");
        };
        lambda1.test();

        //无返回值，单个参数
        LambdaNoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println(a);
        };
        lambda2.test(2);

        //无返回值，多个参数
        LambdaNoneReturnMutipleParameter lambda3 = (int a,int b) -> {
            System.out.println(a + b);
        };
        lambda3.test(10,20);

        //有返回值，无参数
        LambdaSingleReturnNoneParameter lambda4 = () -> {
            return "lambda4";
        };
        String result1 = lambda4.test();
        System.out.println(result1);

        //有返回值，单个参数
        LambdaSingleReturnSingleParameter lambda5 = (int a) -> {
            return a * 2;
        };
        int result2 = lambda5.test(10);
        System.out.println(result2);

        //有返回值，多个参数
        LambdaSingleReturnMutipleParameter lambda6 = (int a,int b) -> {
            return  a + b;
        };
        int result3 = lambda6.test(1,1);
        System.out.println(result3);
        
        what the fucking study!!!
    }
}
