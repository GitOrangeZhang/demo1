package exercise;

import data.Person;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:35
 */
public class Exercise2 {
    //集合排序
    //TreeSet
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(((o1, o2) -> o1.age - o2.age));

        set.add(new Person("詹姆斯",34));
        set.add(new Person("科比",38));
        set.add(new Person("库里",31));
        set.add(new Person("杜兰特",30));


        System.out.println(set);
    }
}
