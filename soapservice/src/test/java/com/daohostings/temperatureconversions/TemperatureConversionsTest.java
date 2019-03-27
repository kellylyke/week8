package com.daohostings.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap() {
    }

    @Test
    public void getTemperatureConversionsSoap1() {
    }

    @Test
    public void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    public void getTemperatureConversionsSoap121() {
    }
}