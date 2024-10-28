import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Integer> ll = List.of(4,6,1,3,2,32);

        List<String> l = List.of("afds","zxcdsghj","erert");

        ll.stream().filter(n -> n/2 == 0).forEach(System.out :: print);//even number

        ll.stream().map(m -> m *2).forEach(System.out :: println);//multiple of numbers

        Integer reduce = ll.stream().reduce(0, Integer::sum);//sum of numbers

        ll.stream().reduce(Integer.MIN_VALUE,(a,b) -> a>b? a:b);//give max value

        ll.stream().reduce(Integer.MAX_VALUE,(a,b) -> a>b? a:b);//give min value

        System.out.println(ll.stream().filter(x -> x % 2 == 1 ).reduce(0, Integer :: sum));//sum of odd numbers

        System.out.println(ll.stream().map(x -> x * x ).reduce(0, Integer :: sum));//square of numbers

        ll.stream().distinct().forEach(System.out :: println);//print distinct number

        ll.stream().distinct().sorted().forEach(System.out :: println);//sorted number

        l.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println); //sort in reverse order

        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out :: println);//sort as per length

        System.out.println(ll.stream().map(n -> n * n).toList());//square and return as list
    }
}
