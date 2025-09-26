package ErelLukas;

public interface ShapeVisitor {
  void visit(Circle circle);
  void visit(Square square);
}
