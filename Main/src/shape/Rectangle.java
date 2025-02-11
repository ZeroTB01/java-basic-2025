package shape;

public class Rectangle extends Shape implements Drawable{
    double width;
    double height;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return width*height;
    }
    public void drow(){
        System.out.println("绘制矩形长为:"+height+"宽为:" + width);
    }
}
