package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author:ChengZhang
 * @date: 2019/5/2
 * @time: 22:31
 */
public class FunctionalInterface {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.filter((i) -> i > 2).forEach(System.out::println);


//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

    }
}
