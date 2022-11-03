import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(n);

    }
    // method one
    // public static void main(String[] args) {
    //     int n=11;
    //     if(n%2==0){
    //         System.out.println("even");
    //     }else{
    //         System.out.println("odd");
    //     }
    // }
    
}
