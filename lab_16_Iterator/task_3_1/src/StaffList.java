import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {

    private final List<Employee> employees = new ArrayList<>();

    List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    private IteratorFactory iteratorFactory;

    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public Iterator<Employee> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }
}
