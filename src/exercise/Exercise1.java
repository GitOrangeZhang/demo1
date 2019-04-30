package exercise;

import data.Person;

import java.util.ArrayList;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:35
 */
public class Exercise1 {
    //集合排序
    //ArrayList<>
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("詹姆斯",34));
        list.add(new Person("科比",38));
        list.add(new Person("库里",31));
        list.add(new Person("杜兰特",30));

        list.sort(((o1, o2) -> o1.age-o2.age));

        System.out.println(list);
    }
}
