package com.cn.shop.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	
	public List<Map<String,Object>> getUser(String username);

}
