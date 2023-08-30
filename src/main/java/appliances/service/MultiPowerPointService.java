package appliances.service;

import appliances.adapter.IAppliance;

import java.util.ArrayList;
import java.util.List;

public class MultiPowerPointService {

    private List<IAppliance> appliances;

    public MultiPowerPointService() {
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(IAppliance appliance) {
        appliances.add(appliance);
    }

    public List<IAppliance> getAppliances() {
        return this.appliances;
    }
    public void on() {
        for (IAppliance appliance : appliances) {
            appliance.turnOn();
        }
    }

    public void off() {
        for (IAppliance appliance : appliances) {
            appliance.turnOff();
        }
    }

    public void printStatus() {
        System.out.println("Appliances status from MultiPowerPointService:");
        for (IAppliance appliance : appliances) {
            System.out.println(appliance.getStatus());
        }
    }

}
