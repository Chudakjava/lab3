package com.company;

import java.util.Locale;

public class Function {
    public Function() {
    }

    public boolean endWithEd(String input) {
        input = input.toLowerCase(Locale.ROOT).trim();
        return input.endsWith("ed");
    }
    //==================================================
    public boolean isDigit(int c) {
        String digits = "1234567890";

        for(int i = 0; i < digits.length(); i++) {
            if (c == digits.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public int getSum(String input) {
        int sum = 0;

        for(int i = 0; i < input.length(); i++) {
            if (this.isDigit(input.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
    //==================================================
    public int getMaxLength(String input) {
        input = input.trim();
        int count = 0;
        int max = 0;
        char temp = input.charAt(0);

        for(int i = 1; i < input.length(); i++) {
            if (temp == input.charAt(i)) {
                ++count;
            } else {
                temp = input.charAt(i);
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    //==================================================
    public void Split(String input) {
        input = input.trim();
        String[] words = input.split(" ");
        System.out.println("Исходная строка: " + input + "\nРезультат: ");
        String[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String word = var3[var5];
            System.out.println(word);
        }
    }
    //==================================================
    public String StrFromTwo(String str1, String str2) {
        int max = Math.max(str1.length(), str2.length());
        String str = "";

        for(int i = 0; i < max; i++) {
            str = str + str1.charAt(i);
            str = str + str2.charAt(i);
        }
        return str;
    }
}

