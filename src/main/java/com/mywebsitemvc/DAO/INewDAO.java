package com.mywebsitemvc.DAO;

import java.util.List;

import com.mywebsitemvc.model.NewModel;
import com.mywebsitemvc.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();

}
