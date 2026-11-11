public class Index1 {
    public static void main(String[] args) {
      int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 7; j++){
                
                if((i==j) || ((i+j==8) && (i!=4))) {
                        System.out.print("* ");
                }else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
