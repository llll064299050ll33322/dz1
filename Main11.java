class Employee {
    private String name;
    private int id;
    private int department;
    private double salary;
    private static int counter = 1;

    public Employee(String name, int department, double salary) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int newDepartment) {
        this.department = newDepartment;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + "\n" +
                "Имя: " + name + "\n" +
                "Отдел: отдел #" + department + "\n" +
                "Зарплата: " + salary + "\n";
    }
}

public class Main11 {
    private Employee[] employees = new Employee[10];


    public void printEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }


    public double getSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    public Employee getEmployeeWithMinSalary() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                    minEmployee = employee;
                }
            }
        }
        return minEmployee;
    }


    public Employee getEmployeeWithMaxSalary() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) { // Исправлено: должно быть >
                    maxEmployee = employee;
                }
            }
        }
        return maxEmployee;
    }


    public double getAverageSalary() {
        int notNullCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                notNullCount++;
            }
        }
        if (notNullCount == 0) return 0;
        return getSumSalary() / notNullCount;
    }

    public void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {
        Main11 main = new Main11();
        main.employees[0] = new Employee("Воробьева Юлия Ярославовна", 1, 10000);
        main.employees[1] = new Employee("Морозов Богдан Русланович", 1, 15000);
        main.employees[2] = new Employee("Григорьев Илья Александрович", 3, 20000);
        main.employees[3] = new Employee("Дементьев Дмитрий Богданович", 2, 25000);
        main.employees[4] = new Employee("Полякова София Данииловна", 5, 30000);
        main.employees[5] = new Employee("Владимиров Максим Иванович", 4, 35000);
        main.employees[6] = new Employee("Лукина Ульяна Ярославовна", 1, 40000);
        main.employees[7] = new Employee("Свиридов Тихон Артёмович", 3, 45000);
        main.employees[8] = new Employee("Попов Егор Дмитриевич", 2, 50000);
        main.employees[9] = new Employee("Гаврилова Анна Руслановна", 5, 55000);

        System.out.println(" Все сотрудники: ");
        main.printEmployeesInfo();

        System.out.println(" Сумма зарплат: ");
        System.out.println(main.getSumSalary());

        System.out.println(" Сотрудник с минимальной зарплатой: ");
        Employee minEmployee = main.getEmployeeWithMinSalary();
        if (minEmployee != null) {
            System.out.println(minEmployee.toString());
        }

        System.out.println(" Сотрудник с максимальной зарплатой: ");
        Employee maxEmployee = main.getEmployeeWithMaxSalary();
        if (maxEmployee != null) {
            System.out.println(maxEmployee.toString());
        }

        System.out.println(" Средняя зарплата: ");
        System.out.println(main.getAverageSalary());

        System.out.println(" Ф.И.О. всех сотрудников: ");
        main.printAllNames();
    }

}
