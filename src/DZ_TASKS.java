import java.util.ArrayList;
import java.util.*;

public class DZ_TASKS {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(100));

        }
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println("=".repeat(80));
        System.out.println(list);

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println("=".repeat(80));
        System.out.println(list);
        System.out.println("=".repeat(80));

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
            if (list.get(i) < min) min = list.get(i);

        }

        System.out.printf("Максимальный элемент списка: %d", max);
        System.out.printf('\n'+"Минимальный элемент списка: %d", min);
        System.out.println('\n'+"=".repeat(80));


        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.add(new Random().nextInt(100));

        }
        System.out.println(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println("=".repeat(80));


        long begin = System.currentTimeMillis();

        for (int i = 0; i <= 10000 ; i++) {
            list.add(0,0);
        }
        System.out.println(list);

        long end = System.currentTimeMillis();

        System.out.println("Время с эррэйлистом: ");
        System.out.print(end - begin +"\n");



        begin = System.currentTimeMillis();

        LinkedList<Integer> linked_integers = new LinkedList<>();
        for (int i = 0; i <= 10000 ; i++) {
            linked_integers.add(0,0);
        }
        System.out.println(linked_integers);
        end = System.currentTimeMillis();

        System.out.println("Время с линкедлистом: ");
        System.out.print(end - begin);







    }
}
