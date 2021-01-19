public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User franek = new User("Franciszek", 25);
        User tomek = new User("Tomasz", 19);
        User ola = new User("Aleksandra", 43);
        User maciek = new User("Maciej", 85);
        User pola = new User("Apolonia", 1);

        User[] users = new User[5];
        users[0] = franek;
        users[1] = tomek;
        users[2] = ola;
        users[3] = maciek;
        users[4] = pola;

        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        double average = sum / users.length;
        System.out.println(average);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}
