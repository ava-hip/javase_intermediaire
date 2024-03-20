package fr.dawan.consolidation.apitime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        /*
         * Temps machine
         */

        // Instant
        System.out.println("Instant.EPOCH=" + Instant.EPOCH);
        System.out.println("Instant.now=" + Instant.now());

        Instant inst1 = Instant.parse("2024-03-01T15:30:00Z");
        System.out.println(inst1);

        System.out.println(inst1.getEpochSecond());
        long inst1Ms = inst1.toEpochMilli();
        System.out.println(inst1Ms);

        // Duration
        for(int i=0; i<100; i++) {
            System.out.println("");
        }
        Instant inst2 = Instant.now();
        Duration duree = Duration.between(inst1, inst2);
        System.out.println(duree);

        Duration duree2 = Duration.parse("P2DT3H30M0.0S");
        System.out.println(duree2);

        /*
         * Temps humain
         */
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2000, Month.JUNE, 4));
        System.out.println(LocalDate.now().getMonth());

        System.out.println(LocalDate.now().plusYears(3).plusMonths(3));

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Fuseau horaire
        ZoneId fuseau = ZoneId.systemDefault();
        System.out.println(fuseau);

        ZoneId fuseauNy = ZoneId.of("America/New_York");
        System.out.println(fuseauNy);


        ZonedDateTime zdt = LocalDateTime.now().atZone(ZoneId.systemDefault());
        System.out.println(zdt);

        System.out.println(zdt.withZoneSameInstant(fuseauNy));

        ZoneId fuseauLa = ZoneId.of("Etc/GMT-7");
        System.out.println(zdt.withZoneSameInstant(fuseauLa));

        // Period
        Period per1 = Period.between(LocalDate.now(), LocalDate.of(2024, 07, 29));
        System.out.println(per1);

        per1 = LocalDate.now().until(LocalDate.of(2024, 07, 29));
        System.out.println(per1);
    }
}
