package Revision;

import java.util.Objects;

public
class Employee {
  int data;
  public Employee(int data){
    this.data = data;
  }

  @Override public
  boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return data == employee.data;
  }

  @Override public
  int hashCode() {
    return Objects.hash(data);
  }
}
