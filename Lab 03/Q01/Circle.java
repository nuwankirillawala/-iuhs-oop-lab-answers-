public class Circle {

    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = 0;
        this.perimeter = 0;
        System.out.println("A circle with radius " + radius + " is created");
    }

    public void calculateArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    public void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    public void displayAreaPerimeter() {
        System.out.println("The area of the circle is: " + this.area);
        System.out.println("The perimeter of the circle is: " + this.perimeter);
    }
}
