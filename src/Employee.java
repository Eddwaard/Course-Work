public class Employee {
    private String fullName;
    private int department;
    private float salary;
    private int id;
    private static int count;

    public Employee(String fullName, int department, float salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть в диапазоне от 1 до 5 а он :" + department);
        } else {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            this.id = count;
            count++;
        }
    }
    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

}
