public interface Employee {

    int getSalary();
    void accept(VisitorSalary visitor);

}
