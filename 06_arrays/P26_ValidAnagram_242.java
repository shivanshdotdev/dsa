import java.util.Arrays;

public class P26_ValidAnagram_242 {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
