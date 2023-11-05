package pl.designs_test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.designs.behavioral.iterator.Iterator;
import pl.designs.behavioral.iterator.ThemeColor;
import pl.designs.behavioral.observer.Order;
import pl.designs.behavioral.observer.OrderObserver;
import pl.designs.behavioral.state.*;
import pl.designs.creational.builder.BuilderPattern;
import pl.designs.creational.singleton.EagerSingletonPattern;
import pl.designs.structural.adapter.RoundHole;
import pl.designs.structural.adapter.SquarePeg;
import pl.designs.structural.adapter.SquarePegAdapter;

import java.util.UUID;

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

        pattern = new BuilderPattern.Builder()
                .id(1L)
                .name("testName")
                .build();


        assertEquals( 1L, pattern.getId());
        assertEquals( "testName", pattern.getName());

    }


    @Test
    @DisplayName("#2 Testing Singleton design pattern")
    void testSingletonPattern(){
        EagerSingletonPattern pattern = EagerSingletonPattern.getInstance();
        EagerSingletonPattern pattern2 = EagerSingletonPattern.getInstance();

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
    @DisplayName("#3 Testing Iterator design pattern")
    void testIteratorDesignPattern() {
        assertEquals(4, ThemeColor.values().length);
        assertNotNull(ThemeColor.getIterator());

        Iterator<ThemeColor> iterator = ThemeColor.getIterator();

        assertNotNull(iterator.next());
        assertNotNull(iterator.next());
        assertNotNull(iterator.next());
        assertNotNull(iterator.next());
        assertThrows(ArrayIndexOutOfBoundsException.class, iterator::next);
    }

    @Test
    @DisplayName("#3 Testing Observer design pattern")
    void testObserverDesignPattern() {
        // given
        Order order = new Order(UUID.randomUUID().toString());


        // when
        order.attach(new OrderObserver());

        //then
        order.addItem(50);
        assertEquals(0, order.getDiscount());

        order.addItem(50);
        assertEquals(0, order.getDiscount());

        order.addItem(50);
        assertEquals(0, order.getDiscount());

        order.addItem(50);
        assertEquals(50, order.getDiscount());


    }

    @Test
    @DisplayName("#3 Testing State design pattern")
    void testStateDesignPattern() {
        // given
        pl.designs.behavioral.state.Order order = new pl.designs.behavioral.state.Order();

        // then
        assertTrue(order.getState() instanceof New);

        order.paymentSuccessful();
        assertTrue(order.getState() instanceof Paid);

        order.dispatched();
        assertTrue(order.getState() instanceof InTransit);

        order.delivered();
        assertTrue(order.getState() instanceof Delivered);

        order.cancel();
        assertTrue(order.getState() instanceof Cancelled);

        assertThrows(IllegalStateException.class, order::cancel);
    }

}
