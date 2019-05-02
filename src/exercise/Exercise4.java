package exercise;

import data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:35
 */
public class Exercise4 {

    public static void main(String[] args) {
       // 需求：删除集合中满足条件的元素
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("詹姆斯",34));
        list.add(new Person("科比",38));
        list.add(new Person("库里",31));
        list.add(new Person("杜兰特",30));

        //删除集合中年龄大于31岁的球员
        //1.循环实现
        ListIterator<Person> it =  list.listIterator();
        while (it.hasNext()){
            Person ele = it.next();
            if (ele.age>31){
                it.remove();
            }

        }

        //2.lambda实现
        list.removeIf(ele -> ele.age > 31);
        System.out.println(list);

    }
}
