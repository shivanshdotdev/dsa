public class P07_CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        
        // you should also put if string == null in case you are taking input from the user on the go
        // since the str variable is already defined which is not going to null
        // that code is going to be dead code hence that check is not mentioned

        // ===============String Cleaning=================================

        int size = str.length();
        str = str.toLowerCase();

        // these characters are supposed to be removed 
        String toRemove = " ,.;:/";
        
        StringBuilder strbuilder = new StringBuilder();

        for (int i = 0; i < size; i++){
            char charcter = str.charAt(i);
            // if the character that we want to remove is stored in the character 
            // the below will return some 0 or non negative integer as its index is going to be in the toRemove string 
            // hence the condition will not met and it will be ignored
            // and if the character is something that we want to keep, which is not present in the toRemove string 
            // the indexOf() will return -1 hence the condition will met, and that character is kept and not removed
            if (toRemove.indexOf(charcter) == -1){
                strbuilder.append(charcter);
            }
        }

        // ===============Better String Cleaning===========================

        size = str.length();
        str = str.toLowerCase();

        StringBuilder betterStringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++){
            char character = str.charAt(i);
            // nothing much to explain, only keep the letter or numbers and that's it
            if (Character.isLetterOrDigit(character)){
                betterStringBuilder.append(character);
            }
        }

        // ===============================================================

        str = betterStringBuilder.toString();

        size = str.length();

        System.out.println(isPalindrome(str, 0, size-1));
    }

    private static boolean isPalindrome(String str, int leftLimit, int rightLimit){

        // if the both pointers crossed each other means half is complete and still every character were equal
        // hence it is a palindrome
        if (leftLimit >= rightLimit) return true;

        if (str.charAt(leftLimit) != str.charAt(rightLimit)) return false;

        return isPalindrome(str, leftLimit+1, rightLimit-1);
    }
}
