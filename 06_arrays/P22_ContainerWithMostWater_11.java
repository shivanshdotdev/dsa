public class P22_ContainerWithMostWater_11 {
    public static void main(String[] args){
        int[] height = {1, 2, 1};
        
        int max = height[0];
        int secondMax = height[0];
        int maxIndex = 0;
        int secondMaxIndex = 0;

        for (int i = 1; i < height.length; i++){
            int x = height[i];

            if (x > max){
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = x;
                maxIndex = i;
            }
            else if (x > secondMax && x < max){
                secondMax = x;
                secondMaxIndex = i;
            }
        }

        // System.out.println(max);
        // System.out.println(secondMax);

        int width = maxIndex - secondMaxIndex;
        if (width < 0){
            width *= -1;
        }

        if (width == 0){
            width = 1;
        }

        System.out.println(secondMax * width);
    }
}
