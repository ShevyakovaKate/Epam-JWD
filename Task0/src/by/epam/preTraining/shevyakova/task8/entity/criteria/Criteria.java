package by.epam.preTraining.shevyakova.task8.entity.criteria;

import by.epam.preTraining.shevyakova.task8.entity.Appliance;

import java.util.*;

public class Criteria<E> {
    private Map<E, Object> criteria = new HashMap<>();

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }


    public List<String> getListCriteria() {
        List<String> list = new ArrayList();
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
