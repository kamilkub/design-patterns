package pl.designs.behavioral.interpreter;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Client {

    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDateTime time = LocalDateTime.now(Clock.system(ZoneId.of("America/Los_Angeles")));

        System.out.println(time);
    }
}
