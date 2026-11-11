public class Index1 {
    public static void main(String[] args) {
      int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 7; j++){
                
                if( (j==1 || j==7) || ((i+j==5) && (i!=4)) ||
            (j-i==3) && (i!=1 && i!=n)) {
                        System.out.print("* ");
                }else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
