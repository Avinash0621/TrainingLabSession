package CoreJava;

public class StaticNonStactic {
    public static String studName = "Avinash Tiwari";
    public int studId = 82;
    public static void main(String[] args) {
        System.out.println(studName);
        StaticNonStactic sn = new StaticNonStactic();
        System.out.println(sn.studId);
    }
}