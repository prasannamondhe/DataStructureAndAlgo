package Search_Algorithms;

public class BinarySearch {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int left = 0;
    int right = a.length-1;
    int find = 80;
    boolean b = binarySearch(a, find, left, right);
    System.out.println(b);
  }

  private static boolean binarySearch(int[] a, int find, int left, int right) {
    if(a == null || a.length==0){
      return false;
    }
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == find) return true;
      if (a[mid] > find) right = mid - 1;
      else left = mid + 1;
    }
    return false;
  }
}
