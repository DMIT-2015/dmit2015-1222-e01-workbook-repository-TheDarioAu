package dmit2015.model;

/**
 * This class models a Rectangle shape
 */
public class Rectangle {
    //do not use underscore unless it is for internal, java doesn't have syntax for properties
    /**
     * The Length and Width of the Rectangle
     */
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        setLength(1);
        setWidth(1);
    }

    public Rectangle(double newLength, double newWidth) {
        setLength(newLength);
        setWidth(newWidth);
    }
    public double area()
    {
        return length * width;
    }
    public double perimeter()
    {
        return 2 * length + 2 * width;
    }
    public double diagonal()
    {
        return Math.sqrt((length * length) + (width * width));
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        try
        {
            System.out.println("uh ok");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}