package pl.designs_test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.designs.builder.BuilderPattern;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DesignPatternTest {


    @Test
    @DisplayName("#1 Testing Builder design pattern")
    void testBuilderPattern(){
        BuilderPattern pattern =
                            new BuilderPattern
                                    .Builder().build();
        assertNull(pattern.getId());
        assertNull(pattern.getName());

        pattern = new BuilderPattern.Builder().id(1L).name("testName").build();


        assertEquals( 1L, pattern.getId());
        assertEquals( "testName", pattern.getName());

    }

}
