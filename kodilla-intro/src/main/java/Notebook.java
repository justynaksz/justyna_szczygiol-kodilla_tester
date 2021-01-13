public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price <= 1000) {
            System.out.println("This price is good.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        }
        else if (this.weight <= 1500) {
            System.out.println("This notebook is not that heavy.");
        }
        else {
            System.out.println("This notebook is really heavy.");
        }
    }

    public void findYourPerfectNotebook() {
        if (this.price >= 1000 && this.year >= 2019) {
            System.out.println("This notebook is modern but too expensive.");
        }
        else if (this.price < 1000 && this.year < 2019) {
            System.out.println("This notebook is cheap but too old.");
        }
        else if (this.price >= 1000 && this.year < 2019) {
            System.out.println("This notebook is too expensive and too old.");
        }
        else {
            System.out.println("This notebook is perfect for you.");
        }
    }

}
