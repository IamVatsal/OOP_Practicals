public class Four {
    public static void main(String[] args){
        double distance = Double.parseDouble(args[0]);
        double time = Double.parseDouble(args[1]);
        double speed = distance/time;

        System.out.println("Speed is : " + speed);

        double P = Double.parseDouble(args[2]);
        double R = Double.parseDouble(args[3]);
        double T = Double.parseDouble(args[4]);
        double SI = (P*R*T)/100;
        System.out.println("Simple Interest : " + SI);

        double radius = Double.parseDouble(args[5]);
        double height = Double.parseDouble(args[6]);
        double vol = 3.14159 * (radius*radius) * height;

        System.out.println(String.format("Volume Of Cylinder : %.2f", vol));;
    }    
}
// java Four.java 20 4 1000 5 3 7 10