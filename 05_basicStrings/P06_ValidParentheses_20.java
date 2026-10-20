public class P06_ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "(]";

        int curveCount = 0;
        int squareCount = 0;
        int curlyCount = 0;

        int n = s.length();

        for (int i = 0; i < n; i++){
            switch (s.charAt(i)) {

                case '(':
                    curveCount++;
                    break;
                case ')':
                    curveCount--;
                    break;

                case '[':
                    squareCount++;
                    break;
                case ']':
                    squareCount--;
                    break;

                case '{':
                    curlyCount++;
                    break;
                case '}':
                    curlyCount--;
                    break;

                default:
                    break;
            }
        }

        if (curveCount < 0){
            curveCount *= -1;
        }
        if (squareCount < 0){
            squareCount *= -1;
        }
        if (curlyCount < 0){
            curlyCount *= -1;
        }
        

        if ((curlyCount + squareCount + curveCount) == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
