package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
    private String applianceType;
    private Map<E, Object> criteriaMap = new HashMap<>();

    public Criteria() {
    }

    public void add(E searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    // you may add your own code here
    public Map<E, Object> getMapOfCriteria() {
        return criteriaMap;
    }
}
