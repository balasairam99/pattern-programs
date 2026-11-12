public class Index1 {
    public static void main(String[] args) {
        //? UPPER PART
        int n = 4;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*"+" ");
            }
            for(int l = 1; l <= 2*n-2*i; l++){
                System.out.print(" ");
            }
            for(int m = 1; m <= i; m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //?MIDDLE PART
         int num = 8;

        String name = "AMUL";
        int value = num - name.length();
        
        for(int i = 1; i <= value/2; i++){
            System.out.print("* ");
        }

        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i) +" ");
        }
        for(int i = 1; i <= value/2; i++){
            System.out.print("* ");
        }
       System.out.println();

       //?LOWER PART
        for(int i = 1; i <= num; i++){
            //Spaces
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int k = 1; k <= num-i+1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
