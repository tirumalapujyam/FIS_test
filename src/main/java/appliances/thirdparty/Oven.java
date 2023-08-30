package appliances.thirdparty;

public class Oven {
    private boolean on;

    public Oven() {
        this.on = false;
    }

    public void heatUp() {
        on = !on;
    }
}
