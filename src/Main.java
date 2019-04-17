import arraysandstrings.ArraysAndStrings;

public class Main {

    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        int counter = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = counter++;
//                System.out.print(ints[i][j] + " ");
            }
//            System.out.println();
        }
        ints[2][2] = 0;
        ints[3][3] = 0;
        int[][] zeroMatrix = ArraysAndStrings.zeroMatrix(ints);
        for (int i = 0; i < zeroMatrix.length; i++) {
            for (int j = 0; j < zeroMatrix[i].length; j++) {
                System.out.print(zeroMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
