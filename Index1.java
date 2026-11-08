public class Index1 {
    public static void main(String[] args) {

        int n = 5;
       
        for(int i = n; i >= 1; i--){
            //Spaces
            for(int j = n; j > i; j--){
                System.out.print("  ");
            }
            //Stars
            for(int k = (2*i-1); k >= 1; k--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
           


    }
}
