public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean fizz = false, buzz = false;

        int num = number;
        while (num > 0) {
            int test = num%10;
            num = num/10;
            if (test == 3) {
                fizz = true;
            } else if (test == 5) {
                buzz = true;
            }
        }

        boolean isFizz = number % 3 == 0 || fizz;
        boolean isBuzz = number % 5 == 0 || buzz;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
