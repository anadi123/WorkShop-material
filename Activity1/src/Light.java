public class Light {
    public static void main(String[] args){
        double lightSpeed;
        int days;
        double seconds;
        double distance;

        lightSpeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distance=lightSpeed*seconds;
        System.out.print("In" + days);
        System.out.print("days light will travel about");
        System.out.print(distance + "miles");
    }

}
