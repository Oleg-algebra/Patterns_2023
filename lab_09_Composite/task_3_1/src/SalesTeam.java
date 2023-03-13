import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements BussinessSubject {
    private final String departmentName;

    private final List<BussinessSubject> employees = new ArrayList<>();


    public SalesTeam(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(BussinessSubject employee) {
        employees.add(employee);
    }


    @Override
    public void payExpenses() {
        System.out.println("\nDepartment: "+departmentName);
        for (BussinessSubject employee : employees) {
            employee.payExpenses();
        }

    }

}
