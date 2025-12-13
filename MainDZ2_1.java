class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }


    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}


class Employee2 extends Person {
    private double salary;


    public Employee2(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Зарплата: " + salary);
    }
}


public class MainDZ2_1 {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2("Кузнецов Василий Михайлович", 20, 50000);
        System.out.println("Сотрудник: " + employee2.getName() +
                "\n Возраст: " + employee2.getAge() +
                "\n Зарплата: " + employee2.getSalary());
    }
}
