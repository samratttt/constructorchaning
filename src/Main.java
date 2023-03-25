public class Main {

    // using this()
    public Main() {

        this("samrat");   // invokes another constructor of same class
        System.out.print(" karki");

    }

    public Main(String str) {
        System.out.print(str);
    }

}

class Child extends Main {
    Child() {
        super();  // invokes the super class constructor : can be default or parameterized
        System.out.println(" is from nepal");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}