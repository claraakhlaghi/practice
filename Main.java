import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

  ArrayList<Integer> arlist = new ArrayList<Integer>( );

      arlist.add(0);

      arlist.add(10);

      arlist.add(30);

      arlist.add(40);

      arlist.add(50);

      arlist.add(70);
arlist.add(70);arlist.add(70);arlist.add(70);
int result = binarySearch(arlist, 0, 8, 70);
System.out.println(result); 
  }

  public static int binarySearch(ArrayList<Integer> myList, 
int low, int high, int target) {
    int mid = (high + low) / 2;
    if (target < myList.get(mid)) {
       return binarySearch(myList, low, mid - 1, target);
    }
    else if (target > myList.get(mid)) {
         return binarySearch(myList, mid + 1, high, target);
    }
    else if (myList.get(mid).equals(target)) {
         return mid;
    }
    return -1;
}
}