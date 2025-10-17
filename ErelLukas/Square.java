package ErelLukas;

public class Square implements Shape {
  int width;

  public Square(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
  }
}
