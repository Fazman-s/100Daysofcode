package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();

        shape.area();
        square.area();
        circle.area();

    }
}
