import javax.swing.*;
import java.util.LinkedList;

/**
 * Created by k.waluch on 2016-05-04.
 */
public class Main {

    public static void main(String[] args) {

        elipticCurve test = new elipticCurve(2, 2, 17);
        LinkedList<Point> tescik;

        tescik = test.countPoints();
        for(Point p: tescik){
            p.display();
            if(p.y!=0) {
            System.out.println(" ");
            test.countOrder(p);
                System.out.println(" ");
            }
        }

//        test.countOrder(new Point(1,6));

    }
}
