package programLoader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GotoEvaluator implements Evaluator {
    private final ProgramMemory programMemory;
    public Integer adress = 0;

    protected GotoEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String string) {
        adress = 0;
        Pattern pattern = Pattern.compile("\\w+(\\d+)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            adress = Integer.parseInt(matcher.group(0));
            Integer indexOf = programMemory.getOperationAdresses().indexOf(adress);
            if(indexOf >= 0){
            programMemory.setIndex(indexOf);
            }
        }
        //mamy adres instrukcji i teraz musimy wskoczyc
        // do getOperation() pod ten adres i cała sprawę od początku, czyli od ProgramEvaluatora




        
        /*for (Map.Entry<Integer, String> integerStringEntry : programMemory.getOperations().entrySet()) {
            if (integerStringEntry.getKey().equals(adress)) {                //com. pz. po pierwsze nigdy nie porownujemy
                // poprzez == to dziala dlatego ze integer jest cache-owany od 0 do 127
                //com. pz. po drugie mozna wykorzystac metode get z mapy co robisz linijke nizej wiec nie widze sensu tej petli
                //com. pz. po trzecie metoda get moze zwrocic null wiec warto sie na to zabezpieczyc
                programEvaluator.evaluateInstruction(programMemory.getOperations().get(adress));
            }
        }*/
    }
}
