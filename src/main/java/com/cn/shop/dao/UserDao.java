package com.cn.shop.dao;

import java.util.List;
import java.util.Map;

public interface UserDao {
	
	public List<Map<String,Object>> getUser(String username);

}
