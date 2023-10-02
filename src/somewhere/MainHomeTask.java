package somewhere;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class MainHomeTask {

    public static void main(String[] args) {
        List<Integer> list = generateList();

        System.out.println(list);

        Collection<Integer> listMore = printMoreThenPrevious(list);

        System.out.println(listMore);

        printMinimalPositiveNumber(list);

    }

    public static List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(-100, 100);
            list.add(randomNumber);
        }

        return list;
    }

    public static List<Integer> printMoreThenPrevious(List<Integer> list) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                answer.add(list.get(i));
            }
        }
        return answer;
    }

    public static void printMinimalPositiveNumber(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer > 0 && integer < min) {
                min = integer;
            }
        }
        System.out.println(min);
    }

}
