package Printing;
// pattern practice.
public class Pat {
    public static void main(String[] args) {
        int n = 5;
        //pattern1(n);
      // pattern2(n)
        // pattern3(n);
       //pattern4(n);
       // pattern5(n);
       // pattern6(n);
       // pattern7(n);
    }

    private static void pattern7(int n) {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int spc=1;spc<=space;spc++)
            {
                System.out.print(" ");
            }

            for(int col=row;col>=1;col--)
            {
                System.out.print(col);

            }
            for(int j=2;j<=row;j++)
            {
                System.out.print(j);
            }
            System.out.println();


        }

    }

    private static void pattern6(int n) {
        for(int row=1;row<=2*n-1;row++)
        {
            int c=(row>n)?(2*n-row):(row);
            for(int col=1;col<=c;col++)
            {
                System.out.print("*");
            }

            int space=(row<=n)?(2*n-2*row):(2*row-2*n);
            for(int spc=1;spc<=space;spc++)
            {
                System.out.print(" ");
            }
             c=(row>n)?(2*n-row):(row);
            for(int col=1;col<=c;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int row=1;row<=2*n-1;row++)
        {
            int space=(row<=n)?(n-row):(row-n);
            for(int spc=1;spc<=space;spc++)
            {
                System.out.print(" ");
            }
            int c=(row>n)?(2*n-row):(row);
            for(int col=1;col<=c;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void pattern4(int n) {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int spc=1;spc<=space;spc++)
            {
                System.out.print("");
            }
            int c=(2*row)-1;
            for(int col=1;col<=c;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int spc=1;spc<=space;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

        private static void pattern2(int n){
            for (int row = 1; row <= 2 * n - 1; row++) {

                int c =(row > n ? n - (row - n) : row);

                for (int col = 1; col <= c; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

}
