package com.dubbotest.svcB.filters;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.RpcException;

public class PassFatTagFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		String fatTag = invocation.getAttachment(Constants.TAG_KEY);
		if (fatTag != null)
		{
			RpcContext.getContext().setAttachment(Constants.TAG_KEY, fatTag);	
		}
		Result result = invoker.invoke(invocation);
        return result;
	}

}
