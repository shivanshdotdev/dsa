import java.util.ArrayList;
import java.util.List;

public class P05_FindWordsContainingCharacter_2942 {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';

        List<Integer> list = new ArrayList<>();

        int i = 0;
        for (String s : words){
            if (s.contains(String.valueOf(x))){
                list.add(i);
            }
            i++;
        }

        for (int q : list){
            System.out.println(q);
        }

    }
}
