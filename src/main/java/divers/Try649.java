package divers;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Try649 {
    public static final int _6OUTOF49 = 6;
    public static final int _OUTOF49 = 49;
    private static Set<Integer> numbers = new HashSet<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        IntStream.range(0, _6OUTOF49)
                .forEach(i -> addRandomValueToSet(i));

        numbers.stream()
                .forEach(System.out::println);
    }

    private static void addRandomValueToSet(int i) {
        numbers.add(random.nextInt(_OUTOF49) + 1);
    }
}
