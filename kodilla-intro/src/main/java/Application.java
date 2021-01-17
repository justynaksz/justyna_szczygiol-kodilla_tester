public class Application {
    public static void main(String[] args) {
        Person personOne = new Person("Adam", 40.5, 178);
        personOne.validateName();
        personOne.validateAgeAndHeight();
    }
}

class Person {
    String name;
    double age;
    double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateName() {
        if (this.name != null) {
            return true;
        }
        return true;
    }

    public void validateAgeAndHeight() {
        if (validateName()) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
