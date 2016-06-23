package com.JavaWebService.Demo.facade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaWebService.Demo.BaseClass.BaseResult;
import com.JavaWebService.Demo.Service.LoginCheckService;

@Path("/loginFacade")
@Service
public class ThingsExcuteFacade {
	@Autowired
	private LoginCheckService loginCheckService;
	@GET
	@Path("/loginCheck")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8" })
	public BaseResult doSth(@QueryParam("userLoginName") String userLoginName,
			@QueryParam("userLoginPass") String userLoginPass){
		BaseResult result = new BaseResult();
		if(StringUtils.isEmpty(userLoginName)){
			return result;
		}
		if(StringUtils.isEmpty(userLoginPass)){
			return result;
		}
		return loginCheckService.loginCheck(userLoginName, userLoginPass);
	}
	
}
