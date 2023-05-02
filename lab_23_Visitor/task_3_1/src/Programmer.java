public class Programmer implements Employee {
    private int salary;

    public Programmer(int salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void accept(VisitorSalary visitor) {
        visitor.visit(this);
    }
}
