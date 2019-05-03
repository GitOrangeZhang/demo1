package syntax;

import data.Person;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:17
 */
public class Syntax4 {
    public static void main(String[] args) {

        PersonCreater creater = () -> new Person();

        //构造方法引用
        PersonCreater creater1 = Person::new;
        Person a = creater1.getPerson();

        PersdonCreater2 creater2 = Person::new;
        Person b = creater2.getPerson("fuck",18);
    }

    
    interface PersonCreater{
        Person getPerson();
    }

    interface PersdonCreater2{
        Person getPerson(String name,int age);
    }
}

