package com.webser.controller;

import com.webser.util.WebserUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jsingh on 2013-05-30 at 10:07 PM
 */
@Controller
@RequestMapping(value = WebserUtil.API_V1 + WebserUtil.MONITOR)
public class HealthMonitor {


    @RequestMapping(value = "/health", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody void runHealthCheck() { }
}
