package home_work;

public class HomeWorkTree {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 3) || (i ==0 && j == 4))
                    System.out.print("*");
                else{
                    if (i == 1 && j >=2 && j <=5)
                        System.out.print("*");
                    if (i == 2 && j >= 1 && j<= 6)
                        System.out.print("*");
                    if (i == 3 && j <= n)
                        System.out.print("*");
                    if ((i == 4 && j ==3) ||(i == 4 && j == 4))
                        System.out.print("*");
                    if ((i == 0 && j <3) || (i == 1 && j < 2) || (i == 2 && j < 1))
                        System.out.print(" ");
                    if (i == 4 && j <3)
                        System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
