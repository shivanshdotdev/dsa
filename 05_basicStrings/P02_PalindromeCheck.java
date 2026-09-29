public class P02_PalindromeCheck {
    public static void main(String[] args) {
        String s = "aabbaaa";
        int len = s.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len/2; i++){
            if (s.charAt(i) != s.charAt(len - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
        
    }
}
