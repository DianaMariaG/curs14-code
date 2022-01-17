package ro.fasttrackit.curs14.planner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Days day;
    private final List<String> activities;

    public DaySchedule (Days day, List<String> activities) {
        this.day = day;
        this.activities = activities == null
                ? new ArrayList<>()
                : new ArrayList<>(activities); //facem o copie pt ca nu stim ce tip e activities; si pt referance escape cineva poate modifica obiectul altfel
    }

    public Days getDay() {
        return day;
    }

    public List<String> getActivities() {
        return new ArrayList<>(activities);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }

    public void addActivity(String activity) { //o validare, daca nu e null il adaug, altfel nu il adaug
        if (activity != null) {
            this.activities.add(activity);
        }
    }
}
//eu cand ma uit la obiect nu ma uit la toata lumea cum il foloseste, imi zice el cum e folosit
//eu controlez ce intra in activitati: niciodata nu o sa am null in interiorul listei
