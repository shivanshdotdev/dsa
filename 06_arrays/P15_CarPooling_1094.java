public class P15_CarPooling_1094 {
    public static void main(String[] args) {
        // int[][] trips = {
        //     {2, 1, 5},
        //     {3, 3, 7}
        // };

        int[][] trips = {
            {4, 5, 6},
            {6, 4, 7},
            {4, 3, 5},
            {2, 3, 5}
        };

        int capacity = 13;

        int maxCapacity = capacity;

        int totalTrips = trips.length;

        int lastStop = 0;
        for (int i = 0; i < totalTrips; i++){
            int temp = trips[i][2];

            if (temp > lastStop){
                lastStop = temp;
            }
        }

        int tripCount = 0; // starting with 0 to match with the trips array index

        boolean breakOutNeeded = false;

        // i can be represented or seen as the the location point or pickup and drop point 
        for (int i = 1; i <= lastStop; i++){
            
            tripCount = 0;
            int peopleExiting = 0;
            int peopleEntering = 0;

            while (totalTrips > tripCount){
                
                int passengers = trips[tripCount][0];
                int enterAt = trips[tripCount][1];
                int exitAt = trips[tripCount][2];

                if (exitAt == i){
                    peopleExiting += passengers;
                }

                if (enterAt == i){
                    peopleEntering += passengers;
                }

                tripCount++;
            }

            capacity = capacity + peopleExiting - peopleEntering;

            if (capacity < 0 || capacity > maxCapacity){
                breakOutNeeded = true;
                break;
            }
        }

        System.out.println(!breakOutNeeded);
    }
}
