
import java.util.*;
public class TestPolyLine {
   public static void main(String[] args) {
      PolyLine l1 = new PolyLine();
      System.out.println(l1);
      l1.appendPoint(new Point(1, 2));
      l1.appendPoint(3, 4);
      l1.appendPoint(5, 6);
      System.out.println(l1); 
      List<Point> points = new ArrayList<Point>();
      points.add(new Point(11, 12));
      points.add(new Point(13, 14));
      PolyLine l2 = new PolyLine(points);
      System.out.println(l2);  
   }
}