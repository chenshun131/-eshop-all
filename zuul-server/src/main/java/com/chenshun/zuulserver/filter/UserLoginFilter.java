package com.chenshun.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * User: mew <p />
 * Time: 18/5/28 10:29  <p />
 * Version: V1.0  <p />
 * Description:  <p />
 */
@Slf4j
public class UserLoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SERVLET_DETECTION_FILTER_ORDER - 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        log.debug("{} >>> {}", request.getMethod(), request.getRequestURL().toString());

        Object userId = request.getParameter("userId");
        if (userId == null) {
            // 用户未登录
            log.warn("userId is empry, not allow to access website");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("userId is empry, not allow to access website");
            } catch (Exception e) {
                log.error("send response error", e);
            }
            return null;
        }
        log.info("userId is ok, allow to access website");
        return null;
    }

}
