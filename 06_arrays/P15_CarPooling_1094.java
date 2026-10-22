public class P15_CarPooling_1094 {
    public static void main(String[] args) {
        int[][] trips = {
            {2, 1, 5},
            {3, 3, 7}
        };

        int capacity = 4;

        int lastStop = trips[trips.length - 1][2];

        int tripCount = 0; // starting with 0 to match with the trips array index

        // i can be represented or seen as the the location point or pickup and drop point 
        for (int i = 1; i <= lastStop; i++){
            int passengers = trips[tripCount][0];
            int enterAt = trips[tripCount][1];
            int exitAt = trips[tripCount][2];

            if (enterAt == i){
                if (capacity <= passengers){
                    capacity = capacity - passengers;
                }
                else {
                    break;
                }
            }

            // TOO MUCH CONTENT IS NEEDED TO BE WORKED UPON 

            if (exitAt == i){
                capacity = capacity + passengers;
            }
        }
    }
}
