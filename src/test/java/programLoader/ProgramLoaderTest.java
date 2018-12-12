package programLoader;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProgramLoaderTest {

    @Test
    void shouldName() {
        //given
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader programLoader = new ProgramLoader(programMemory);
        //when
        programLoader.load("10 PRINT Hello world");
        //then
        String s = programMemory.getOperations().get(10);


        assertEquals("PRINT Hello world", s);
    }
}