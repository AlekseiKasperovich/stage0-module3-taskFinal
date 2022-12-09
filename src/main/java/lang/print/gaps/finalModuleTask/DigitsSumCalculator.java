package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int res = 0;
        while (number != 0) {
            int temp = number % 10;
            number = number / 10;
            res += temp;
        }
        System.out.println(res);
    }
}
