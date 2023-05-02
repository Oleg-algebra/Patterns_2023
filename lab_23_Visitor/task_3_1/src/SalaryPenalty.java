public class SalaryPenalty implements VisitorSalary {
    @Override
    public void visit(SalesPerson salesPerson) {
        int newSalary = (int) (salesPerson.getSalary() * 0.9);
        salesPerson.setSalary(newSalary);
    }

    @Override
    public void visit(Manager manager) {
        int newSalary = (int) (manager.getSalary() * 0.8);
        manager.setSalary(newSalary);
    }

    @Override
    public void visit(Programmer programmer) {
        int newSalary = (int) (programmer.getSalary() * 0.95);
        programmer.setSalary(newSalary);
    }
}
