public class Index1 {
    public static void main(String[] args) {
      int n = 6;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 6; j++){
                
                if((i==1 || i==n) || ((i+j==7) && (i!=1 && i!=n))) {
                        System.out.print("* ");
                }else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
