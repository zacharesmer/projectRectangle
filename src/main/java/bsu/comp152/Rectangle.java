package bsu.comp152;

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
     * They need to have a different and/or type of parameters.
     */
    public Rectangle(){
        // We can use the reference variable this to have one constructor call another
        // **as the first line** of the body.
        this(0, 0);
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
}
