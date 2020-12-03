package randomProblems;

public
class ArrayFromInt {
public static void main(String[] args){

  int a =123;
  int m = a;
  int digit = 0;
  while(m > 0){
    digit++;
    m = m/10;
  }
  int[] x = new int[digit];
  for (int i = x.length-1; i>=0;i--){

    x[i] = a%10;
    a = a/10;

  }
  for(int i = 0; i < x.length; i++) {
    System.out.println(x[i]);
  }

}
}
