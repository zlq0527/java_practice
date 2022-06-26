package cn.Stream;

import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        int a=3;
        System.out.println(a+a++*++a);
    }
//    public static void main(String[] args) {
//        List<User> list = new ArrayList();
//        User a = new User("abc", 30, 3000);
//        User b = new User("b", 20, 1000);
//        User c = new User("c", 21, 3000);
//        list.add(a);
//        list.add(b);
//        list.add(c);
////        List<User> userList = list.stream().filter(user -> user.getAge() > 20)
////                .filter(user -> user.getSalary()>2000).collect(Collectors.toList());
////        System.out.println(userList);
////        List<String> list = Arrays.asList("hello", "world", "Java","hello","Jav");
////        Map<String, List<User>> map = list.stream().filter(user -> user.getSalary() > 1000).collect(Collectors.groupingBy(User::getName));
////        System.out.println(map);
//        List<String> collect = list.stream().map(User::getName).collect(Collectors.toList());
//        List<Integer> list1 = list.stream().map(User::getSalary).collect(Collectors.toList());
//        System.out.println(list1.stream().max(Integer::max).get());
////        System.out.println(collect);
//    }

}
