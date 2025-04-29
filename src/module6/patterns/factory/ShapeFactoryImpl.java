package module6.patterns.factory;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2025
 */

public class ShapeFactoryImpl extends ShapeFactory {
    @Override
    public Shape renderShape(String type) {
        switch (type) {
            case "Circle": {
                return new Circle();
            }
            case "Rectangle": {
                return new Rectangle();
            }
        }
        throw new RuntimeException("Unknown type " + type);
    }
}
