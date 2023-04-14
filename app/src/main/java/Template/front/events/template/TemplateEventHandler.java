package Template.front.events.template;

/**
 * Defines an event handler for the {@link TemplateEvent}.
 * <p>
 * Usage example :
 * [NODE].addEventHandler(InvalidInputEvent.[EVENT_NAME], event -> {
 * [some code to execute when receiving the event]
 * });
 * where [NODE] is the targeted node and [EVENT_NAME] is the exact name of the event. [EVENT_NAME] must be a public,
 * static attribute of the {@link AbstractTemplateEvent} class.
 */
public abstract class TemplateEventHandler implements javafx.event.EventHandler<TemplateEvent> {
    @Override
    public void handle(TemplateEvent event) {
        event.invokeHandler(this);
    }

    public abstract void onEvent();
}
