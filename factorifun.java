import java.util.Scanner;
public class factorifun {
    public static void printFactorial (int n){
        if(n<0){
            System.out.println("InvalidNo");
            return;
        }

       int  factorial=1;
        for(int i=1;i>=1;i--){
            factorial=factorial*i;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }

    
}
