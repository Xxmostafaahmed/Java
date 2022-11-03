public class solidrhombuspattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for( int j=1; j<=n-i; j++){
                // 1st print spaces
                System.out.print("  ");
            }
            for( int  j =1; j<=5; j++){
                // for print pattern
                System.out.print("*");
            }
            System.out.println();

        }
       
    }
    
}
