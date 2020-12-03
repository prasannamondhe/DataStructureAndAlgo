package Search_Algorithms;

public class LinearSearch {
  public static void main(String[] args) {
    int base = 0;
    int[] a = {10, 2, 4, 6, 3, 8, 9, 7, 5};
    int key = 5;
    System.out.println("status " + linearSearchRecursive(a, key, base));
  }

  private static boolean linearSearchRecursive(int[] a, int key, int base) {
    if (base <= a.length - 1) {
      if (a[base] == key) {
        return true;
      } else {
        return linearSearchRecursive(a, key, base + 1);
      }
    }
    return false;
  }
}
