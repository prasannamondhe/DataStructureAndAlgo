package Revision;

import java.util.HashMap;
import java.util.Map;

public class Test extends Exception {

  public Test() {
    super();
  }

  public static void main(String[] args) {

    Employee e1 = new Employee(1);
    Employee e2 = new Employee(1);
    Map<Employee, String> employeeStringMap = new HashMap<>();
    employeeStringMap.put(e1, "Jack");
    employeeStringMap.put(e2, "Jack");
    System.out.println("Size is "+employeeStringMap.size());
    e1.hashCode();
  }
}
