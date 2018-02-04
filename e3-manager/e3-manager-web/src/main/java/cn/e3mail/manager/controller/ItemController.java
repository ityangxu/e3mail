package cn.e3mail.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.servcie.ItemService;
import cn.e3mail.pojo.TbUser;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemServiceImpl;
	@RequestMapping("item/{id}")
	public TbUser findUserById(@PathVariable("id") Long id){
		TbUser tbUser = itemServiceImpl.findUserById(id);
		//
		//System.out.println(tbUser.getUsername());
		return tbUser;
		
	}
}
