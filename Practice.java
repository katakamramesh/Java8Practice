import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //avg of int
        System.out.println(Stream.of(1,2,3,4,5).mapToDouble(Integer :: doubleValue).average().getAsDouble());
        //convert string to uppercase
        System.out.println(Stream.of("qwe","asd","zxc").map(String :: toUpperCase).toList());
        //sum of all even and odd number
        System.out.println(Stream.of(1,2,3,4,5,6).filter(x -> x%2 == 0).mapToInt(Integer :: intValue).sum());
    }
}
