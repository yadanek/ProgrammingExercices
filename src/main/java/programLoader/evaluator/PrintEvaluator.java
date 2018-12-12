package programLoader.evaluator;


import programLoader.Evaluator;
import programLoader.ProgramMemory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintEvaluator implements Evaluator {

    public static final String MARKER = "\\$";
    private final ProgramMemory programMemory;

    public PrintEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    String regex = MARKER + "\\S\\w*";

    @Override
    public void evaluate(String string) {

        List<String> names = new LinkedList<>();
        Pattern pattern = Pattern.compile(MARKER + "(\\S*)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            names.add(matcher.group(1));
        }

        for (String name : names) {
            String s = programMemory.getVariables().get(name);
            if (s != null) {
                string = string.replaceFirst(MARKER+name, s);
            }
        }
        System.out.println(string);
    }

    /* ProgramMemory programMemory;
    public void print(String rest){
        System.out.println(rest);
    }*/


}
