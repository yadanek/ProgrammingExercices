package programLoader;

public class ProgramMain {
    public static void main(String[] args) {
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader programLoader = new ProgramLoader(programMemory);
        programLoader.load("9 SET name Przemek");
        programLoader.load("10 SET name2 Gienio");
       // programLoader.load("11 SET 16 PRINT hello $name jest kolegą $name2 $name");
        programLoader.load("12 GOTO 16");
        programLoader.load("13 PRINT hello");
        programLoader.load("14 PRINT hello2");
        programLoader.load("15 PRINT hello kdjf");
        programLoader.load("16 PRINT hello $name jest kolegą $name2 $name");
        programLoader.load("17 PRINT hello $name4");
        programLoader.load("18 CAL 9/0");
        programLoader.load("19 CAL 10/5");
        programLoader.load("20 CAL 2*3");
        programLoader.load("21 GET name4 name");

        ProgramEvaluator programEvaluator = new ProgramEvaluator(programMemory);
        programEvaluator.evaluate();
    }
}
