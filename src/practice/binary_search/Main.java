package practice.binary_search;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        BinarySearchWithLoop binarySearchWithLoop = new BinarySearchWithLoop();
        System.out.println(binarySearchWithLoop.binarySearch(nums, 5));

        BinarySearchWithRecursion binarySearchWithRecursion = new BinarySearchWithRecursion();
        System.out.println(binarySearchWithRecursion.binarySearch(nums, 5));
    }
}
