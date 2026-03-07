package demo;

import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void shouldOpen() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
