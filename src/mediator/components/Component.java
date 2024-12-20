package mediator.components;

import mediator.SmartHomeMediator;

public abstract class Component {
    protected SmartHomeMediator mediator;

    public Component(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void trigger(String event);
}
