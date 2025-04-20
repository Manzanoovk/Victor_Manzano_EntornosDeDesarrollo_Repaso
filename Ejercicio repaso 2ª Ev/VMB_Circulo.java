public class VMB_Circulo {
    private int id;
    private double radio;
    private String color;

    // Aqui esta el Constructor
    public VMB_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    // Aqui estan los getter u setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Aqui esta el toString
    @Override
    public String toString() {
        return "VMB_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }
}