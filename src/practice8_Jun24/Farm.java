package practice8_Jun24;

import java.io.Serial;
import java.io.Serializable;

public class Farm implements Serializable {
    @Serial
    private static final long serialVersionUID = -1788130394726742154L;
    String name;
    double price;

    public Farm(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
