import java.util.Scanner;
public class arraysecond {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc .nextInt();
        int  number[] = new int[size];
        // for input
        for(int i=0; i<size;i++){
            number[i]= sc.nextInt();
        }
        // for output
        for(int i=0; i<size; i++){
            System.out.println(number[i]);

        }
    }
    
}
