package pl.zajecia.dod_2026;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dod2026ApplicationTest {

    @Test
    void added() {
        Dod2026Application test = new Dod2026Application();
        assertEquals(test.added(5,5),10);
    }
}