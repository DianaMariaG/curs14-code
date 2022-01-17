package ro.fasttrackit.curs14.planner;

import ro.fasttrackit.curs14.planner.exceptions.NoActivityException;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private final List<DaySchedule> days;

    public DailyPlanner() {
        this.days = new ArrayList<>(); //agenda goala
    }

    public void addActivity (Days day, String activity) throws NoActivityException {
        if (activity == null) {
            throw new NoActivityException("null activity not accepted");
        }
        DaySchedule daySchedule = findSchedule(day);
        if (daySchedule == null) {
            this.days.add(new DaySchedule((day, List.of(activity))));
        } else {
            // daySchedule.getActivities().add(activity) se incalca incapsularea> pot actiona asupra lui DauSchedule intr-un mod pe care DauSchedule nu-l controleaza; DaySchedule e imutabil si asa pot face cu obiectul mai mult decat zice el
            daySchedule.addActivity(activity);
        }
    }

    private DaySchedule findSchedule(Days day) {
        for (DaySchedule schedule : days) {
            if (schedule.getDay() == day){
                return schedule;
            }
        }
        return null;
    }
}
