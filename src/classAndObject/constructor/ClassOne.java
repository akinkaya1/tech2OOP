package classAndObject.constructor;

public class ClassOne {

    String name;
    int age;

    public ClassOne(){

    }

    public ClassOne(String name){
        this.name = name;
    }

    public ClassOne(String name, int age){
        this(name);//
        this.age = age;
    }


    public static void main(String[] args) {
        ClassOne myObject1 = new ClassOne("Lionel");

        ClassOne myObject2 = new ClassOne();

        System.out.println(myObject1.name);

        ClassOne myObject3 = new ClassOne("Alex", 25);
    }
}
