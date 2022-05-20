/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saif.web.practice.shop.filter;

import com.saif.web.practice.shop.bean.Customer;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Saif
 */
public class Authorize implements Filter {
    private final Logger logger = LogManager.getLogger(Filter.class);
    
    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;
    private HttpServletRequest req;
    private HttpServletResponse res;
    
    public Authorize() {
    }    
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("Authorize:DoBeforeProcessing");
        }

        // Write code here to process the request and/or response before
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log items on the request object,
        // such as the parameters.
        /*
	for (Enumeration en = request.getParameterNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    String values[] = request.getParameterValues(name);
	    int n = values.length;
	    StringBuffer buf = new StringBuffer();
	    buf.append(name);
	    buf.append("=");
	    for(int i=0; i < n; i++) {
	        buf.append(values[i]);
	        if (i < n-1)
	            buf.append(",");
	    }
	    log(buf.toString());
	}
         */
        
        req = (HttpServletRequest) request;
        res = (HttpServletResponse) response;
        
        Customer customer = (Customer) req.getSession().getAttribute("customer");
        // This line is for debugging purpose. Remove it.
//        customer = null;
        if(customer == null){
            // redirect to login with the original url.
            String notLoggedIn = "notLoggedIn=You+are+not+logged+in+or+your+session+has+been+expired+Please+log+in";
            
            StringBuffer uri = new StringBuffer(req.getContextPath());
            uri.append(req.getServletContext().getInitParameter("loginPage"));
            uri.append("?");
            uri.append(notLoggedIn);
            uri.append("&");
            uri.append("origUrl=");
            uri.append(URLEncoder.encode(getContextRelativeUri(req), "UTF-8"));
            
//            String origUrl = "origUrl="+req.getRequestURL().toString();
//            logger.debug("This is original url from filter: " + origUrl);
//            String queryString = req.getQueryString();
//            if(queryString != null){origUrl += "?" +queryString;}
//            logger.debug("This is query string from filter: " + queryString);
//            
//            String redirectPage = req.getServletContext().getInitParameter("loginPage");
            

            // if i exclude queryString from origUrl then the login page dosen't show form's
            // subelemenmts. and if i exclude whole of the origUrl then the login page is rendered
            // properly. in the fist case only the form's action link is shown.
//            String redirectUrl = req.getContextPath()+redirectPage+"?"+notLoggedIn+"&"+origUrl;
            
            logger.debug("This is redirect url from filter: " + uri.toString());
            res.sendRedirect(uri.toString());
            
        }
    }    
    
    
    
//    private String getForwardURI(HttpServletRequest request) {
//        StringBuffer uri = new StringBuffer(loginPage);
//        uri.append("?errorMsg=Please+log+in+first&origURL=").
//            append(URLEncoder.encode(getContextRelativeUri(req)));
//        return uri.toString();
//    }

    /**
     * Returns a context-relative path for the request, including
     * the query string, if any.
     */
    private String getContextRelativeUri(HttpServletRequest req) {
        int ctxPathLength = req.getContextPath().length();
        String requestURI = req.getRequestURI();
        StringBuffer uri = new StringBuffer(requestURI.substring(ctxPathLength));
        String query = req.getQueryString();
        if (query != null) {
            uri.append("?").append(query);
        }
        return uri.toString();
    }
    
    
    
    private void requestInfo(ServletRequest req){
        HttpServletRequest request = (HttpServletRequest) req;
        logger.debug("insert requestInfo");
        String url = request.getRequestURL().toString();
        logger.debug(url);
        String queryString = request.getQueryString();
        logger.debug(queryString);
        String uri = request.getRequestURI();
        logger.debug(uri);
        String scheme = request.getScheme();
        logger.debug(scheme);
        String serverName = request.getServerName();
        logger.debug(serverName);
        int portNumber = request.getServerPort();
        logger.debug(portNumber);
        String contextPath = request.getContextPath();
        logger.debug(contextPath);
        String servletPath = request.getServletPath();
        logger.debug(servletPath);
        String pathInfo = request.getPathInfo();
        logger.debug(pathInfo);
        String query = request.getQueryString();
        logger.debug(query);
    }
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("Authorize:DoAfterProcessing");
        }

        // Write code here to process the request and/or response after
        // the rest of the filter chain is invoked.
        // For example, a logging filter might log the attributes on the
        // request object after the request has been processed. 
        /*
	for (Enumeration en = request.getAttributeNames(); en.hasMoreElements(); ) {
	    String name = (String)en.nextElement();
	    Object value = request.getAttribute(name);
	    log("attribute: " + name + "=" + value.toString());

	}
         */
        // For example, a filter might append something to the response.
        /*
	PrintWriter respOut = new PrintWriter(response.getWriter());
	respOut.println("<P><B>This has been appended by an intrusive filter.</B>");
         */
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        if (debug) {
            log("Authorize:doFilter()");
        }
        
        requestInfo(request);
        doBeforeProcessing(request, response);
        
        Throwable problem = null;
        try {
            chain.doFilter(request, response);
        } catch (Throwable t) {
            // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
            problem = t;
            t.printStackTrace();
        }
        
        doAfterProcessing(request, response);

        // If there was a problem, we want to rethrow it if it is
        // a known type, otherwise log it.
        if (problem != null) {
            if (problem instanceof ServletException) {
                throw (ServletException) problem;
            }
            if (problem instanceof IOException) {
                throw (IOException) problem;
            }
            sendProcessingError(problem, response);
        }
    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {                
                log("Authorize:Initializing filter");
            }
        }
    }

    /**
     * Return a String representation of this object.
     */
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("Authorize()");
        }
        StringBuffer sb = new StringBuffer("Authorize(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);        
        
        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);                
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");                
                pw.print(stackTrace);                
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
    
}
