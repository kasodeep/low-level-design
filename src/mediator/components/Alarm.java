package mediator.components;

import mediator.SmartHomeMediator;

public class Alarm extends Component {

    public Alarm(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void trigger(String event) {
        System.out.println("[Alarm] Event triggered: " + event);
        mediator.notify(event, this);
    }
}
