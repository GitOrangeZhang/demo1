package exercise;

import data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:35
 */
public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

//        list.forEach(System.out::println);

        list.forEach(ele -> {
            if (ele % 2 == 0){
                System.out.println(ele);
            }
        });
    }
}
