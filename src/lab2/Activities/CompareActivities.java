package lab2.Activities;


public class CompareActivities {
    private int cal;

    public CompareActivities(int cal) {
        this.cal = cal;
    }

    /**
     * The method checks the type of the activity and based on this type it calculates the difference between the attribute
     * of the class (cal) and the value returned by calculateCalories called on the corresponding activity.
     * @param  type  specifies the type of the activity (the possible types are provided in the ActivityType enum)
     * @param  v     variable parameter (may contain 0 to n elements and functions as an array) representing the values
     *               of the attributes for the respective activity
     * @return       the difference between the attribute of the class and the value returned by calculateCalories called on
     *               the corresponding activity
     */
    public int compare(ActivityType type, int... v) {
        return 0;
    }
}
