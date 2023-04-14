package Template.front.events.template;

import javafx.event.EventType;

/**
 * Defines an abstract skeleton for the {@link TemplateEvent} class.
 */
public abstract class AbstractTemplateEvent extends javafx.event.Event {
    public static final EventType<AbstractTemplateEvent> ANY =
            new EventType<>(javafx.event.Event.ANY, "ANY");

    public static final EventType<AbstractTemplateEvent> INVALID_VALUE =
            new EventType<>(AbstractTemplateEvent.ANY, "INVALID_VALUE");

    public AbstractTemplateEvent(EventType<? extends javafx.event.Event> eventType) {
        super(eventType);
    }

    public abstract void invokeHandler(TemplateEventHandler handler);
}
