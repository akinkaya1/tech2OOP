package oopPrinciples.inheritance.food;

public class Food {

    //instance variables
    public final static boolean tangible = true;
    public String name;
    private boolean isSpicy;
    private String taste; // restrict direct access
    protected boolean isOrganic;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    //Create a method that prints info for the object of Food []
    public void printInfo(){
        System.out.println("[" +
                "name: " + name +
                ", isSpicy: " + isSpicy +
                ", taste: " + taste +
                ", isOrganic: " + isOrganic +
                "]");
    }
}
