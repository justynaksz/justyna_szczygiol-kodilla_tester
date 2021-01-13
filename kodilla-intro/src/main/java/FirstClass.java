public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.findYourPerfectNotebook();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.findYourPerfectNotebook();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + "" + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.findYourPerfectNotebook();

        Notebook blackNotebook = new Notebook(1500, 2200, 2020);
        System.out.println(blackNotebook.weight + " " + blackNotebook.price + " " + blackNotebook.year);
        blackNotebook.checkPrice();
        blackNotebook.checkWeight();
        blackNotebook.findYourPerfectNotebook();

        Notebook greenNotebook = new Notebook(1000, 1200, 2017);
        System.out.println(greenNotebook.weight + " " + greenNotebook.price + " " + greenNotebook.year);
        greenNotebook.checkPrice();
        greenNotebook.checkWeight();
        greenNotebook.findYourPerfectNotebook();

        Notebook whiteNotebook = new Notebook(800, 900, 2019);
        System.out.println(whiteNotebook.weight + " " + whiteNotebook.price + " " + whiteNotebook.year);
        whiteNotebook.checkPrice();
        whiteNotebook.checkWeight();
        whiteNotebook.findYourPerfectNotebook();
    }
}

