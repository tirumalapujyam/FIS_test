package appliances.adapter.impl;

import appliances.adapter.IAppliance;
import appliances.thirdparty.Blender;

public class BlenderAdapter implements IAppliance {
    private Blender blender;
    private boolean on;
    public BlenderAdapter(Blender blender) {
        this.blender = blender;
        this.on = false;
    }

    public void turnOn() {
        blender.swizzle();
        this.on = true;
    }

    public void turnOff() {
        blender.swizzle();
        this.on = false;
    }

    public String getStatus() {
        return on ? "The blender is on" : "The blender is off";
    }
}
