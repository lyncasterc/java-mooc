package Part2;

public class Methods {
    public static void main(String[] args) {
//        fromParamToOne(5);
//        divisibleByThreeInRange(3, 6);
        System.out.println(sum(4, 2));
        System.out.println("min: " + min(4, 2));
    }

    public static void fromParamToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void divisibleByThreeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int num1, int num2, int... rest) {
        int sum = num1 + num2;

        if (rest.length > 0) {
            for (int num : rest) {
                sum += num;
            }
        }

        return sum;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

}
