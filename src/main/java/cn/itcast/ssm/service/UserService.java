package cn.itcast.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.po.UserExample;
import cn.itcast.ssm.po.UserExample.Criteria;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUser(){
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(Long.parseLong("1"));
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
}
