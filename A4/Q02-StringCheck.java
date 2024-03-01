import java.util.Scanner;

class LengthMatchException extends Exception {
    public LengthMatchException(String message) {
        super(message);
    };
}


class StringCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println("What do think is this string's length");
        int length = scn.nextInt();
        try{
            if(str.length() != length){
                throw new LengthMatchException("Grasslet bhan nahi padtu length match thay nai.");
            }
            System.out.println("Chalo Kaik to khabr che");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}