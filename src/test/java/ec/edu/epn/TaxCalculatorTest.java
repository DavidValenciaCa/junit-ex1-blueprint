package ec.edu.epn;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;



class TaxCalculatorTest {

    final TaxCalculator taxCalculator = new TaxCalculator();

    @ParameterizedTest
    @CsvSource({
            "12.5, 15, 14.375",
            "1.6, 12, 1.792",
            "10.0, 18, 11.8"
    })
    void add_tax(double valor,double impuesto, double expected){
        assertEquals(expected, taxCalculator.calculate(valor,impuesto), 0.001);
    }

}