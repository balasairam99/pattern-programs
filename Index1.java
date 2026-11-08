public class Index1 {
    public static void main(String[] args) {

        int n = 5;

        for(int i = n; i >= 1; i--){
            //Spaces
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
