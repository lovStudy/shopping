package com.cn.shop.serviceImp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.shop.dao.UserDao;
import com.cn.shop.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Resource 
	private UserDao userdao;
	@Override
	public List<Map<String, Object>> getUser(String username) {
		
		return userdao.getUser(username);
	}

}
