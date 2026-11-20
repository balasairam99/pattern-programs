public class Index1 {
    public static void main(String[] args) {
       
        for(int i = 1; i <= 6; i++){
            //N
            for(int j = 1; j <= 12; j++){

                if((j==1 || j== 6 )|| ((i==j) && (i>1 && i<6)) 
                || (j==7 || j==12) && (i!=1 && i!=6) 
                || (i==1 || i==6) && (j>7 && j<12)){
                    System.out.print("*"+ " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
           
     }
    
}
