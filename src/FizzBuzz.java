public class FizzBuzz {

    private static final Integer FIZZ = 3;
    private static final Integer BUZZ = 5;

    public static void main(String... args) {
        for (int i = 1; i <= 100; i++) {

            String result = "";

            if (i % FIZZ == 0) {
                result = result + "fizz";
            }

            if (i % BUZZ == 0) {
                result = result + "buzz";
            }

            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}