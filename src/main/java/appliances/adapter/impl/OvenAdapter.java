package appliances.adapter.impl;

import appliances.adapter.IAppliance;
import appliances.thirdparty.Oven;

public class OvenAdapter implements IAppliance {
    private Oven oven;
    private boolean on;
    public OvenAdapter(Oven oven) {
        this.oven = oven;
        this.on = false;
    }

    public void turnOn() {
        oven.heatUp();
        this.on = true;
    }

    public void turnOff() {
        oven.heatUp();
        this.on = false;
    }

    public String getStatus() {
        return on ? "The oven is on" : "The oven is off";
    }
}
