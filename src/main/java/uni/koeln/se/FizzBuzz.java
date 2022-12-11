package uni.koeln.se;

public class FizzBuzz {
    public String convertNumber(int number) {
        String convert = "";
        if(number % 5 == 0)
            convert += "Fizz";
        if(number % 7 == 0)
            convert += "Buzz";
        return convert;
    }
}
