package syntax;

import interfaces.LambdaSingleReturnMutipleParameter;

/**
 * @author:ChengZhang
 * @date: 2019/4/27
 * @time: 20:12
 */
public class Syntax2 {

    public static void main(String[] args) {
        //lambda语法精简
        //1.参数类型在接口中已经定义好了，可以省略；
        //2.只有一个参数的时候可以省略掉小括号；
        //3.方法体只有一句话的时候可以省略掉大括号，如果唯一的一条语句是return的话，可以直接省略return关键字。

        LambdaSingleReturnMutipleParameter lambda = (a,b) -> a + b;
        int c = lambda.test(10,20);
        System.out.println(c);
    }
}
