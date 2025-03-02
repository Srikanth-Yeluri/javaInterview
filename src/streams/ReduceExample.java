package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        List<Object> list= Arrays.asList("sri",12,34,6,8,90);

       // list.stream().filter(var ->var instanceof Integer).map(e->(int) e).map(x->x*x)
         //       .forEach(t->System.out.print(" "+t));
       int res= list.stream().filter(var ->var instanceof Integer).map(e->(int) e).
                map(x->x*x).reduce(1,(b,ca)->b*ca);
       System.out.println(res);
    }

}
