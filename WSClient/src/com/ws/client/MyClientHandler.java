package com.ws.client;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class MyClientHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isOutbound = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (isOutbound) {
			try {
				SOAPMessage message = context.getMessage();
				SOAPFactory soapFactory = SOAPFactory.newInstance(); 
				
				SOAPElement sec = soapFactory.createElement(new QName("Auth"));
				sec.addAttribute(new QName("username"), "osman");
				sec.addAttribute(new QName("password"), "1234");
				
				SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
				
				SOAPHeader soapHeader = envelope.getHeader();
				if (soapHeader == null) {
					soapHeader = envelope.addHeader();
				}
				SOAPElement addChildElement = soapHeader.addChildElement(sec);
				
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
