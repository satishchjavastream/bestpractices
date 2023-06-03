import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {

        //System.out.println("Welcome to Even Odd finding");
       /* int n=20;
        for (int i=1;i<=n;i++){
            System.out.println("i :"+i);
            if(i%2==0){
                System.out.println(i+": i is a even number.");
            }else{
                System.out.println(i+": i is a odd number.");
            }
        }*/

       // Java 8 Program to find Odd and Even Numbers from a List using stream
        /*List<Integer> numbers = Arrays.asList(1,6,3,8,22,35,101,46,67);

        List<Integer> odd = numbers.stream().filter(o -> o%2!=0).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(odd);

        List<Integer> even = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(even);*/

        //Java 8 Program to find Odd Numbers from an Array using streams
        /*int[] numbers = {1,6,3,8,22,35,101,46,67};

        Arrays.stream(numbers).filter(o->o%2!=0).forEach(System.out::println);
        System.out.println("====");
        Arrays.stream(numbers).filter(e->e%2==0).forEach(System.out::println);*/

        //Java 8 program to print odd and even numbers from a Set using stream
        Set<Integer> numbers = Set.of(1,6,3,8,22,35,101,46,67);

        Set<Integer> odd = numbers.stream().filter(o->o%2!=0).collect(Collectors.toSet());
        System.out.println(odd);
        Set<Integer> even = numbers.stream().filter(e->e%2==0).collect(Collectors.toSet());
        System.out.println(even);
    }
}
