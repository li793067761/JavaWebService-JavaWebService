package com.JavaWebService.Demo.Service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.JavaWebService.Demo.BaseClass.BeanResultDto;
import com.JavaWebService.Demo.Modul.UserLoginInfo;
import com.JavaWebService.Demo.Service.LoginCheckService;
@Service
public class LoginCheckServiceImpl implements LoginCheckService {

	@Override
	public BeanResultDto<UserLoginInfo> loginCheck(String userLoginName, String userLoginPwd) {
		BeanResultDto<UserLoginInfo> result = new BeanResultDto<UserLoginInfo>();
		if (!StringUtils.isEmpty(userLoginName) && !StringUtils.isEmpty(userLoginPwd)) {
			// 某些处理..此处省略一万字
			result.setSuccess(true);
		}
		return result;
	}

}
