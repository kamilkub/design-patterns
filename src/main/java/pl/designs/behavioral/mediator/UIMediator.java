package pl.designs.behavioral.mediator;

import java.util.List;
import java.util.Optional;
public class UIMediator {

    private final List<UIControl> controls;

    public UIMediator(UIControl ...controls) {
        this.controls = List.of(controls);
    }

    public void setControlValue(UIControl uiControl, String value) {
        Optional<UIControl> control = controls.stream()
                .filter(thisControl -> thisControl.equals(uiControl))
                .findFirst();

        if(control.isEmpty()) {
            return;
        }

        control.get().setValue(value);
    }


}
