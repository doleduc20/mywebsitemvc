package com.mywebsitemvc.DAO.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mywebsitemvc.DAO.INewDAO;
import com.mywebsitemvc.mapper.NewMapper;
import com.mywebsitemvc.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	

	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		
		return query(sql.toString(), new NewMapper());
	}

	
}
