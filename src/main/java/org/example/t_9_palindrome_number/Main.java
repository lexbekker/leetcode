package org.example.t_9_palindrome_number;

/**
 * Учитывая целое число x, верните true, если x является целым числом палиндрома.
 *
 * Целое число является палиндромом, когда оно читается одинаково как в обратном, так и в прямом направлении.
 *
 * Например, 121 - это палиндром, а 123 - нет.
 */
public class Main {



    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        char[] chars = String.valueOf(x).toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (res == x) || (x == res / 10);
    }

}
