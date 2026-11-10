public class Index1 {
    public static void main(String[] args) {
      int n = 8;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                
                if(((j==1 || j==5) && (i!=1 && !(i>6))) ||
            ((i==1 || i==7) && (j>1 && j<5)) || (i==6 && j==2) ||
        (i==8 && j==4)) {
                        System.out.print("* ");
                }else{
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
