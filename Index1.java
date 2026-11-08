public class Index1 {
    public static void main(String[] args) {

        int n = 4;
       
        for(int i = 1; i <= 2*n-1; i++){

            int spaces = (i>4)? (i-n) :(n-i);
            int stars = (i<=4)? (2*i-1): (2*(2*n-i)-1);
            //Spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            //Stars
            for(int k = 1; k <= stars; k++){
                System.out.print("*");
            }
            System.out.println();
        }
           


    }
}
