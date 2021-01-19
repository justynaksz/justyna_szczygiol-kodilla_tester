import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;

    public void getRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
    }

    public int biggestNum() {
        return max;
    }

    public int leastNum() {
        return min;
    }

    public static void main(String[] args) {
        RandomNumbers randomNum = new RandomNumbers();
        randomNum.getRandomNumbers();
        randomNum.biggestNum();
        randomNum.leastNum();
        System.out.println(randomNum.biggestNum());
        System.out.println(randomNum.leastNum());
    }
}
