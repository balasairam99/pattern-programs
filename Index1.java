public class Index1 {
    public static void main(String[] args) {
        int n = 4;
       for(int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //Numbers
            for(int k = i; k >= 1; k--){
                System.out.print(k+" ");
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l+" ");
            }
            System.out.println();
       }
       

        
         
        
    }
}
