import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        boolean[] table = new boolean[arr.length];
        int[] output = new int[3];

        permutation(arr, output, table, 0, 5, 3);
    }

    static void permutation(int[] arr, int[] output, boolean[] table, int depth, int n, int r) {
        if (depth == r) {
            print(output);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!table[i]) {
                table[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, table, depth+1, n, r);
                table[i] = false;
            }
        }
    }
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

