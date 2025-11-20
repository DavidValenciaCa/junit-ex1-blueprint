package ec.edu.ec;

import ec.edu.epn.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
   final Calculator calculator = new Calculator();

   // Metodo_parametros_resultadosEsperado
    @Test
    void add_TwoPositiveNumbers_ReturnCorrectSum(){
        //Arrange - Preparacion de la prueba
        int a = 3;
        int b = 4;

        //Act
        int result = calculator.add(a,b);

        //Assert
        assertEquals(7, result);

    }

    @Test
    void substract_TwoPositiveNumbers_ReturnCorrectSubstract(){
        // Arrange - Preparacion de la prueba
        int a = 5;
        int b = 4;

        //Act
        int result = calculator.subtract(a,b);

        //Assert
        assertEquals(1, result);
    }

    @Test
    void multiply_TwoPositiveNumbers_ReturnCorrectMultiply(){
        // Arrange - Preparacion de la prueba
        int a = 3;
        int b = 4;

        //Act
        int result = calculator.multiply(a,b);

        //Assert
        assertEquals(12, result);
    }

    @Test
    void divide_TwoPositiveNumbers_ReturnCorrectDivide(){
        // Arrange - Preparacion de la prueba
        int a = 5;
        int b = 4;

        //Act
        double result = calculator.divide(a,b);

        //Assert
        assertEquals(1.25, result,0);
    }

    @Test
    void a_NumberIsEven_ReturnCorrectResult(){
        // Arrange - Preparacion de la prueba
        int a = 8;

        //Act
        boolean result = calculator.isEven(a);

        //isEven
        assertTrue(result);
    }
}
