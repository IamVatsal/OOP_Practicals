public class Prac2 {
    public static void main(String[] args) {
        Exam exam = new Exam("Vatsal Patel", 142, "OOP01", "Object Oriented Programming", 40, 60);
        exam.Calculate_result();
        exam.Show_result();
    }
}
class Exam {
    String stu_name;
    int rollno;
    String sub_code;
    String sub_name;
    int internalMarks;
    int externalMarks;

    Exam(String name, int roll, String code, String subject, int internal, int external) {
        this.stu_name = name;
        this.rollno = roll;
        this.sub_code = code;
        this.sub_name = subject;
        this.internalMarks = internal;
        this.externalMarks = external;
    }

    void Calculate_result() {
        int totalMarks = internalMarks + externalMarks;
        System.out.println("Total Marks: " + totalMarks);
    }

    void Show_result() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Subject Code: " + sub_code);
        System.out.println("Subject Name: " + sub_name);
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("External Marks: " + externalMarks);
    }

}