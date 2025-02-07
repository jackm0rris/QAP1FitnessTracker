import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    @Test
    void testLogWorkout() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.logWorkout("Running", 45);
        assertEquals(1, tracker.getWorkouts().size());
    }

    @Test
    void testCalculateTotalCaloriesBurned() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.logWorkout("Running", 45);
        tracker.logWorkout("Hockey", 30);
        int totalCalories = tracker.getTotalCaloriesBurned();
        assertEquals(375, totalCalories);
    }

    @Test
    void testSetFitnessGoal() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.setFitnessGoal(750); // goal to burn 750 cals
        assertEquals(750, tracker.getFitnessGoal());
    }
}
