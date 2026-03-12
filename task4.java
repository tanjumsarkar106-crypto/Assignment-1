class Rectangle {

    double length;
    double width;

    void setLength(double length){
        this.length = length;
    }

    void setWidth(double width){
        this.width = width;
    }

    double getLength(){
        return length;
    }

    double getWidth(){
        return width;
    }

    double getArea(){
        return length * width;
    }
}

class Triangle {

    double height;
    double base;

    void setHeight(double height){
        this.height = height;
    }

    void setBase(double base){
        this.base = base;
    }

    double getHeight(){
        return height;
    }

    double getBase(){
        return base;
    }

    double getArea(){
        return 0.5 * base * height;
    }
}

class Circle {

    double radius;

    void setRadius(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    double getArea(){
        return 3.1416 * radius * radius;
    }
}

class Square {

    double side;

    void setSide(double side){
        this.side = side;
    }

    double getSide(){
        return side;
    }

    double getArea(){
        return side * side;
    }
}

class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Rectangle Length: " + r.getLength());
        System.out.println("Rectangle Width: " + r.getWidth());
        System.out.println("Rectangle Area: " + r.getArea());


        Triangle t = new Triangle();
        t.setBase(6);
        t.setHeight(4);

        System.out.println("\nTriangle Base: " + t.getBase());
        System.out.println("Triangle Height: " + t.getHeight());
        System.out.println("Triangle Area: " + t.getArea());


        Circle c = new Circle();
        c.setRadius(7);

        System.out.println("\nCircle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());


        Square s = new Square();
        s.setSide(8);

        System.out.println("\nSquare Side: " + s.getSide());
        System.out.println("Square Area: " + s.getArea());
    }
}