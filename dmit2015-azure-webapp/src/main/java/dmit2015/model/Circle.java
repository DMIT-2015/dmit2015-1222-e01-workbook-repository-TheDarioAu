package dmit2015.model;

/**
 * This class models a Circle Shape
 *
 * @author Dario Au
 * @version 2023-01-20
 *
 */
public class Circle {
    //do not use underscore unless it is for internal, java doesn't have syntax for properties
    /**
     * THe radius of this circle.
     * @return the radius of the circle
     */
    private double radius;

    public double getRadius() {
        return radius;
    }

    /*
    public void setRadius(double radius) throws Exception {
        if (radius <= 0)
        {
            throw new Exception("Radius must be positive");
        }
        this.radius = radius;
    }
    */

    /**
     * Change the radius of this circle
     * @param radius the new radius of this circle
     */
    public void setRadius(double radius) {
        if (radius <= 0)
        {
            throw new RuntimeException("Radius must be positive");
        }
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    /**
     * Create a circle with a specific radius
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Compute and return circle area
     * @return area of Circle
     */
    public double area()
    {
        return Math.PI * radius * radius;
    }

    /**
     * Compute and return circle perimeter
     * @return perimeter of Circle
     */
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    /**
     * Compute and return circle diameter
     * @return diameter of Circle
     */
    public double diameter()
    {
        return 2 * radius;
    }

    /**
     * Compute and return circle circumference
     * @return circumference of Circle
     */
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    /**
     * console application to demonstate usage of Circle object
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.printf("The radius of circle1 is %s\n", circle1.getRadius());
        System.out.printf("The area of circle1 is %.5f\n", circle1.area());
        System.out.printf("The perimeter of circle1 is %.2f\n", circle1.perimeter());

        //change the radius to 5
        circle1.setRadius(5);
        try
        {
            circle1.setRadius(-25);
            System.out.println("uh ok");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}