
import com.mphasis.cui.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
public class er {
    public static void main(String[] args) {
        Logger logger;
        logger=Logger.getLogger(Main.class.getName());
        //}
        ArrayList<Point> result = new ArrayList<Point>();
        result.add(new Point(1, 2));
        result.add(new Point(2, 3));
        result.add(new Point(3, 4));
        result.add(new Point(4, 5));
        result.add(new Point(5, 6));
        Iterator<Point> iterator = result.iterator();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            logger.log(Level.INFO, point.toString());
        }
    }
}