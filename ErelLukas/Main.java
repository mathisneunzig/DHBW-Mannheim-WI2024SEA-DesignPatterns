package ErelLukas;

public class Main {
  public static void main(String[] args) {
    Square square = new Square(10);

    ShapeAreaCalculator sh = new ShapeAreaCalculator();
    square.accept(sh);
  }
}
