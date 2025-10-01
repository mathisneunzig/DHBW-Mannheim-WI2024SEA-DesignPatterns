# Visitor Pattern - Java Beispiel

## Übersicht

Dieses Projekt demonstriert das **Visitor Pattern** anhand von geometrischen Formen (Shapes). Das Pattern ermöglicht es, neue Operationen auf bestehende Klassen anzuwenden, ohne diese Klassen zu verändern.

## Konzept

Das Visitor Pattern trennt Algorithmen von den Objektstrukturen, auf denen sie operieren. In diesem Beispiel:

- **Shapes** (Circle, Square) sind die Datenstrukturen
- **Visitors** (ShapeAreaCalculator, ShapePerimeterCalculator) sind die Operationen

### Vorteile

- Neue Operationen können hinzugefügt werden, ohne bestehende Shape-Klassen zu ändern
- Trennung von Daten und Algorithmen
- Type-safe durch Verwendung von Interfaces

## Voraussetzungen

- Java Development Kit (JDK) 8 oder höher
- Keine externen Dependencies erforderlich

## Build & Run

### Kompilieren

```bash
# Im Hauptverzeichnis (eine Ebene über ErelLukas/)
javac ErelLukas/*.java
```

### Ausführen

```bash
# Im Hauptverzeichnis
java ErelLukas.Main
```

### Alternative: Alle Schritte in einem

```bash
javac ErelLukas/*.java && java ErelLukas.Main
```

## Verwendung

### Beispielausgabe

Das Programm berechnet Fläche und Umfang für verschiedene Shapes:

```
Square area: 100.0
Circle area: 78.54
Square perimeter: 40.0
Circle perimeter: 31.42
```

### Neue Shapes hinzufügen

Um eine neue Shape hinzuzufügen (z.B. Triangle):

1. Erstelle die neue Shape-Klasse:

```java
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
```

2. Erweitere das ShapeVisitor Interface:

```java
public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);  // Neu
}
```

3. Implementiere die neue Methode in allen Visitors

## Konzeptionelle Erklärung

### Double Dispatch

Das Visitor Pattern nutzt "Double Dispatch":

1. `shape.accept(visitor)` - erste Dispatch (welche Shape?)
2. `visitor.visit(this)` - zweite Dispatch (welcher Visitor?)

Dadurch wird zur Laufzeit die korrekte Methode für den konkreten Shape-Typ aufgerufen.

### UML-Diagramm (vereinfacht)

```
     Shape                    ShapeVisitor
       |                           |
   +---+---+               +-------+-------+
   |       |               |               |
Circle  Square    AreaCalculator  PerimeterCalculator
```

## Autor

Erel Lukas

## Lizenz

Dieses Projekt dient zu Demonstrationszwecken.
