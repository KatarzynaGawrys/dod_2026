package pl.zajecia.dod_2026;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Dod2026ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void added() {
        Dod2026Application test = new Dod2026Application();
        assertEquals(test.added(5,5),10);
    }
}
