import java.util.*;

class Q15ArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a length of the arrayList");
        int len = scn.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            arrayList.add(scn.nextInt());
        }
        System.out.println("ArrayList: " + arrayList);
        
        // get method
        System.out.println("Enter a number to get index of: ");
        int getIdx = scn.nextInt();
        System.out.println("Index of " + getIdx + " is " + arrayList.get(getIdx));

        // contains method
        System.out.println("Enter a number to check if it is present in the arrayList: ");
        int containsNum = scn.nextInt();
        System.out.println("ArrayList contains " + containsNum + " : " + arrayList.contains(containsNum));

        // remove method
        System.out.println("Enter index of a number to remove from the arrayList: ");
        int removeNum = scn.nextInt();
        arrayList.remove(removeNum);
        System.out.println("ArrayList after removing number at index  " + removeNum + " : " + arrayList);

        //sort 
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}