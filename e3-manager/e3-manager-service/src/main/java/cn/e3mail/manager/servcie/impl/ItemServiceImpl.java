package cn.e3mail.manager.servcie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.servcie.ItemService;
import cn.e3mail.mapper.TbUserMapper;
import cn.e3mail.pojo.TbUser;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbUserMapper tbUserMapper;


	@Override
	public TbUser findUserById(Long id) {
		// TODO Auto-generated method stub
		TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
		return tbUser;
	} 
}
