package by.tc.task01.service.validation;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
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
        Map<E, Object> criteriaArgs = criteria.getCriteria();
        if (criteriaArgs == null) {
            return false;
        }
        if (criteriaArgs.isEmpty()) {
            return false;
        }
        return true;
    }
}





