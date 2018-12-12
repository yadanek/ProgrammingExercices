package programLoader;

import lombok.extern.log4j.Log4j2;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class ProgramEvaluator {
    private final ProgramMemory programMemory;

    ProgramEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;

        //SET name Przemek
        //SET surname Zawadzki
        //GET name2 name
       // String name = "Przemek";
       // String name2 = name;
        //PRINT Uczy nas $name $surname
        //String nameFild = "sjdh 3";  //SET nameFild sjdh 3
    }


    public void evaluate() {

        while (programMemory.hasNextOperation()){
            String instruction = programMemory.getNextOperation();
            evaluateInstruction(instruction);
        }

    }

    public void evaluateInstruction(String instruction) {

        Pattern pattern = Pattern.compile("([A-Z]+) (.*)");
        Matcher matcher = pattern.matcher(instruction);
        if (matcher.find()) {
            String instructionType = matcher.group(1);
            String arguments = matcher.group(2);
            try {
                InstructionType type = InstructionType.valueOf(instructionType);
                Evaluator evaluator = EvaluatorBuilder.createEvaluator(type, programMemory);
                evaluator.evaluate(arguments);
            } catch (IllegalArgumentException e) {
                log.warn("Instruction of type {} is not found", instructionType);
            }
        }
    }

}



