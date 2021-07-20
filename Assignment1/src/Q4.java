public class Q4 {
    public static void main(String[] args) {
        double[] num = new double[]{10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for(i=0; i<num.length; i++)
            result = (result + num[i]);

        System.out.println("Average is " + result  );
    }
}
