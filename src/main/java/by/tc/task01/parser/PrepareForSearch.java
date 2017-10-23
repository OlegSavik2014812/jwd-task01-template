package by.tc.task01.parser;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class PrepareForSearch {
    public <E> List formateMap(Criteria<E> criteria) {
        List<String> list = new ArrayList<>();
        Map<E, Object> map = criteria.getCriteria();
        for (Map.Entry<E, Object> eObjectEntry : map.entrySet()) {
            list.add(eObjectEntry.getKey().toString() + "=" + eObjectEntry.getValue().toString());
        }
        return list;
    }
}
