package v1;
public class SpaceClass {
    public static void main(String[] args) {
        String message ="Kolesnyk Oksana: 16 october 1982";
                System.out.println("Number of occurrences of a space character: " + count(message));
    }
    public static int count (String message){
        int space = message.length() - message.replace(" ", "").length();
        return space;
    }
}


