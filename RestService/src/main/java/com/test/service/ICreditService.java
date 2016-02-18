package com.test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.CreditRequest;
import com.test.service.CreditResponse;

@Path("/bank")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface ICreditService {
	
	@POST
	@Path("/creditreport")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@ResponseBody CreditResponse getCreditReport(@RequestBody CreditRequest request);
	
}
