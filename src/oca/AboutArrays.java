package oca;

public class AboutArrays {

    public static void main(String[] args) {

        int[][][] numbers = new int[7][20][4];

        int i = 3;
        numbers[4][17][0] = i++; // 3
        numbers[4][17][1] = i++; // 4
        numbers[4][17][2] = ++i; // 6
        numbers[4][17][3] = i++; // 6


        for(var a =0; a< numbers.length;a++ ) {
            var firstArray = numbers[a];
            for (int j = 0; j < firstArray.length; j++) {
                var nextArray = numbers[a][j];
                for (int k = 0; k < nextArray.length; k++) {
                    numbers[a][j][k] = a + j + k;
                }
            }

        }

        for(var a =0; a< numbers.length;a++ ) {
            var firstArray = numbers[a];
            for (int j = 0; j < firstArray.length; j++) {
                var nextArray = numbers[a][j];
                for (int k = 0; k < nextArray.length; k++) {
                    System.out.print(numbers[a][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
                System.out.println("-----------");
            }
            System.out.println("==========");
        }

        // System.out.println(numbers[0].length);

    }

}
