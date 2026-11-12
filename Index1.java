public class Index1 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        //%[alignment][width][type]
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.format( "%-3s"," ");
            }
            // Numbers
            for (int k = 1; k <= i; k++) {
              //  System.out.print(num + "  ");
                System.out.format("%-6d",num);
                num++;
            }

            System.out.println();
        }

    }
}
