package course1.lesson2.homework2;

public class MethodSetUp {
    public static void main(String[] args) {

        int a = 3;
        int b = 10;
        inBetween10and20(a, b);
        positiveOrNegative(b);
        numberSign(b);
        printWord("Life is good!", a);
        System.out.println(checkoutLeapYear(2020));
    }

    public static boolean inBetween10and20(int n1, int n2) {
        int sum = n1 + n2;
        if (sum >= 10 & sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int positiveOrNegative(int n1) {
        if (n1 >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        return n1;
    }

    public static boolean numberSign(int x) {
        if (x < 0) {
            return true;
        }
        else if (x > 0) {
            return false;
        }
        return true;
    }
    public static void printWord(String word, int m) {
        for (int i = 0; i < m; i++) {
            System.out.println(word);
        }
    }
    public static boolean checkoutLeapYear(int year) {
        if (year % 4 == 0 & year % 100 == 1) {
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}