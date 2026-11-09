public class Index1 {
    public static void main(String[] args) {
        int n = 5;
        //Stars
      
        for(int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j < i; j++){
                System.out.print("  ");
                
            }
            //Stars
            for(int j = 1; j <= 2*n - 2*i-1; j++){
                System.out.print("*"+" ");
            }System.out.println();
        }
        
        
    }
}
