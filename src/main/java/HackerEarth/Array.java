package HackerEarth;

public
class Array {

  public static void main(String[] args){
    int[] a = {1,2,3,4,5};
    int count = 0;
    for (int i = 0; i <a.length; i++) {
      if((i+1) <= a.length-1) {
        a[i+1] = a[i];
      }else{
        a[0] = a[i];
      }
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
