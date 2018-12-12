package fizzbuzz;

public class FizzBuzz {


    String playGames(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();


        if (number % 3 == 0) {
            stringBuilder.append("FIZZ");
        }
        if (number % 5 == 0) {
            stringBuilder.append("BUZZ");
        }
        String message = stringBuilder.toString();
        return message.isEmpty() ? number.toString() : message;
    }


}
