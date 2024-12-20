package mediator;

import mediator.components.Alarm;
import mediator.components.Calendar;
import mediator.components.CoffeePot;

public class Demo {

    public static void main(String[] args) {
        SmartHomeController mediator = new SmartHomeController();

        // Create Components.
        Alarm alarm = new Alarm(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        Calendar calendar = new Calendar(mediator);

        // Register Components with Mediator.
        mediator.setAlarm(alarm);
        mediator.setCoffeePot(coffeePot);
        mediator.setCalendar(calendar);

        // Trigger Events.
        alarm.trigger("AlarmRings");
    }
}
