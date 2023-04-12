import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {

    private final List<Employee> collection;
    int currentEmployee;
    public StaffListIterator(StaffList staffList) {
        this.collection = staffList.getEmployees();
        this.collection.sort(Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER));
        currentEmployee = 0;

    }

    @Override
    public boolean hasNext() {
        return currentEmployee < collection.size();
    }

    @Override
    public Employee next() {
        return collection.get(currentEmployee++);
    }
}
