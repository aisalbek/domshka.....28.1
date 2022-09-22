import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = random.ints(0, 20).limit(20).boxed().toList();
        System.out.println(list);
        list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " ,"));
        System.out.println("\n"+list .stream().filter(x -> x % 2 == 0).max(Comparator.naturalOrder()).get());


    }
}