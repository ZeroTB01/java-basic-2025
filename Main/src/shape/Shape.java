package shape;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void getColor(){
        System.out.println("Color:" +color);
    }
    abstract double getArea();
}
interface Drawable{
    void drow();
    default void erase(){
        System.out.println("图形擦除...");
    }
}
