package two_pointers.Valid_Palindrome;

public class Valid_Palindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        //a=97 z=122 and 0=48 9=57 and A=65 Z=90
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) >= 97 && s.charAt(i) <=122) || (s.charAt(i) >= 48 && s.charAt(i) <=57)){
                stringBuilder.append(s.charAt(i));
            }
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                stringBuilder.append((char)(s.charAt(i) + 32));
            }
        }
        int leftPointer = 0;
        int rightPointer = stringBuilder.length()-1;
        while (rightPointer > leftPointer){
            if(stringBuilder.charAt(leftPointer) != stringBuilder.charAt(rightPointer)) return false;
            rightPointer--;
            leftPointer++;
        }
        return true;
    }
}