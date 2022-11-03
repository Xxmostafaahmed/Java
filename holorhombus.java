public class holorhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
                if(i==1||i==n){
                    for(j=1; j<=n;j++){
                        System.out.print("*");
                        
                    }
                
                }else{
                    for( j =1; j<=n; j++){
                        if(j==1||j==n){
                            System.out.print("*");
                            
                        }else{
                            System.out.print(" ");
                        }
                    }

                }
            }
            System.out.println();
           

        }
    }
//     public static void mholorhombus(int rows) {
        

//       int i, j;
//     for (i=1; i<=rows; i++)
//     {
//         // Print trailing spaces
//         for (j=1; j<=rows - i; j++)
//             System.out.print(" ");
          
//         // Print stars after spaces
//         // Print stars for each solid rows
//         if (i==1 || i==rows)
//             for (j=1; j<=rows; j++)
//                 System.out.print("*");
              
//         // stars for hollow rows
//         else
//             for (j=1; j<=rows; j++)
//                 if (j==1 || j==rows)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//         // Move to the next line/row
//         System.out.println();
//     }
// }
}