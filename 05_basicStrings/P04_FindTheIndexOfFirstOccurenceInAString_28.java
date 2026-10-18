public class P04_FindTheIndexOfFirstOccurenceInAString_28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "tc";
        boolean found = false;

        int i = 0;
        int j = needle.length();

        while (j <= haystack.length()){
            String check = haystack.substring(i, j);
            if (needle.equals(check)){
                found = true;
                break;
            }
            i++;
            j++;
        }

        if (found){
            System.out.println(i);
        }
        else {
            System.out.println(-1);
        }
    }
}
