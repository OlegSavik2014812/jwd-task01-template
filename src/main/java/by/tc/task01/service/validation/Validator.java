package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        // you may add your own code here
        if (!CheckCriteriaValidator.isCriteriaExist(criteria)) {
            return false;
        }
        return true;
    }
// you may add your own code here
}

// you may add your own new classes
class CheckCriteriaValidator {
    public static <E> boolean isCriteriaExist(Criteria<E> criteria) {
        if (criteria == null) {
            return false;
        }
        Map<E, Object> criteriaMap = criteria.getMapOfCriteria();
        if (criteriaMap == null) {
            return false;
        }
        if (criteriaMap.isEmpty()) {
            return false;
        }
        for (Map.Entry<E, Object> argEntity : criteriaMap.entrySet()) {
            if (argEntity.getKey() == null || argEntity.getValue() == null) {
                return false;
            }
        }
        return true;
    }
}




