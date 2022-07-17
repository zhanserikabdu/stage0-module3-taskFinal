package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int rev = 0; // reversed number
        int rem;   // remainder

        while(number>0){

            rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;
        }

        return rev;
    }

}
