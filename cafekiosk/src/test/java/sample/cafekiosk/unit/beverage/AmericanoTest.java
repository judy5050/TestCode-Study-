package sample.cafekiosk.unit.beverage;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();

//        Assertions.assertEquals(americano.getName(), "아메리카노");
        org.assertj.core.api.Assertions.assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();
        Assertions.assertThat(americano.getPrice()).isEqualTo(4000);
    }

}