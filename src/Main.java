//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.math.BigInteger;

public class Main {

    static BigInteger factorial(BigInteger number) {
        if (!number.equals(BigInteger.valueOf(1)) && !number.equals(BigInteger.valueOf(0))) {
            number = number.multiply(factorial(number.subtract(BigInteger.valueOf(1))));
        } else if (number.equals(BigInteger.valueOf(0))) {
            return BigInteger.valueOf(1);
        } else {
            return number;
        }


        return number;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //double start = Time.start_counter();
        //System.out.println(factorial(BigInteger.valueOf(100)));
        //double time = Time.stop_counter(start) * Math.pow(10, -9);
        //System.out.println(time + " seconds");

        new MainScreenGUI();
        for (double i = 1.01; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
