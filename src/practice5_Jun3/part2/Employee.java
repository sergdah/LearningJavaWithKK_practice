package practice5_Jun3.part2;

class Employee extends Character {
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
}

class Department {
    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
}