public class Index1 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= 2*n-1; i++){
            //First pattern
            int stars = (i>4)? (2*n-i): (i);
            int spaces = (i>4)? (2*i-2*n ):(2*n-2*i);

            //Stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*"+ " ");
            }
            //Spaces
            for(int k = 1; k <= spaces; k++){
                System.out.print("  ");
            }
            //Stars
             for(int l = 1; l <= stars; l++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
        
    }
}
