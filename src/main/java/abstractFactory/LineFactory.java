package abstractFactory;

public class LineFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    Line getLine(String line) {

        if (line == null) {
            return null;
        }

        if (line.equalsIgnoreCase("SOLID")) {
            return new Solid();

        } else if (line.equalsIgnoreCase("DASHED")) {
            return new Dashed();
        }
        return null;
    }
}
