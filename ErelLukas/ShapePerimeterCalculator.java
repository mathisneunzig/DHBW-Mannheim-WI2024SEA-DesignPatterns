package ErelLukas;

public class ShapePerimeterCalculator implements ShapeVisitor {

  @Override
  public void visit(Circle circle) {
    double perimeter = circle.getRadius() * Math.PI * 2;
    System.out.println("Perimeter: " + perimeter); 
  }

  @Override
  public void visit(Square square) {
    double perimeter = square.getWidth()*4;
    System.out.println("Perimeter: " + perimeter); 
  }
  
}
