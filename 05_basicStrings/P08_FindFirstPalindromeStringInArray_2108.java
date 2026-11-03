public class P08_FindFirstPalindromeStringInArray_2108 {

    public static void main(String[] args) {

        String[] words = {"abc","car","ada","racecar","cool"};
        
        for (String str : words){
            if (isPalindrome(str)){
                System.out.println(str);
            }
        }

        System.out.println("");
    }

    private static boolean isPalindrome(String s){
        int len = s.length();
        int half = len / 2;

        for (int i = 0; i < half; i++){
            if (s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }

        return true;
    }
}
