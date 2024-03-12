
interface Shape{
    void draw();
}

class Circle implements Shape{
    public Circle() {
        System.out.println("Circle created");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw method");
    }
}

class Square implements Shape{
    public Square(){
        System.out.println("Square created");
    }

    @Override
    public void draw() {
        System.out.println("Square draw method");
    }
}

class ShapeFactory{
    public static Shape createShape(String type){
        if("Circle".equalsIgnoreCase(type)){
            return  new Circle();
        } else if ("Square".equalsIgnoreCase(type)){
            return new Square();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

class MainDiagram{
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape("SQUARE");
        shape2.draw();

    }
}
