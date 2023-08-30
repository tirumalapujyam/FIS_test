package appliances.adapter.impl;

import appliances.thirdparty.Toaster;
import appliances.adapter.IAppliance;

public class ToasterAdapter implements IAppliance {
    private Toaster toaster;
    private boolean on;
    public ToasterAdapter(Toaster toaster) {
        this.toaster = toaster;
        this.on = false;
    }

    public void turnOn() {
        toaster.startToasting();
        this.on = true;
    }

    public void turnOff() {
        toaster.startToasting();
        this.on = false;
    }

    public String getStatus() {
        return on ? "The toaster is on" : "The toaster is off";
    }
}
