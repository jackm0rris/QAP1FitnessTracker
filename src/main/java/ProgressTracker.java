import java.util.List;

public class ProgressTracker {

    // method to calculate total calories burned
    public int calculateTotalCaloriesBurned(List<Workout> workouts) {
        int total = 0; // initialize total calories

        for (Workout w : workouts) {
            total += w.getCaloriesBurned(); // add each workout's calories
        }

        return total; // return final total
    }
}