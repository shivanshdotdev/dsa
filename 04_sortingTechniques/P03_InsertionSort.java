public class P03_InsertionSort {
    public static void main(String[] args) {
        int array[] = {7, 4, 1, 5, 3};
        int size = array.length;

        // humko pata hai ki kitte elements hai array mein and since har element pe iterate karna hai 
        // to we know ki kitte iterations karne honge hence for loop ka use kara gya hai 
        for (int i = 0; i < size; i++){
            int currentElement = array[i];
            int j = i - 1;

            // humko exactly nhi pata ki upar wale loop ne jis element ko pick kara hai uski sahi position kya hai 
            // uski sahi position hai usse bada aur usse chote element ke beech mein 
            // to humko exact nhi pata ki wo position kab aayegi jis case mein number of iterations jo hai wo unknown hai 
            // hence while loop ka use karenge 
            while (j >= 0 && array[j] > currentElement){
                // agar reverse mein element bada hai current element se to uski ek shift kardo aage 
                // taaki current element ke liye jagah ho jaye
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentElement;
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}
