package app.models;

import app.enamHelper.Day;
import app.service.AdviseService;

public class AdviseForDay implements AdviseService {

    @Override
    public void printAdvise(Day day) {
        switch (day){
            case MONDAY:
                System.out.println("You can!");
                break;
            case TUESDAY:
                System.out.println("A little bit more!");
                break;
            case WEDNESDAY:
                System.out.println("YO-HO!!! It is a little Friday!");
                break;
            case THURSDAY:
                System.out.println("Do something!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY,SUNDAY:
                System.out.println("You can go to the parc!");
                break;
        }
    }
}
