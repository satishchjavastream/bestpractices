import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        // given number is a prime number or not ?
        /*int n = 19;
        boolean primeCheck = isPrimeNumber(n);
        if(primeCheck){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }*/

        //Display all the prime number from the given below numbers from 2 to 50
        System.out.println("Please enter the number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //List<Integer> primeNumbers = findPrimeNumbers(n);
        List<Integer> primeNumbers = primeNumberList(n);

        System.out.println("List of prime numbers :"+primeNumbers);
    }

    /*private static List<Integer> findPrimeNumbers(int n) {
        List<Integer> pNums = new LinkedList<>();
        if(n>=2){
            pNums.add(2);
        }
        for (int i=3;i<=n;i+=2){
            if(isPrimeNumber(i)){
                pNums.add(i);
            }
        }
        return pNums;
    }

    private static boolean isPrimeNumber(int n){
        System.out.println(".... n :"+n);
        for (int i=2;i*i<=n;i++){
            System.out.println(".... i: "+i);
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
*/
    private static List<Integer> primeNumberList(int number){
        return IntStream.rangeClosed(2,number).filter(x->isPrime(x)).boxed().collect(Collectors.toList());
    }
    private static boolean isPrime(int number){
        return IntStream.rangeClosed(2,(int)(Math.sqrt(number))).allMatch(i -> number % i!=0);
    }
}
