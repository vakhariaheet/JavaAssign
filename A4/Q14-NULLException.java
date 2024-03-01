// 14 Write a java program to handle NullPointerException.
class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}