package appliances.thirdparty;

public class Toaster {
    private boolean on;

    public Toaster() {
        this.on = false;
    }

    public void startToasting() {
        on = !on;
    }
}
