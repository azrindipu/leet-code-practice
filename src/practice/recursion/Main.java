package practice.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calling print normal");
        print(10);

        System.out.println("Calling print reverse");
        printReverse(10);

        System.out.println("Calling sum");
        System.out.println(sum(10));

        System.out.println("Calling fibonachi");
        System.out.println(fib(10));
    }

    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n - 1);
    }

    public static void printReverse(int n) {
        if (n == 0) return;
        printReverse(n - 1);
        System.out.println(n);
    }

    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
