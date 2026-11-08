public class Index1 {
    public static void main(String[] args) {

        int n = 4;
       
           //Stars part-1
            for (int i = 1; i <= n; i++) {
               for(int j = 1; j <= i; j++){
                 System.out.print("*" +" ");
                }
                System.out.println();
            }
            //Stars part-2
            for(int i = 1; i <= n-1; i++){
                for(int j = 1;j <= n-i; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }


    }
}
