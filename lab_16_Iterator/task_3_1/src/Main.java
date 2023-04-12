
public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");
    Employee oleg = new Employee("Oleg");
    Employee andrew = new Employee("Andrew");
    Employee arsen = new Employee("arsen");

    StaffList staffList = new StaffList();
    staffList.addEmployee(zak);
    staffList.addEmployee(sarah);
    staffList.addEmployee(anna);
    staffList.addEmployee(oleg);
    staffList.addEmployee(andrew);
    staffList.addEmployee(arsen);

    staffList.setIteratorFactory(StaffListIterator::new);
    for (Employee employee : staffList){
      System.out.println(employee);
    }
  }

}
