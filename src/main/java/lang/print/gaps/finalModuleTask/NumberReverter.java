package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public void revert(int number) {
        String res = "";
        while (number != 0) {
            int temp = number % 10;
            number = number / 10;
            res += temp;
        }
        System.out.println(res);
    }
}
