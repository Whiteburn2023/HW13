package keyboard;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final KeyboardLight keyboardLight;
    private final double weight;

    public Keyboard(KeyboardType keyboardType, KeyboardLight keyboardLight, double weight) {
        this.keyboardType = keyboardType;
        this.keyboardLight = keyboardLight;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public KeyboardLight getKeyboardLight() {
        return keyboardLight;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "keyboard.Keyboard{" +
                "keyboardType=" + keyboardType +
                ", keyboardLight=" + keyboardLight +
                ", weight=" + weight +
                '}';
    }
}
