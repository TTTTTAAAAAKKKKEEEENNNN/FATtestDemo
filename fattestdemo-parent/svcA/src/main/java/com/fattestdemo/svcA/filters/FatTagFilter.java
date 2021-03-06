package com.fattestdemo.svcA.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;

@WebFilter
public class FatTagFilter implements Filter {
	@Value("${featuretest:#{null}}")
	private String feature;
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws ServletException, IOException {
		if (feature != null)
		{
			RpcContext.getContext().setAttachment(Constants.TAG_KEY, feature);
		}
		chain.doFilter(req, resp);
	}

}
