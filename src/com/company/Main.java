package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
            String input = " privet ded ";
            Function nice = new Function();
            System.out.print("Ex #1: ");
            System.out.println(nice.endWithEd(input));
            String input1 = " sosa mu3ik 6aby ";
            System.out.print("Ex #2: ");
            System.out.println(nice.getSum(input1));
            String input2 = " aaBCFF ";
            System.out.print("Ex #3: ");
            System.out.println(nice.getMaxLength(input2));
            String input3 = " Чудак Ярослав Алексеевич ";
            System.out.println("Ex #4: ");
            nice.Split(input3);
            System.out.print("Ex #5: ");
            System.out.println(nice.StrFromTwo("abcdq", "12345"));
        }
    }

