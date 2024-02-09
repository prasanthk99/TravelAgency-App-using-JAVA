package travelagency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("Destination: " + name);
        for (Activity activity : activities) {
            activity.printDetails();
        }
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
