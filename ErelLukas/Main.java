package ErelLukas;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = {
      new Square(10),
      new Circle(5)
    };
    
    ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();

    ShapePerimeterCalculator shapePerimeterCalculator = new ShapePerimeterCalculator();

    for (Shape shape : shapes) {
      shape.accept(shapeAreaCalculator);
      shape.accept(shapePerimeterCalculator);
    }
  }
}
