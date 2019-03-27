
package com.daohostings.temperatureconversions;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TemperatureConversionsSoapType", targetNamespace = "http://webservices.daehosting.com/temperature")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TemperatureConversionsSoapType {


    /**
     * Converts a Celsius Temperature to a Fahrenheit value
     * 
     * @param nCelsius
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "http://webservices.daehosting.com/temperature")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.CelsiusToFahrenheitResponse")
    public BigDecimal celsiusToFahrenheit(
        @WebParam(name = "nCelsius", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nCelsius);

    /**
     * Converts a Fahrenheit Temperature to a Celsius value
     * 
     * @param nFahrenheit
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "FahrenheitToCelsius")
    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "http://webservices.daehosting.com/temperature")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.FahrenheitToCelsiusResponse")
    public BigDecimal fahrenheitToCelsius(
        @WebParam(name = "nFahrenheit", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nFahrenheit);

    /**
     * Windchill temperature calculated with the formula of Steadman
     * 
     * @param nWindSpeed
     * @param nCelsius
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "WindChillInCelsius")
    @WebResult(name = "WindChillInCelsiusResult", targetNamespace = "http://webservices.daehosting.com/temperature")
    @RequestWrapper(localName = "WindChillInCelsius", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.WindChillInCelsius")
    @ResponseWrapper(localName = "WindChillInCelsiusResponse", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.WindChillInCelsiusResponse")
    public BigDecimal windChillInCelsius(
        @WebParam(name = "nCelsius", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nCelsius,
        @WebParam(name = "nWindSpeed", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nWindSpeed);

    /**
     * Windchill temperature calculated with the formula of Steadman
     * 
     * @param nWindSpeed
     * @param nFahrenheit
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "WindChillInFahrenheit")
    @WebResult(name = "WindChillInFahrenheitResult", targetNamespace = "http://webservices.daehosting.com/temperature")
    @RequestWrapper(localName = "WindChillInFahrenheit", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.WindChillInFahrenheit")
    @ResponseWrapper(localName = "WindChillInFahrenheitResponse", targetNamespace = "http://webservices.daehosting.com/temperature", className = "com.daohostings.temperatureconversions.WindChillInFahrenheitResponse")
    public BigDecimal windChillInFahrenheit(
        @WebParam(name = "nFahrenheit", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nFahrenheit,
        @WebParam(name = "nWindSpeed", targetNamespace = "http://webservices.daehosting.com/temperature")
        BigDecimal nWindSpeed);

}
