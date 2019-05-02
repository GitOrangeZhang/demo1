package exercise;

import data.Person;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:35
 */
public class Exercise5 {

    public static void main(String[] args) {
       // 需求：开辟一个线程，做一个数字的输出
        Thread thread = new Thread(() -> {
            for (int i = 0;i<10;i++){
                System.out.println(i);
            }
        });
        thread.start();


    }
}
