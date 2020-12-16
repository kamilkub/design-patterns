package pl.designs_test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.designs.builder.BuilderPattern;
import pl.designs.singleton.SingletonPattern;

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


    @Test
    @DisplayName("#2 Testing Singleton design pattern")
    void testSingletonPattern(){
        SingletonPattern pattern = SingletonPattern.getInstance();
        SingletonPattern pattern2 = SingletonPattern.getInstance();

        assertEquals(pattern2, pattern);

    }

}
