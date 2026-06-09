package practice5_Jun3.part2;

class Table<T, P extends Character> {
    T idNumber; // Инвентарный номер стола
    P person;   // Персонаж за столом

    public Table(T idNumber, P person) {
        this.idNumber = idNumber;
        this.person = person;
    }

    // 6. Метод, который выводит имя персонажа за столом
    public void printPersonName() {
        if (person != null) {
            System.out.println("За столом №" + idNumber + " сидит: " + person.firstName + " " + person.lastName);
        } else {
            System.out.println("За столом №" + idNumber + " никто не сидит.");
        }
    }
}
