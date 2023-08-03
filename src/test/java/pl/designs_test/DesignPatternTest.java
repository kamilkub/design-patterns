package pl.designs_test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.designs.structural.adapter.RoundHole;
import pl.designs.structural.adapter.SquarePeg;
import pl.designs.structural.adapter.SquarePegAdapter;
import pl.designs.structural.bridge.Animal;
import pl.designs.structural.bridge.BaseMammal;
import pl.designs.structural.bridge.Lion;
import pl.designs.structural.bridge.PredatorMammal;
import pl.designs.creational.builder.BuilderPattern;
import pl.designs.structural.proxy.CachedYoutube;
import pl.designs.structural.proxy.ThirdPartyYoutubeLib;
import pl.designs.structural.proxy.YoutubeManager;
import pl.designs.structural.proxy.YoutubeThirdParty;
import pl.designs.creational.singleton.SingletonPattern;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("#3 Testing Adapter design pattern")
    void testAdapterDesignPattern() {
        RoundHole hole = new RoundHole(5);

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg bigSqPeg = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter bigAdapter = new SquarePegAdapter(bigSqPeg);

        assertTrue(hole.fits(smallAdapter));
        assertFalse(hole.fits(bigAdapter));


    }

    @Test
    @DisplayName("#4 Testing Bridge design pattern")
    void testBridgeDesignPattern(){
        Animal lion = new Lion();

        BaseMammal smallLion = new BaseMammal(lion);
        assertFalse(smallLion.canWalk());
        assertFalse(smallLion.canHunt());
        PredatorMammal bigLion = new PredatorMammal(lion);
        assertTrue(bigLion.canHunt());
        assertTrue(bigLion.canWalk());
    }

    @Test
    @DisplayName("#5 Testing Proxy design pattern")
    void testProxyDesignPattern(){
        ThirdPartyYoutubeLib apiProxy = new YoutubeThirdParty();
        ThirdPartyYoutubeLib cachingClass = new CachedYoutube(apiProxy);
        YoutubeManager mainServiceClass = new YoutubeManager(cachingClass);


        assertEquals(1, mainServiceClass.renderVideosPanel().size());
        assertEquals("asd", mainServiceClass.renderVideoPage("asd").getVideoId());


    }

}
