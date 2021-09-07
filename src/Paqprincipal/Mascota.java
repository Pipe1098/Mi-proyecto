package Paqprincipal;

public class Mascota {
    private String color ; // color
    private int edad ; // edad
    private String sex; // Género
    private String kind;

    private double inPrice; // Precio de compra
    private double outPrice; // precio de venta
    private double beneficio ; // beneficio


    public Mascota(String color, int age, String sex) {
        this.color = color;
        this.edad = age;
        this.sex = sex;
    }

    public Mascota() {

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getProfit() {
        return beneficio;
    }

    public void setProfit(double profit) {
        this.beneficio = profit;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return edad;
    }

    public void setAge(int age) {
        this.edad = age;
    }

    public double getInPrice() {
        return inPrice;
    }

    public void setInPrice(double inPrice) {
        this.inPrice = inPrice;
    }

    public double getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(double outPrice) {
        this.outPrice = outPrice;
    }

}
