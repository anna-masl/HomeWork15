package app;

import app.enamHelper.Day;
import app.models.AdviseForDay;
import app.service.AdviseService;

public class SolutionHomeWork15 {
    public static void main(String[] args) {
        AdviseService day = new AdviseForDay();
        day.printAdvise(Day.SUNDAY);
    }
}
