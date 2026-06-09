package practice5_Jun3.part2;

class Student extends Character {
    String faculty;

    public Student(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }
}