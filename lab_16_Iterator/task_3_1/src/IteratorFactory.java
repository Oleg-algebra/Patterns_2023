import java.util.Iterator;

public interface IteratorFactory {
    Iterator<Employee> createIterator(StaffList staffList);
}
