
public class Main {
    public static void printSeparator() {
        System.out.println( "===============================================================================================================");
    }
    private static void getAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static float getAllSalaries(Employee[] employees) {
        float sum = 0.0f;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee getMinSalary(Employee[] employees) {
        Employee employeeResult = employees[0];
        float minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                employeeResult = employee;
                minSalary = employee.getSalary();
            }
        }
        return employeeResult;
    }
    private static Employee getMaxSalary(Employee[] employees) {
        Employee employeeResult = employees[0];
        float maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                employeeResult = employee;
                maxSalary = employee.getSalary();
            }
        }
        return employeeResult;
    }

    private static float averageValueOfAllSalaries(Employee[] employees) {
        float average = getAllSalaries(employees) / employees.length;
        return average;
    }
    private static boolean getAllNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
        return false;
    }

    public static void main(String[] args) {
        Employee employees[] = new Employee[10];
        employees[0] = new Employee("Питер Бен Паркер", 1, 152_000);
        employees[1] = new Employee("Тони Говард Старк", 2, 1_777_323);
        employees[2] = new Employee("Гарри Джеймс Поттер", 5, 343_555);
        employees[3] = new Employee("Брюс Томас Уэйн", 3, 3_111_111);
        employees[4] = new Employee("Даутоков Эдуард Магометович", 4, 120_000);
        employees[5] = new Employee("Иванов Иван Иваныч", 3, 13_000);
        employees[6] = new Employee("Пропеллеров Карлсон Вертолетов", 1, 10);
        employees[7] = new Employee("Непейпиво Ирина Валентайловна", 3, 100_000);
        employees[8] = new Employee("Яичкин Василий Акакиевич", 5, 55_542);
        employees[9] = new Employee("Клеопатрова Анастасия Альбертовна", 4, 38_000);
        printSeparator();
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными.");
        getAll(employees);
        printSeparator();
        System.out.println("Посчитать сумму затрат на все зарплаты в месяц.");
        System.out.println(getAllSalaries(employees));
        printSeparator();
        System.out.println("Найти сотрудника с минимальной зарплатой.");
        System.out.println(getMinSalary(employees));
        printSeparator();
        System.out.println("Найти сотрудника с максимальной зарплатой.");
        System.out.println(getMaxSalary(employees));
        printSeparator();
        System.out.println("Подсчитать среднее значение зарплат.");
        System.out.println(averageValueOfAllSalaries(employees));
        printSeparator();
        System.out.println("Получить Ф.И.О. всех сотрудников.");
        System.out.println(getAllNameEmployee(employees));
    }
}

