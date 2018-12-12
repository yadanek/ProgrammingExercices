package programLoader;

import lombok.extern.log4j.Log4j2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class CalEvaluator implements Evaluator{

    private final ProgramMemory programMemory;

    public CalEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String string) {
        Pattern pattern = Pattern.compile("(\\d+)\\s*([\\+,\\-,\\*,\\/])\\s*(\\d+)\\s*");
        Matcher matcher = pattern.matcher(string);
        int arg1 = 0;
        int arg2 = 0;
        String sign = null;
        Integer result;
        if(matcher.find()){
            arg1 = Integer.parseInt(matcher.group(1));
            arg2 = Integer.parseInt(matcher.group(3));
            sign = matcher.group(2);
        }
        switch (sign) {                 //przez to ze switch jest poza blokiem if tym wyzej moze byc null-em
            case "+":
               result = Math.addExact(arg1, arg2);
                System.out.println("Result: " + result);
               break;
            case "-":
                result = Math.subtractExact(arg1, arg2);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = Math.multiplyExact(arg1,arg2);
                System.out.println("Result: " + result);
                break;
            case "/":
                if(arg2 != 0){
                result = arg1/arg2;
                    System.out.println("Result: " + result);
                } else {
                log.warn("Dzielnik nie może być 0!");
                }
                break;
        }

    }
}
