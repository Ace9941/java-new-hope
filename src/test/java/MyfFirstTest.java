import org.junit.jupiter.api.Test;

public class MyfFirstTest {
    private String name = "Lord";

    @Test
    public void firstTest() {
        System.out.println("Hello, corona!");

        int sum = sumTwoDigits(15 ,45);
        System.out.println("And the sum is: " + sum);

        System.out.println(sumTwoDigits(9, 13));
        System.out.println(sumTwoDigits(911, 100500));
        System.out.println(name);
    }

    private int sumTwoDigits(int a, int b) {
        System.out.println(name);
        int c = a + b;
        return c;
    }
}svzgz
