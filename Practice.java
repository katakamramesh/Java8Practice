import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //avg of int
        System.out.println(Stream.of(1,2,3,4,5).mapToDouble(Integer :: doubleValue).average().getAsDouble());
        //convert string to uppercase
        System.out.println(Stream.of("qwe","asd","zxc").map(String :: toUpperCase).toList());
        //sum of all even and odd number
        System.out.println(Stream.of(1,2,3,4,5,6).filter(x -> x%2 == 0).mapToInt(Integer :: intValue).sum());
        //remove duplicates from the list
        System.out.println(IntStream.of(1,2,1,2,5,8,3,2,112,323).distinct().boxed());
        //largest number
        System.out.println(Stream.of(3,1,8,34,7,1).sorted(Comparator.reverseOrder()).skip(0).findFirst());
        //if any divide 6 true
        System.out.println(Stream.of(3,1,8,34,7,9).anyMatch(i -> i % 9 == 0));
    }
}
