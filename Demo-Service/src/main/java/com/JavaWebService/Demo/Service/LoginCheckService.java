package com.JavaWebService.Demo.Service;

import org.springframework.stereotype.Service;

import com.JavaWebService.Demo.BaseClass.BaseResult;

@Service
public interface LoginCheckService {
	public BaseResult loginCheck(String userLoginName,String userLoginPwd);
}
