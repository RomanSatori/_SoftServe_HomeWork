package HW8_part2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setType(Type type) {
        this.type = type;
    }



    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
