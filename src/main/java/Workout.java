public class Workout {
    private String type; // type of workout
    private int time; // in minutes
    private static final int CALORIES_RATE = 5; // calories burned per minute (not exact)

    public Workout(String type, int time) {
        this.type = type;
        this.time = time;
    }

    // method to get calories burned
    public int getCaloriesBurned() {
        int total = time * CALORIES_RATE; // multiplication for total burn
        return total;
    }

    // returns workout type
    public String getWorkoutType() {
        return type;
    }

    // returns how long the workout was
    public int getDuration() {
        return time;
    }
}
