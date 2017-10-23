package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
    private String applianceType;
    private Map<E, Object> criteria = new HashMap<E, Object>();
    private E type;

    public Criteria() {
    }

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public E getType() {
        return type;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    // you may add your own code here
    public Map<E, Object> getCriteria() {
        return criteria;
    }
}
