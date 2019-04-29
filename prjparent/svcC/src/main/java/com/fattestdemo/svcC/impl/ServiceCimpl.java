package com.dubbotest.svcC.impl;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.facade.callfromsvcB2svcC.callfromB2C;

@Service
public class ServiceCimpl implements callfromB2C
{
	@Value("${featuretest:defaultfeature}")
	private String feature;
	@Override
	public String getIDfromName(String name) {
		if (name == null)
		{
			return String.valueOf("null".hashCode()+" svcCfeature:"+feature);
		}
		return String.valueOf(name.hashCode()+" svcCfeature:"+feature);
	}

}
