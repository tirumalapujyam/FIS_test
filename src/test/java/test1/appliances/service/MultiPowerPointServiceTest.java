package test1.appliances.service;

import appliances.adapter.IAppliance;
import appliances.adapter.impl.BlenderAdapter;
import appliances.adapter.impl.OvenAdapter;
import appliances.adapter.impl.ToasterAdapter;
import appliances.service.MultiPowerPointService;
import appliances.thirdparty.Blender;
import appliances.thirdparty.Oven;
import appliances.thirdparty.Toaster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiPowerPointServiceTest {
    MultiPowerPointService testService;

    @BeforeEach
    void init(){
        testService = new MultiPowerPointService();
        testService.addAppliance(new BlenderAdapter(new Blender()));
        testService.addAppliance(new ToasterAdapter(new Toaster()));
        testService.addAppliance(new OvenAdapter(new Oven()));
    }

    @Test
    void testGetAppliancesMethod_forEmpty(){
        testService = new MultiPowerPointService();
        Assertions.assertTrue(testService.getAppliances().isEmpty());
    }

    @Test
    void testApplianceInitStatusShouldBeOff(){
        List<IAppliance> appliances = testService.getAppliances();
        for (IAppliance appliance : appliances) {
            assertTrue(appliance.getStatus().contains("is off"));
        }
    }

    @Test
    void testApplianceInitStatusChanges_ByMultiPowerPointServiceMethods(){
        // Test turning on
        testService.on();
        List<IAppliance> appliances = testService.getAppliances();
        for (IAppliance appliance : appliances) {
            assertTrue(appliance.getStatus().contains("is on"));
        }

        // Test turning off
        testService.off();
        for (IAppliance appliance : appliances) {
            assertTrue(appliance.getStatus().contains("is off"));
        }
    }


}
