package com.dubbotest.svcB.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.facade.callfromsvcA2svcB.callfromA2B;
import com.facade.callfromsvcB2svcC.callfromB2C;

@Service/*(tag="fat1")*/
public class ServiceBimpl implements callfromA2B
{
	Logger logger = Logger.getLogger(ServiceBimpl.class.getName());
	
	@Reference
	private callfromB2C svcC;
	
	@Value("${featuretest:defaultfeature}")
	private String feature;
	@Override
	public String getNamefromSvcB(String source) {
		logger.log(Level.INFO, "Source:"+ source);
		if (source == null)
		{
			return "no name, since source is empty";
		}
		String name = source+source.length();
		return name + " hash:"+svcC.getIDfromName(name)+" svcBfeature:"+feature;
	}

}
