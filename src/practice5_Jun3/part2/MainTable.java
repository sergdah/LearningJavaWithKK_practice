package practice5_Jun3.part2;

public class MainTable {
    public static void main(String[] args) {
        // Создаем студентов и сотрудников
        Student student1 = new Student("Ян", "Иванов", "IT-факультет");
        Student student2 = new Student("Анналов", "Нет", "Экономический");
        Employee employee1 = new Employee("Олегрова", "Сергеев", 1500.0);

        Table<Integer, Student> table1 = new Table<>(101, student1);
        Table<Integer, Student> table2 = new Table<>(102, student2);
        Table<Integer, Employee> table3 = new Table<>(103, employee1);

        System.out.println("");
        table1.printPersonName();
        table2.printPersonName();
        table3.printPersonName();
    }
}