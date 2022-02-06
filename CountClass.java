package v2;
public class CountClass {
           public static void main(String[] args) {
               String message = "Kolesnyk Oksana: 16 october 1982";
               System.out.println("Number of occurrences of a space character: " + count(message));
           }
           public static int count (String message){
               int number = 0;
                 for (int i=0; i<message.length(); i++) {
                   if(message.charAt(i) == ' ') {
                    number++;
                }
            }
               return number;
           }
    }

