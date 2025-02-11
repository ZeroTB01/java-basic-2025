package shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes ={
                new Circle("black",5),
                new Rectangle("pink",3,4)
        };
        for (Shape shape:shapes){
            shape.getColor();
            System.out.println(shape.getArea());
            if (shape instanceof Drawable){
                ((Drawable) shape).drow();
                ((Drawable) shape).erase();
            }
        }
    }
}
