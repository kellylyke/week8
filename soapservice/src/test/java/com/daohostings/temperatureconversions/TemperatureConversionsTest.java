package com.daohostings.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Activity 2 - week 8
 * @author klyke
 */


public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap() {
    }

    @Test
    public void getTemperatureConversionsSoap1() {
    }

    @Test
    public void getCelsiusToFahrenheitSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }


    @Test
    public void getWindChillInFahrenheitSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(1) );
        assertEquals(BigDecimal.valueOf(32.46872), result);


    }

    @Test
    public void getWindChillInCelsiusSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(5) );
        assertEquals(BigDecimal.valueOf(-4.09), result);

    }

    @Test
    public void getFahrenheitToCelsiusSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(0), result);


    }

    @Test
    public void getTemperatureConversionsSoap121() {
    }
}