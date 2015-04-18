/*************************************************************************
 *  Compilation:  javac Hello3D.java
 *  Execution:    java Hello3D
 *
 * Draws a white sphere of radius one at (0, 0, 0).
 * 
 * Keywords: Sphere
 ***********************************************************************/

public class Hello3D {
    public static void main(String[] args) {

        // Sets the scale of the drawing window
        StdDraw3D.setScale(-1,1);

        // Draws a sphere of radius 1 centered at (0,0,0)
        StdDraw3D.sphere(0, 0, 0, 1);

        // Renders to the drawing window
        StdDraw3D.finished();
    }
}
