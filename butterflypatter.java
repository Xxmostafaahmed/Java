public class butterflypatter {
    public static void main(String[] args) {
    int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            int spces =2*(n-i);
            for(int j=1; j<=spces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
  


        }

        for(int i=n; i>=1
        ; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            int spces =2*(n-i);
            for(int j=1; j<=spces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
  


        }

        
    }
    
}

// for star
// public class butterflypatter {
//     public static void main(String[] args) {
//     int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             int spces =2*(n-i);
//             for(int j=1; j<=spces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
  


//         }

//         for(int i=n; i>=1
//         ; i--){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             int spces =2*(n-i);
//             for(int j=1; j<=spces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
  


//         }

        
//     }
    
// }

