import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
   int[] nums = {0, 4, 4, 5, 6, 7};
int result = bSearch(nums, 0, nums.length - 1, 4);
System.out.println(result); 
  }

  public static int bSearch(int[] arr, int left, int right, int x) {
 if (right >= left) {
   int mid = (left + right) / 2;
   if (arr[mid] == x) {
     return mid;
   }
   else if (arr[mid] > x) {
     return bSearch(arr, left, mid - 1, x);
   }
   else {
     return bSearch(arr, mid + 1, right, x);
   }
 }
 return -1;
}
}