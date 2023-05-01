public class Shape {
    void area(){

    }
}
class Triangle extends Shape{
    @Override
    void area() {
        System.out.println("Iriangle area = 1/2 x Base x Height");
    }
}
class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Circle area = 3.14 x radius x radius");
    }
}
class Run {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape c = new Circle();
        t.area();
        c.area();
    }
}