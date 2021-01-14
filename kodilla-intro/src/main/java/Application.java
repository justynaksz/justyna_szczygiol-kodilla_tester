public class Application {
    public static void main(String[] args) {
        Person personOne = new Person("Adam", 40.5, 178);
        personOne.checkAgeAndHeight();
    }
}

class Person {
    String Name;
    double age;
    double height;

    public Person(String Name, double age, double height) {
        this.Name = Name;
        this.age = age;
        this.height = height;
    }

    public void checkAgeAndHeight() {
        if (this.Name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
