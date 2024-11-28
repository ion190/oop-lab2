public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    private int Area() {
        return width*height;
    }

    void compareSize(Display m) {
        int currentArea = Area();
        int otherArea = m.Area();

        if (currentArea > otherArea) {
            System.out.println(this.model + " is bigger than " + m.model);
        } else if (currentArea < otherArea) {
            System.out.println(this.model + " is smaller than " + m.model);
        } else {
            System.out.println(this.model + " and " + m.model + " have the same size.");
        }
    }

    void compareSharpness(Display m) {
        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper than " + m.model);
        } else if (this.ppi < m.ppi) {
            System.out.println(this.model + " is less sharp than " + m.model);
        } else {
            System.out.println(this.model + " and " + m.model + " have the same sharpness.");
        }
    }

    // both size and sharpness
    void compareWithMonitor(Display m) {
        System.out.println("Comparison of " + this.model + " with " + m.model + ":");
        compareSize(m);
        compareSharpness(m);
    }

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getPpi() {
        return ppi;
    }

    public void setPpi(float ppi) {
        this.ppi = ppi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
