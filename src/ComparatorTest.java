import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Employee> e= new ArrayList<>();
        e.add(new Employee("zaiid", 10000, "IT"));
        e.add(new Employee("musa", 20000, "IT"));
        e.add(new Employee("isa", 10000, "SALES"));
        e.add(new Employee("yusuf", 15000, "IT"));

        e.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparingInt(Employee::getSalary)).reversed());

        for (Employee employee : e){
            System.out.println(employee);
        }


        List<Integer> numbers = Arrays.asList(10, 5, 30, 20, 15);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);

        //Q2. Sort strings by length
        List<String> names =
                Arrays.asList("Java", "Spring", "API", "Microservices");

        names.sort(Comparator.comparing(String::length).reversed());
        System.out.println("Sort strings by length - " + names);
    }
}
