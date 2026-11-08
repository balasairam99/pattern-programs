public class Index1 {
    public static void main(String[] args) {

        int n = 5;
        int value = 2;
        int num = 2;
        //Upper half
        for(int i = 1; i <= n; i++){
            //Stars
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            //Spaces
            
            for(int k = 1; k <= 2*n-value;k++){
                System.out.print("  ");
            } 
            value+=2;
            //Stars
            for(int l = 1; l <= i; l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //Lower half
        
        for(int i = 1; i <= n-1; i++){
            //Stars
            for(int j = 1; j <= n-i; j++){
                System.out.print("*" +" ");
            }
            //Spaces
            for(int k = 1; k <= num; k++){
                System.out.print("  ");
            }
            num+=2;
            //Stars
            for(int l = 1; l <= n-i; l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}
