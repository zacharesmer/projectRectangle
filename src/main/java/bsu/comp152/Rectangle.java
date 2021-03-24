/**
 * Rectangle class
 *
 * A class for Rectangle objects
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 */
package bsu.comp152;
import java.util.Random;

public class Rectangle {

    /* This class is a (blueprint) class
     * for creating and manipulating Rectangle objects.
     */

    /* Objects have information
     * and actions associated with them.
     */

    /* We store the information in "instance variables".
     * These keep the data for the Rectangle object "private":
     * The data length and width are accessible directly only from
     * inside the Rectangle class.
     */
    private double length;
    private double width;
    /* Don't create an instance variable area. It could get out of sync with
     * length and width, yielding "stale data".
     */

    /* This is a "constructor" for a Rectangle object.
     * A constructor has no return type in the header, not even void!
     * A constructor has the same name as the class.
     */
    public Rectangle(double length, double width){
        /*
        We can name the parameters the same as the instance variables.
        Then we use the reference variable this as a reference to the object,
         e.g., the expression this.width refers to the Rectangle object's width field.
        */
        this.length = length;
        this.width = width;
    }

    /* We can overload constructors (and other methods),
     * ensuring that the method signatures differ.
     * They need to have a different number and/or type of parameters.
     */
    public Rectangle(){
        // We can use the reference variable this to have one constructor call another
        // **as the first line** of the body.
        this(0, 0);
    }

    // This is a copy constructor.
    public Rectangle(Rectangle other){
        length = other.length;
        width = other.width;
    }

    /* These instance methods for actions on Rectangle objects
     * are "accessors" or "getters".
     * We call them on Rectangle objects to get information about the
     * Rectangle objects.
     */
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length*width;
    }

    @Override
    /**
     * toString -
     * instance method to return a String that describes the object effectively
     */
    public String toString() {
        return String.format("Rectangle{length=%f, width=%f}", length, width);
    }

    public boolean equals(Rectangle other) {
        return (length == other.length) && (width == other.width);
    }

    public boolean isBiggerThan(Rectangle other){
        // Just for fun,
        // throw an IllegalArgumentException when comparing a 0x0 rectangle with a 0x0 rectangle.
        if ((getArea() == 0) && (other.getArea() == 0)){
            throw new IllegalArgumentException();
        }
        // Check if the area of the Rectangle is bigger than the area of the other Rectangle.
        return getArea() > other.getArea();
    }

    public boolean isSquare(){
        return length == width;
    }

    public void copy(Rectangle other){
        length = other.length;
        width = other.width;
    }

    public Rectangle copy2(){
        Rectangle myCopy = new Rectangle(length, width);
        return myCopy;
    }

    /* These instance methods are "mutators" or a "setters".
     * We call them on Rectangle objects to changes the
     * Rectangle object's data.
     */
    public void setLength(double len){
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
    }

    /** A method to exchange length and width.
     */
    public void rotate(){
        double temp = length; // Save the original length.
        length = width; // Overwrite length with width.
        width = temp; // Overwrite width with the original length.
    }

    /** A method to randomize the length and width
     * to be random doubles on the interval [0, 21).
     */
    public void randommize(){
        Random rand = new Random();
        /* For length and width, add a random integer between 0 and 20 inclusive
         * to a random double on the interval [0, 1).
         */
        length = rand.nextInt(21) + Math.random();
        width = rand.nextInt(21) + Math.random();
    }
}
