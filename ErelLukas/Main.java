package ErelLukas;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = {
      new Square(10),
      new Circle(5)
    };
    
    ShapeAreaCalculator sh = new ShapeAreaCalculator();

    for (Shape shape : shapes) {
      shape.accept(sh);
    }
    
  }
}
