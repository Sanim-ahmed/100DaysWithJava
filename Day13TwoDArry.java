public class Day13TwoDArry {
    public static void main(String[] args) {
        int [] [] number = new int [3] [3];

        number [0][0] =1;
        number [0][1] =0;
        number [0][2] =0;
        number [1][0] =0;
        number [1][1] =1;
        number [1][2] =0;
        number [2][0] =0;
        number [2][1] =0;
        number [2][2] =1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print(" "+number[row][col]);

            }
            System.out.println();

        }
    }
}
