public class Five {
    public static void main(String[] args){
        double rollNo = Double.parseDouble(args[0]);
        String name = args[1];
        String course = args[2];
        int sem = Integer.parseInt(args[3]);

        System.out.println("Roll Number: " + rollNo + "Name: " + name + "Course: " + course + "Sem: " + sem);

        System.out.println("\n");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Sem: " + sem);
    }
}
// java Five.java 24012011142 Vatsal BTechCE 3