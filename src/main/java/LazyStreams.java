import java.util.stream.IntStream;

public class LazyStreams {

    public static int multByTwo(int n) {
        System.out.printf("Inside multByTwo with arg %d%n", n);
        return n * 2;
    }

    public static boolean divByThree(int n) {
        System.out.printf("Inside divByThree with arg %d%n", n);
        return n % 3 == 0;
    }

    public static void main(String[] args) {
        // Find first even double between 200 and 400 divisble by 3
        int firstEvenDivBy3 = IntStream.range(100, 200)
                .map(LazyStreams::multByTwo)
                .filter(LazyStreams::divByThree)
                .findFirst()
                .orElse(0);
        System.out.printf("First even divisible by 3 is %d%n", firstEvenDivBy3);
    }
}
