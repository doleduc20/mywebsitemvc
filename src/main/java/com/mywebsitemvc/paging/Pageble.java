package com.mywebsitemvc.paging;

import com.mywebsitemvc.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
