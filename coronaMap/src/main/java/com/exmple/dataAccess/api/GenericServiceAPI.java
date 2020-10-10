package com.exmple.dataAccess.api;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<T, ID extends Serializable> {
	
	T get(ID id);
	
	List<T> getAll();
}
