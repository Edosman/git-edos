/**
 * Java. Level 1. Lesson 5. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 27, 2018
 */

class HomeWork_5 {

    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Васильев Сергей Александрович", "Инжинер", "vasil.s@mail.ru", "89156452358", 65000, 45);
        personArray[1] = new Person("Невзоров Иван Александрович", "Маркетолог", "nevzorovIvan@ya.ru", "89175489632", 100000, 39);
        personArray[2] = new Person("Самойлов Александр Викторович", "Фотограф", "sam@gmail.com", "89154781122", 120000, 33);
        personArray[3] = new Person("Степанов Илья Анатольевич", "Программист", "stepanov.i@mail.ru", "89032156489", 110000, 53);
        personArray[4] = new Person("Гуськова Екатерина Сергеевна", "Бухгалтер", "katuxa@gmail.com", "89175842369", 55000, 42);
        personArray[0].setSalary(350000); // проверка подмены

        personAgeMore40(personArray);
    }

    static void personAgeMore40(Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].age > 40)
                System.out.println(Person.toString(personArray[i]));
        }
    }
}

class Person {
    String fullName;
    String position;
    String email;
    String phone;
    private int salary;
    int age;

    Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        if (salary != this.salary)
            salary = this.salary;
        this.salary = salary;
    }

    static String toString(Person person) {
        return person.fullName + ", " + person.position + ", " + person.email + ", " + person.phone + ", " + person.getSalary() + ", " + person.age;
    }
}

