public class Index1 {
    public static void main(String[] args) {
       
        int n = 5;
        for(int i = 1; i <= n; i++){
            int start = i;
            int dec = n-1;
            for(int j = 1; j <= i; j++){

                System.out.print(start +  " ");
               
                start = start + dec;
                 dec--;
            }
            System.out.println();
        }
        System.out.println();
    }
}
