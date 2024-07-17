package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {
    /**
     * Metodo que se encarga en realizar la suma entre dos numeros dados en parametro
     * @param numA
     * @param numB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numA,int numB){
        Add addRequest = new Add();
        addRequest.setIntA(numA);
        addRequest.setIntB(numB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
                this.getDefaultUri(),
                addRequest,
                soapActionCallback
        );
    }

    /**
     * Metodo que se encarga en realizar la resta entre dos numeros dados en parametro
     * @param numA
     * @param numB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numA,int numB){
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numA);
        subtractRequest.setIntB(numB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
                this.getDefaultUri(),
                subtractRequest,
                soapActionCallback
        );
    }

    /**
     * Metodo que se encarga en realizar la multiplicacion entre dos numeros dados en parametro
     * @param numA
     * @param numB
     * @return MultiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numA, int numB){
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numA);
        multiplyRequest.setIntB(numB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
                this.getDefaultUri(),
                multiplyRequest,
                soapActionCallback
        );
    }
    /**
     * Metodo que se encarga en realizar la division entre dos numeros dados en parametro
     * @param numA
     * @param numB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse(int numA,int numB){
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numA);
        divideRequest.setIntB(numB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(this.getDefaultUri(),divideRequest,soapActionCallback);
    }
}
