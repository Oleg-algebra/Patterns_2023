public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new Programmer(70000));

        System.out.println(staffList);
        System.out.printf("Total amount paid to staff: %s\n\n",staffList.getSalary());

        VisitorSalary visitor1 = new SalaryIncrease();
        VisitorSalary visitor2 = new SalaryPenalty();

        staffList.accept(visitor1);
        System.out.println(staffList);
        System.out.printf("Total amount paid to staff: %s\n\n",staffList.getSalary());

        staffList.accept(visitor1);
        System.out.println(staffList);
        System.out.printf("Total amount paid to staff: %s\n\n",staffList.getSalary());

        staffList.accept(visitor2);
        System.out.println(staffList);
        System.out.printf("Total amount paid to staff: %s\n\n",staffList.getSalary());

    }

}
