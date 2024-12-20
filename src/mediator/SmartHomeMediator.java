package mediator;

import mediator.components.Component;

public interface SmartHomeMediator {

    void notify(String event, Component component);
}
