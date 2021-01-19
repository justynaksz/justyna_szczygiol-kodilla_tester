import java.util.Random;

public class RandomNumbers {

    Random random = new Random();
    int result = 0;
    int sum = 0;
    int temp = random.nextInt(30);

    public int getResult() {
        while (sum < 5000) {
        sum = sum + temp;
        result++;
        }
        return result;
    }

    public int biggestNumber() {
        int max = 0;
        for (int i = 0; i < getResult() - 1; i++) {
            if (max < temp) {
                max = temp;
            }
            return max;
        }
        return max;
    }

    public int leastNumber() {
        int min = 30;
        for (int i = 0; i < getResult() - 1; i++) {
            if (min > temp) {
                min = temp;
            }
            return min;
        }
        return min;
    }
}

