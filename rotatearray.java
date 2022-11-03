public class rotatearray{
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        rotatek(arr,3);
        System.out.println(arr);

    }
    public static void rotate1(int[] arr) {
        int  m=arr[arr.length-1];
        for(int i=arr.length-1; i>=1;i--){
            arr[0]=arr[i-1];
        }

      arr[0]=m;
        
    }
    public static void rotatek(int[] arr, int k) {
        for(int i=0; i<k; i++){
            rotate1(arr);
        }

        
    }

}