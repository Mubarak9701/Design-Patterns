interface Color {
    public void applyColor();
}

class GreenColor implements Color{

    public void applyColor(){
        System.out.println("green.");
    }
}

class RedColor implements Color{

    public void applyColor(){
        System.out.println("red.");
    }
}

abstract class Shape {
    Color color;

    Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}

class Triangle extends Shape{

    Triangle(Color c) {
        super(c);
    }

    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}

class Square extends Shape{

    Square(Color c) {
        super(c);
    }

    public void applyColor() {
        System.out.print("Square filled with color ");
        color.applyColor();
    }

}

public class Bridge {
    
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Square(new GreenColor());
        pent.applyColor();
    }
}
