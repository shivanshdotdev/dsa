public class P07_FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        String s = "loveleetcode";

        int n = s.length();
        
        int[] hash = new int[26];
        int ans = -1;

        for (int i = 0; i < n; i++){
            hash[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < n; i++){
            if (hash[s.charAt(i) - 97] == 1){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
