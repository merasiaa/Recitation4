import java.util.Scanner;

public class Recitation4 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        // add your code here
        System.out.println("Enter an x and y coordinate");
        Integer coordinate = scan.nextInt();


        Circle circle16 = new Circle(coordinate);
        Circle circle40 = new Circle();
        Point m = new Point(14,12);
        circle40.setLocation(m);

    if (circle16.intersects(circle40))
        {
            System.out.print("Circles intersect!");
        }
        else
        {
        System.out.print("Circles do not intersect!");
    }

    }
}
