package it.hillel.homework.helper;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetHelper {

    public <T> Set<T> union(Set<T>... sets) {
        Set<T> resultSet = new LinkedHashSet<>();
        for (Set<T> set : sets) {
            resultSet.addAll(set);
        }
        return resultSet;
    }

    public <T> Set<T> intersect(Set<T>... sets) {
        Set<T> resultSet = new LinkedHashSet<>();
        if (sets != null && sets.length > 0) {
            resultSet.addAll(sets[0]);
            List<Set<T>> listOfSets = Arrays.asList(sets);
            for (Set<T> set : listOfSets.subList(1, listOfSets.size())) {
                resultSet.retainAll(set);
            }
        }
        return resultSet;
    }
}