interface Shape {

    void draw();
}

class Circle implements Shape {

    public void draw() {

        System.out.println("Inside Circle::draw() method.");
    }
}

class ColorCircle implements Shape{

    public void draw(){

        System.out.println("Inside ColorCircle::draw() method.");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class ColorRectangle implements Shape {

    public void draw() {
        System.out.println("Inside ColorRectangle::draw() method.");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class ColorSquare implements Shape {

    public void draw() {
        System.out.println("Inside ColorSquare::draw() method.");
    }
}

interface Catalog{
    Shape getShape(String shapeType);
}

class ShapeFactory implements Catalog {

    public Shape getShape(String shapeType){
        //System.out.println(shapeType);
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

class ColorShapeFactory implements Catalog {

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new ColorCircle();

        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new ColorRectangle();

        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new ColorSquare();
        }

        return null;
    }
}


class Factory {

    public Catalog createFactory(String type){
        if(type==null){
            //System.out.println("color shape "+this.type);
            return new ShapeFactory();
        }
        else{
            //System.out.println("normal shape "+this.shape);
            return new ColorShapeFactory();
        }
    }
}

class AbstractFactory {

    public static void main(String[] args) {

        Factory category = new Factory();
        Catalog catalog = category.createFactory(null);
        Shape shape =catalog.getShape("CIRCLE");
        shape.draw();

        Factory category1 = new Factory();
        Catalog catalog1 = category1.createFactory("hello");
        Shape shape1 =catalog1.getShape("CIRCLE");
        shape1.draw();
    }
}
