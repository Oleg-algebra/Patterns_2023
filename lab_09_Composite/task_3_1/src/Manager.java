public class Manager implements BussinessSubject {

    private final String name;
    private final int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void payExpenses() {
        System.out.println("Manager "+name + " has been paid $" + salary);
    }

}
