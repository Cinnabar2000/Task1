public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
        System.out.println("Task 2:");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
        System.out.println("Task 3:");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
        System.out.println("Task 4:");
        System.out.println(profitableGamble(0.2, 50.0, 9.0));
        System.out.println(profitableGamble(0.9, 1.0, 2.0));
        System.out.println(profitableGamble(0.9, 3.0, 2.0));
        System.out.println("Task 5:");
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
        System.out.println("Task 6:");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
        System.out.println("Task 7:");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println("Task 8:");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
        System.out.println("Task 9:");
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[0]));
        System.out.println("Task 10:");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1,2,3));
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static int triArea(int a, int h) {
        return a * h / 2;
    }

    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

    public static String operation(int n, int a, int b) {
        if (a + b == n) {
            return "added";
        } else if (a - b == n) {
            return "subtracted";
        } else if (a / b == n) {
            return "divided";
        } else if (a * b == n) {
            return "multiplied";
        } else {
            return "none";
        }
    }

    public static int ctoa(char c) {
        return c;
    }

    public static int addUpTo(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        return result;
    }

    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    public static int sumOfCubes(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * a[i] * a[i];
        }
        return result;
    }

    public static boolean abcmath(int a, int b, int c) {
        int result = 0;

        for(int i = 0; i < b; i++) {
            result += a * 2;
            a *= 2;
        }

        return result % c == 0;
    }
}