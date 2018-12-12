package programLoader.evaluator;


import programLoader.Evaluator;
import programLoader.ProgramMemory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetEvaluator implements Evaluator {

    private final ProgramMemory programMemory;

    public SetEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String string) {
        Pattern pattern = Pattern.compile("(.\\S+) (.*)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String filedName = matcher.group(1);
            String filedValue = matcher.group(2);
            programMemory.getVariables().put(filedName, filedValue);
        }

    }


    /*public ProgramMemory programMemory = new ProgramMemory();


    public void setVariables(String operation, String rest) {
        variables.put(operation, rest);
    }*/
}
