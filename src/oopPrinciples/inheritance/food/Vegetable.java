package oopPrinciples.inheritance.food;

public class Vegetable extends Food{

    //Instance variables
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void printInfo() {
        System.out.println("[" +
                "name: " + name +
                ", isSpicy: " + super.isSpicy() +
                ", taste: " + super.getTaste() +
                ", isOrganic: " + isOrganic +
                ", color: " + color +
                "]");
    }

    @Override
    protected void finalize() {
        System.out.println("Vegetable object is garbage collected");
    }
}
