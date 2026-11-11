public class Index1 {
    public static void main(String[] args) {
      int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                
                if(((j==3) && (i>2)) || ((i==j) && (i>=1 && i<=2))
                || ((i+j==6) && (i>=1 && i<=2))) {
                        System.out.print("* ");
                }else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
