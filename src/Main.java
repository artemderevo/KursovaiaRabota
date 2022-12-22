import javax.naming.Name;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Valery","Nosov","Georgievich",4, 56500),
                new Employee("Ulia","Chaikovskaya","Alekseevna",1,70000),
                new Employee("Pavel", "Champagne", "Vladlenovich",5, 65000),
                new Employee("Dmitry", "Dynasty","Evgenievich",2, 67500),
                new Employee("Danya","Ogurcov","Alexandrovich", 1, 60000),
                new Employee("Egor","Saimonov","Sergeevich", 5,68000),
                new Employee("Polina","Sorokina","Vladislavovna",1,65000),
                new Employee("Sergey", "Indianov","Vladimirovich", 3, 50000),
                new Employee("Liza","Zueva","Dmitrievna", 3, 65000),
                new Employee("Vladislav","Gotlib","Egorovich", 3, 58500)
        };

        printListOfEmployees(employees);
        printMinSalary(employees);
        printEmployeeOfMinSalary(employees);
        printMaxSalary(employees);
        printEmployeeOfMaxSalary(employees);
        printSumSalary(employees);
        printAverageSalary(employees);
        printFullNames(employees);



    }

    private static void printListOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int idEmployeeOfMinSalary(Employee[] employees) {
        int count = 0;
        int id = 1;
        for (; count < employees.length;) {
            if (employees[count]!= null) {
                break;
            }
            count++;
        }
        double min = employees[count].getEmployeeSalary();
        for (count++; count < employees.length; count++) {
            if (min > employees[count].getEmployeeSalary()) {
                min = employees[count].getEmployeeSalary();
                id = count;
            }
        }

        return id;
    }

    public static int idEmployeeOfMaxSalary(Employee[] employees) {
        int count = 0;
        int id = 1;
        for (; count < employees.length;) {
            if (employees[count]!= null) {
                break;
            }
            count++;
        }
        double max = employees[count].getEmployeeSalary();
        for (count++; count < employees.length; count++) {
            if (max < employees[count].getEmployeeSalary()) {
                max = employees[count].getEmployeeSalary();
                id = count;
            }
        }

        return id;
    }

    public static double sumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i <employees.length ; i++) {
            sum += employees[i].getEmployeeSalary();
        }
        return sum;
    }

    public static double averageSalary(Employee[] employees) {
        double average = 0;
        if (employees.length > 0) {
            double sum = 0;
            for (int i = 0; i <employees.length ; i++) {
                sum += employees[i].getEmployeeSalary();
            }
            average = sum / employees.length;
        }
        return average;
    }

    private static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


    public static void printAverageSalary(Employee[] employees) {
        System.out.println("Средняя зарплата: " + averageSalary(employees));
    }

    public static void printSumSalary(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты за месяц: " + sumSalary(employees));
    }
    public static void printMaxSalary(Employee[] employees) {
        System.out.println("Максимальная зарплата: " + employees[idEmployeeOfMaxSalary(employees)].getEmployeeSalary());
    }
    public static void printEmployeeOfMaxSalary(Employee[] employees) {
        System.out.println("Максимальная зарплата у сoтрудника " + employees[idEmployeeOfMaxSalary(employees)].getNameOfEmployee());
    }
    public static void printMinSalary(Employee[] employees) {
        System.out.println("Минимальная зарплата: " + employees[idEmployeeOfMinSalary(employees)].getEmployeeSalary());
    }
    public static void printEmployeeOfMinSalary(Employee[] employees) {
        System.out.println("Минимальная зарплата у сотрудника " + employees[idEmployeeOfMinSalary(employees)].getNameOfEmployee());
    }

}