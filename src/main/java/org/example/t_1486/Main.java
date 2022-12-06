package org.example.t_1486;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int res = main.xorOperation(4, 3);
        System.out.println(res);

    }

    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }
}
