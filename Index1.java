public class Index1 {
    public static void main(String[] args) {

        int n = 5;
       
           
            for (int i = 1; i <= 2*n-1; i++) {
               
                int value = (i>n)?2*n -i : i;
                //Stars
               for(int k = 1; k <= value; k++){
                 System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}
