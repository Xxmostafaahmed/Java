public class Assignment {
    public static void main(String args[])  
    { 
        int i, j; 
        int n=5;
    
        for(i=1; i<=n; i++) // outer loop for rows
        { 
            // num=1; 
            for(j=1; j<=i; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(j+ " "); 
    
                //incrementing value of num 
                // num++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
    //    public static void main(String args[]) 
    // { 
    //     int n = 5; 
    //     printNums(n); 
    // } 
    
}
