package cn.learn.structs;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.SortedMap;

/*自定以拦截器*/
public class MyInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation invocation)throws Exception{
        String output = "Pre-Processing";
        System.out.println(output);

        String result = invocation.invoke();

        output = "Post-Processing";
        System.out.println(output);

        return result;
    }
}
