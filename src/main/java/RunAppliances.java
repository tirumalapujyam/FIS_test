import appliances.adapter.impl.BlenderAdapter;
import appliances.adapter.impl.OvenAdapter;
import appliances.adapter.impl.ToasterAdapter;
import appliances.service.MultiPowerPointService;
import appliances.thirdparty.Blender;
import appliances.thirdparty.Oven;
import appliances.thirdparty.Toaster;

public class RunAppliances {

    public static void main(String[] args) {
        MultiPowerPointService multiPowerPoint = new MultiPowerPointService();

        Blender blender = new Blender();
        Toaster toaster = new Toaster();
        Oven oven = new Oven();

        multiPowerPoint.addAppliance(new BlenderAdapter(blender));
        multiPowerPoint.addAppliance(new ToasterAdapter(toaster));
        multiPowerPoint.addAppliance(new OvenAdapter(oven));

        System.out.println("\nInitial status:");
        multiPowerPoint.printStatus();

        System.out.println("\nTurning on the appliances:");
        multiPowerPoint.on();
        multiPowerPoint.printStatus();

        System.out.println("\nTurning off the appliances:");
        multiPowerPoint.off();
        multiPowerPoint.printStatus();
    }

}
