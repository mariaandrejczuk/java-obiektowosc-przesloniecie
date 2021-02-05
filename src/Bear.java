
public class Bear extends Toy {

    private String material;

    public Bear(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
