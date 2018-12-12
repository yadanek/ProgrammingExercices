package programLoader;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramLoader {

    private final ProgramMemory programMemory;
    private Integer key;
    private String value;

    public ProgramLoader(ProgramMemory programMemory) {
        this.programMemory = programMemory;
     /*   for (Map.Entry<Integer, String> intigerStringEntry : programMemory.getOperations().entrySet()) {
            String value = intigerStringEntry.getValue();
            Integer key = intigerStringEntry.getKey();
        }*/

    }


    void load(String instruction){

        String regex = "(\\d+) (.*)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(instruction);
        if (matcher.find()){
            key =Integer.parseInt( matcher.group(1));
            value = matcher.group(2);
        }

        programMemory.getOperations().put(key, value);
        programMemory.getOperationAdresses().add(key);

    }

 /*   //Macher
    String line = "123 dsvtr trgtrb gr";
    String pattern = "(\\d+) (.*)";
    Pattern r = Pattern.compile(pattern);

    Matcher m = r.matcher(line);

    void divideString(){
        if (m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else{
            System.out.println("nothing found");
        }
    }*/



    /*String variable = "2 zrob coś z tym";
    String[] tab = variable.split(" ", 1);
    int adress = Integer.parseInt(tab[0]);
    String instruction = tab[1];



    void load(String instruction){


    }*/

}
