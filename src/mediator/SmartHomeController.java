package mediator;

import mediator.components.Alarm;
import mediator.components.Calendar;
import mediator.components.CoffeePot;
import mediator.components.Component;

public class SmartHomeController implements SmartHomeMediator {

    private Alarm alarm;

    private CoffeePot coffeePot;

    private Calendar calendar;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void notify(String event, Component component) {
        if (component == alarm && event.equals("AlarmRings")) {
            System.out.println("[Mediator] Alarm rings. Triggering coffee pot...");
            coffeePot.trigger("BrewCoffee");
            calendar.trigger("CheckMeetings");
        } else if (component == coffeePot && event.equals("CoffeeReady")) {
            System.out.println("[Mediator] Coffee is ready. Enjoy your drink!");
        } else if (component == calendar && event.equals("MeetingsChecked")) {
            System.out.println("[Mediator] Calendar checked. Your first meeting is at 9:00 AM.");
        }
    }
}
