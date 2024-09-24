import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(new Random().nextInt(0, 101));
        }
        System.out.println(nums);
        double averageNum = nums.stream().filter(evenNum -> evenNum % 2 == 0).mapToDouble(evenNum -> evenNum).average()
                .getAsDouble();
        System.out.print("Список четных чисел: ");
        nums.stream().filter(evenNum -> evenNum % 2 == 0).forEach(evenNum -> System.out.print(evenNum + " "));
        System.out.println();
        System.out.println("Среднее значение четных чисел: " + averageNum);
    }
}