package ObjectClone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("zhangyang", 200000);
        original.setHireDay(2022,1,1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2023,1,1);
        System.out.println("original= " + original);
        System.out.println("copy= " + copy);

    }
}
