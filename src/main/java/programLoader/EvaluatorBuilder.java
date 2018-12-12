package programLoader;


import programLoader.evaluator.GetEvaluator;
import programLoader.evaluator.PrintEvaluator;
import programLoader.evaluator.SetEvaluator;


public class EvaluatorBuilder {

    public static Evaluator createEvaluator(InstructionType type, ProgramMemory programMemory) {
        Evaluator evaluator;
        switch (type) {
            case PRINT:
                evaluator = new PrintEvaluator(programMemory);
                break;
            case SET:
                evaluator = new SetEvaluator(programMemory);
                break;
            case GET:
                evaluator = new GetEvaluator(programMemory);
                break;
            case CAL:
                evaluator = new CalEvaluator(programMemory);
                break;
            case GOTO:
                evaluator = new GotoEvaluator(programMemory);
                break;
            default:

                Evaluator emptyEvaluator = (String string) -> { };
                evaluator = emptyEvaluator;
        }
        return evaluator;
    }
}
