package appliances.thirdparty;

public class Blender {

    private boolean on;

    public Blender() {
        this.on = false;
    }

    public void swizzle() {
        on = !on;
    }
}
