package task3.execute;
import task3.classes.Student;
public class RunTask {
    static String name = "Oksana Kolesnyk";

    public static void main(String[] args) {
        Student source = new Student();
        String value = source.RunTask(name);
        System.out.println(value);
    }
}
