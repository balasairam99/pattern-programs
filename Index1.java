public class Index1 {
    public static void main(String[] args) {

        int n = 4;
       //Upper part
       for(int i = 1; i <= n; i++){
        //Spaces
        for(int j = 1; j <= n-i; j++){
            System.out.print("  ");
        }
        //Starts
        for(int k = 1; k <= 2*i-1; k++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }

    //Lower part
    for(int i = n-1; i >= 1; i--){
        //Stars
        for(int j = n-1; j >= i; j--){
            System.out.print("  ");
        }
        //Stars
        for(int j = 1; j <= 2*i-1; j++){
            System.out.print("*"+ " ");
        }
        System.out.println();
    }

    
    }
}
