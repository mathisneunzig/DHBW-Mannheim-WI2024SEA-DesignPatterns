package ErelLukas;

public class ShapeAreaCalculator implements ShapeVisitor {

  @Override
  public void visit(Circle circle) {
    double area = circle.getRadius() * Math.PI;
    System.out.println("Area: " + area);
  }

  @Override
  public void visit(Square square) {
    int area = square.getWidth()*square.getWidth();
    System.out.println("Area: " + area);
  }

}
