package programLoader;

import java.util.*;

public class ProgramMemory {


    private Map<Integer, String> operations = new TreeMap<>();
    private List<Integer> operationAdresses = new ArrayList<>();
    private Map<String, String> variables = new HashMap<>();
    private Integer index;
    ProgramMemory(){
        index = 0;
    }

    public Map<Integer, String> getOperations() {
        return operations;
    }


    public Map<String, String> getVariables() {
        return variables;
    }

    public boolean hasNextOperation() {

        return index < operationAdresses.size();
    }

    public String getNextOperation() {

        return operations.get(operationAdresses.get(index++));
    }

    public List<Integer> getOperationAdresses() {
        return operationAdresses;
    }

    public void setIndex(Integer index) {
        this.index = index;
        System.out.println("index: " + index);
    }
}
