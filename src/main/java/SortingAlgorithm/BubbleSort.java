package SortingAlgorithm;

public class BubbleSort {

  public static void main(String[] args){
    int[] a = {5,4,3,2,1};
    int unsorted = a.length-1;
    boolean isSorted = false;
    while (!isSorted){
      isSorted = true;
      for (int i = 0; i < unsorted; i++) {
        if(a[i] > a[i+1]){
          swap(a, i, i+1);
          isSorted = false;
        }
      }
      unsorted--;
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
