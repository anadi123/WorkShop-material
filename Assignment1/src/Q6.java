//public class Q6 {
//}
class Box1 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box1(double width, double height, double depth) {
        width = width;
        height = height;
        depth = depth;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class Q6 {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box objects
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1(3, 6, 9);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
