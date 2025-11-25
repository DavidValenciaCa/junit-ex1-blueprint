package ec.edu.epn;

public class TaxCalculator {

    double calculate(double valor,double impuesto){
        return valor * (1+(impuesto/100));
    }

}
