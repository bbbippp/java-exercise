public class Employee {
    private String name;
    private Double age;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        int asu = 5;

        int asuu = new Integer(100);

        Integer anjing = new Integer(1000);

        System.out.println(anjing);
        System.out.println("-");
        System.out.println(asuu);

        System.out.println(String.format("%s (%s)", "muahaha", "RTS"));
    }
}