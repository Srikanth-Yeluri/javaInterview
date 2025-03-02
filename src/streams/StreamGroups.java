package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroups {
    public static void main(String[] args) {
        List<String> list= Stream.of("apple","banana","abcde","abcde","me").toList();

       Map<Integer,Long> res= list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
       System.out.println(res);
    }
}
