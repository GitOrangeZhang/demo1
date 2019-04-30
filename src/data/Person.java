package data;

/**
 * @author:ChengZhang
 * @date: 2019/4/30
 * @time: 23:08
 */
public class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("Person类的无参构造方法执行了！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的有参构造方法执行了！");
    }
}
