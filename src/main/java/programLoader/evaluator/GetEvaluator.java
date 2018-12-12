package programLoader.evaluator;



import programLoader.Evaluator;
import programLoader.ProgramMemory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetEvaluator implements Evaluator {

    private final ProgramMemory programMemory;
    private String value;

    public GetEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String string) {
        //SET name Przemek
        //GET name2 name
        //name == Przemek
        //name2 == Przemek
        Pattern pattern = Pattern.compile("(.\\S+) (.\\S+)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String filedName = matcher.group(1);
            String oldFiledVariable = matcher.group(2);
            String filedValue = programMemory.getVariables().get(oldFiledVariable);
            programMemory.getVariables().put(filedName, filedValue);
        }


    }

    public String getValue() {
        return value;
    }

   /* private  final ProgramMemory programMemory;

   public GetEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }
    public void evaluate(String string){
        value = programMemory.getVariables();
    }*/
}
