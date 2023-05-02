public class SalaryIncrease implements VisitorSalary {
    @Override
    public void visit(SalesPerson salesPerson) {
        int newSalary  = (int) (salesPerson.getSalary() * 1.2);
        salesPerson.setSalary(newSalary);
    }

    @Override
    public void visit(Manager manager) {
        int newSalary = (int) (manager.getSalary() * 1.4);
        manager.setSalary(newSalary);
    }

    @Override
    public void visit(Programmer programmer) {
        int newSalary = (int) (programmer.getSalary() * 1.5);
        programmer.setSalary(newSalary);
    }
}
