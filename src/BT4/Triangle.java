package BT4;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    private double area = 0.0;
    private double perimeter = 0.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double perimeter = (side1 + side2 + side3) / 2;
        return this.perimeter = perimeter;
    }

    public double getArea() {
        double area = Math.sqrt(this.perimeter * (this.perimeter - side1) * (this.perimeter - side2) * (this.perimeter - side3));
        return this.area = area;
    }

    public double[] gettriangle() {
        double[] arr = {side1, side2, side3};
        return arr;
    }


    public boolean checkTriangle() {
        if ((side1+side2>side3)&&(side1+side3>side2)&&(side2+side3>side1)&&side1>0&&side2>0&&side3>0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
