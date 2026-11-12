public class Index1 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*"+" ");
            }
            for(int l = 1; l <= 2*n-2*i; l++){
                System.out.print(" ");
            }
            for(int m = 1; m <= i; m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int num = 8;
        for(int i = 1; i <= num; i++){
            //Spaces
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int k = 1; k <= num-i+1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
