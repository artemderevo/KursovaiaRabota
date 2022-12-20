import java.util.Objects;

public class Employee {

    private String nameOfEmployee;
    private String surnameOfEmployee;
    private String patronymicOfEmployee;
    private int departamentNumber;
    private double employeeSalary;
    public static int counter = 1;
    private int id;

    public Employee(String name, String surname, String patronymic, int departament, double salary) {
        this.nameOfEmployee = name;
        this.surnameOfEmployee = surname;
        this.patronymicOfEmployee = patronymic;
        this.departamentNumber = departament;
        this.employeeSalary = salary;
        this.id = counter;
        counter++;

    }
    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departamentNumber == employee.departamentNumber && Double.compare(employee.employeeSalary, employeeSalary) == 0 && id == employee.id && Objects.equals(nameOfEmployee, employee.nameOfEmployee) && Objects.equals(surnameOfEmployee, employee.surnameOfEmployee) && Objects.equals(patronymicOfEmployee, employee.patronymicOfEmployee);

    }


    public String getNameOfEmployee() {return this.nameOfEmployee;}
    public String getSurnameOfEmployee() {return this.surnameOfEmployee;}
    public String getPatronymicOfEmployee() {return  this.patronymicOfEmployee;}
    public void setNameOfEmployee() {this.nameOfEmployee = nameOfEmployee;}
    public void setSurnameOfEmployee() {this.surnameOfEmployee = surnameOfEmployee;}
    public void setPatronymicOfEmployee() {this.patronymicOfEmployee = patronymicOfEmployee;}
    public int getDepartamentNumber() {return this.departamentNumber;}
    public void setDepartamentNumber() {this.departamentNumber = departamentNumber;}
    public double getEmployeeSalary() {return this.employeeSalary;}
    public void setEmployeeSalary() {this.employeeSalary = employeeSalary;}
    @Override
    public String toString() {return "Имя: " + this.nameOfEmployee + ", фамилия: " +  this.surnameOfEmployee + ", отчетсво: " + this.patronymicOfEmployee + ", отдел:" + this.departamentNumber + ", зарплата: " + this.employeeSalary + ", id: " + id;}
    @Override
    public int hashCode() {return Objects.hash(nameOfEmployee, surnameOfEmployee, patronymicOfEmployee, departamentNumber, employeeSalary, id); }

}