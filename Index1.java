public class Index1 {
    public static void main(String[] args) {
       
        
            int n = 5;
            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= i; j++){
                    int start = 1;

                    for(int k = 1; k < j; k++){
                        int size = n-k+1;
                        start = size + start;
                    }

                    int offset = i-j;
                    int currentColSize = n-j+1;
                    int value;
                    if(j%2 !=0){
                        value = start + offset;
                    }else{
                        value = start + currentColSize -1 -offset;
                    }
                    System.out.print(value + " ");
                }
                System.out.println();
            }
     }
    
}
