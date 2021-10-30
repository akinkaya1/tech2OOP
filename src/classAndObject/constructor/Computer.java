package classAndObject.constructor;

public class Computer {

    static final boolean hasRAM;
    String brand;
    int storage;
    int RAM;
    String OS;

    {
        brand = "Mac";
        System.out.println("This is an instance block!!!");
        {
            System.out.println("Inner instance block is here!!!");
        }
    }

    static {
        hasRAM = true;
        System.out.println("This is a static block!!!");
        {
            System.out.println("Inner instance block in Static block");
        }
    }

    public Computer(){
        System.out.println("Default constructor is here!!!");
    }

    public Computer(String brand, String OS){
        System.out.println("2-args constructor is here!!!");
        this.brand = brand;
        this.OS = OS;
    }

    public Computer(String brand, int storage, int RAM, String OS) {
        this(brand, OS);
        System.out.println("4-args constructor is here!!!");
        this.storage = storage;
        this.RAM = RAM;
    }

    public static void doCalculation(){
        System.out.println("Computer does calculation");
    }

    public static void processData(){
        System.out.println("Computer processes data");
    }

    public void searchInSafari(){
        System.out.println(this.brand + " does search in SAFARI");
    }


    public void printInfo(){
        System.out.println("Brand: " + this.brand + ", " +
                            "Storage: " + this.storage + "gb, " +
                            "RAM: " + this.RAM + "gb, " +
                            "OS: " + this.OS + ", " +
                            "hasRAM: " + hasRAM);
    }







    public static void main(String[] args) {
        //Create a computer1 object
        System.out.println("\n---computer1 object is created---\n");
        Computer computer1 = new Computer();

        /*
        Define the all information for computer1
        Apple
        512 gb
        16 gb
        MacOS
         */
        computer1.brand = "Apple";
        computer1.storage = 512;
        computer1.RAM = 16;
        computer1.OS = "MacOS";

        computer1.printInfo();
        computer1.searchInSafari();

        //Create a new computer2 object with initial brand and OS information
        System.out.println("\n---computer2 object is created---\n");
        Computer computer2 = new Computer("HP", "Windows");
        computer2.storage = 256;
        computer2.RAM = 8;
        computer2.printInfo();

        /*
        Create a new computer3 object with initial brand, storage, RAM and OS information
        Dell
        1024 gb
        32 gb
        Linux
         */
        System.out.println("\n---computer3 object is created---\n");
        Computer computer3 = new Computer("Dell", 1024, 32, "Linux");
        computer3.printInfo();
    }
}
