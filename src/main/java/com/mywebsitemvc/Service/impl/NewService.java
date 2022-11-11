package com.mywebsitemvc.Service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywebsitemvc.DAO.INewDAO;
import com.mywebsitemvc.Service.InewService;
import com.mywebsitemvc.model.NewModel;

@Service
public class NewService implements InewService {

	@Autowired
	private INewDAO newDAO;
	@Override
	public List<NewModel> findAll() {

		return newDAO.findAll();
	}
	
}
