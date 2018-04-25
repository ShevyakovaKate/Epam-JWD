package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria<E> {

	private Class<E> groupSearchName;
	private Map<E, Object> criteria = new HashMap<E, Object>();
	
	public Criteria(Class<E> groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public Class<E> getGroupSearchName(){
		return groupSearchName;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public List<String> getListCriteria() {
		List<String> list = new ArrayList<String>();
		for (Map.Entry<E, Object> entry : criteria.entrySet()) {
			String value = entry.getValue().toString().trim();
			list.add(entry.getKey() + "=" + value);
		}
		return list;
	}

	public String getParamsClassName() {
		String paramsClassName = null;
		for (E e: criteria.keySet()) {
			paramsClassName = e.getClass().getSimpleName();
		}
		return paramsClassName;
	}

}
