import java.util.Comparator;

public class SortByName implements Comparator<Customer> {
    public int compare(Customer a, Customer b) {
        int nameCompare = a.getName().compareTo(b.getName());
        int ageCompare = a.getAge() - b.getAge();
        return (nameCompare == 0) ? ageCompare : nameCompare;
    }

}
