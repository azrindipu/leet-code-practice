package practice.recursion;

public class AllPossibleCombination {
    public static void main(String[] args) {
        System.out.println("First Test");
        char[] set1 = {'a','b'};
        int k = 3;
        generateAllPossibleString(set1, "", set1.length, k);
    }

    static void generateAllPossibleString(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];
            generateAllPossibleString(set, newPrefix, n, k - 1);
        }
    }
}
