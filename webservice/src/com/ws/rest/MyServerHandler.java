package com.ws.rest;

import java.util.Iterator;
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

public class MyServerHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isResponse = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (isResponse) {
			System.out.println("Response");
		} else {
			try {
				SOAPMessage message = context.getMessage();

				SOAPEnvelope envelope = message.getSOAPPart()
				                               .getEnvelope();

				SOAPHeader soapHeader = envelope.getHeader();
				if (soapHeader != null) {
					Iterator<?> childElements = soapHeader.getChildElements();
					if (childElements != null) {
						while (childElements.hasNext()) {
							Object next = childElements.next();
							if (next instanceof SOAPElement) {
								SOAPElement soapElement = (SOAPElement) next;
								String nodeName = soapElement.getNodeName();
								if ("Auth".equals(nodeName)) {
									String username = soapElement.getAttribute("username");
									String password = soapElement.getAttribute("password");
									System.out.println("Auth : "
									                   + username
									                   + ":"
									                   + password);

								}
							}
						}
					}
				}

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
