package ykarav.tut.Zuul_Proxy.filters;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter {

	@Override
	public Object run() {
	    System.out.println("Response from PROXY.. (pre filter)");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
