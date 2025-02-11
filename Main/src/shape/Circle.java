package shape;


class Circle extends Shape implements Drawable{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }
    public void drow(){
        System.out.println("绘制圆形半径为:"+radius);
    }
}
