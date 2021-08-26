package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    @Test
    public void validateNoAnticipationDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 15, 30);

        Assert.assertTrue(cost == res);
    }

    @Test
    public void validateLastDayOfNoAnticipationDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 20, 30);

        Assert.assertTrue(cost == res);
    }

    @Test
    public void validateAnticipationDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 21, 30);

        Assert.assertTrue(850.0 == res);
    }

    @Test
    public void validateNoAgeDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 15, 30);

        Assert.assertTrue(cost == res);
    }

    @Test
    public void validateYoungDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 15, 15);

        Assert.assertTrue(950.0 == res);
    }

    @Test
    public void validateElderDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 15, 66);

        Assert.assertTrue(920.0 == res);
    }

    @Test
    public void validateYoungAndAnticipationDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 21, 16);

        Assert.assertTrue(800.0 == res);
    }

    @Test
    public void validateElderAndAnticipationDiscount() {
        double cost = 1000;
        double res = CalculadorDescuentos.calculoTarifa(cost, 21, 69);

        Assert.assertTrue(770.0 == res);
    }
}
