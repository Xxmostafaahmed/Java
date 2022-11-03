 import java.util.Scanner;
//  sum of two numbers
 public class Function{
    public static int calculatSum(int a , int b) {
        int sum= a+b;
        return sum;
        
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum=calculatSum(a, b);
        System.out.println(sum);



    }
}