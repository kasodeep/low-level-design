package mediator.components;

import mediator.SmartHomeMediator;

public class Calendar extends Component {

    public Calendar(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void trigger(String event) {
        if (event.equals("CheckMeetings")) {
            System.out.println("[Calendar] Checking today's meetings...");
            mediator.notify("MeetingsChecked", this);
        }
    }
}
