package ErelLukas;

public class ShapeAreaCalculator implements Visitor{

  @Override
  public void visit(Circle circle) {
  }

  @Override
  public void visit(Square square) {
    int area = square.getWidth()*square.getWidth();
    System.out.println("Area: "+area);
  }

}
