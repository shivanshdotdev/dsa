public class P01_ReverseAStringInPlace {
    public static void main(String[] args) {
        // since strings is nothing but an array of characters 
        // in java, the strings are immutable hence this path is chosen
        char str[] = {'h', 'e' ,'l' ,'l' ,'o'};
        int len = str.length;

        for (int i = 0; i < len/2; i++){
            char s = str[i];
            str[i] = str[len-i-1];
            str[len - i - 1] = s;
        }

        System.out.println(str);
    }
}
