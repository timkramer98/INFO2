public abstract class Circle extends Shape {
    public double getArea(double d){
        return d*d*Math.PI;
    }
    public double getPerimeter(double d){
        return 2*d*Math.PI;
    }
}