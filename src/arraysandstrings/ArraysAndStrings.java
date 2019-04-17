package arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class ArraysAndStrings {

    public static boolean isUnique(String input) {
        Set<Character> stringSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) stringSet.add(input.charAt(i));

        if (input.length() == stringSet.size()) return true;
        return false;
    }

    public static boolean checkPermutation(String input1, String input2) {
        Set<Character> input1Set = new HashSet<>();
        Set<Character> input2Set = new HashSet<>();

        for (int i = 0; i < input1.length(); i++) input1Set.add(input1.charAt(i));
        for (int i = 0; i < input2.length(); i++) input2Set.add(input2.charAt(i));

        if (input1Set.containsAll(input2Set) && input2Set.containsAll(input1Set)) return true;
        return false;
    }

    public static String URLify(String input) {
        input = input.replaceAll("\\s", "%20");
        return input;
    }

    public static int[][] zeroMatrix(int[][] inputInts) {
        boolean[] row = new boolean[inputInts.length];
        boolean[] column = new boolean[inputInts[0].length];

        for (int i = 0; i < inputInts.length; i++) {
            for (int j = 0; j < inputInts[i].length; j++) {
                if (inputInts[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) if (row[i]) nullifyRow(inputInts, i);
        for (int j = 0; j < column.length; j++) if (column[j]) nullifyColumn(inputInts, j);


        return inputInts;
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }

    }

    private static void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }


}


