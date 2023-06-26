package com.synoris.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class UppercaseConverterMediator extends AbstractMediator { 

	private String name;
	
	Log log = LogFactory.getLog(UppercaseConverterMediator.class);
	public boolean mediate(MessageContext context) { 
		convertToUppercase(context);
		// TODO Implement your mediation logic here 
		return true;
	}
	private void convertToUppercase(MessageContext context) {
		
		String city = (String) context.getProperty("CITY");
		log.debug("values obtained from sequence is"+city);
		
		String converted = city.toUpperCase();
		context.setProperty("CONVERTED", name + "is lives at " + converted);
		
		
		
	}
}
