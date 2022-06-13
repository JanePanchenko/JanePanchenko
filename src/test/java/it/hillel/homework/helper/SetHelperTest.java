package it.hillel.homework.helper;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetHelperTest {

    private SetHelper setHelper = new SetHelper();

    @Test
    public void shouldUnionTwoSetsWhenThereAreNoDuplicates() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("Team");

        Set<String> actual = setHelper.union(set1, set2);

        assertThat(actual).containsExactly("Hello", "World", "Hi", "Team");
    }

    @Test
    public void shouldUnionTwoSetsWhenThereAreDuplicates() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("World");

        Set<String> actual = setHelper.union(set1, set2);

        assertThat(actual).containsExactly("Hello", "World", "Hi");
    }

    @Test
    public void shouldUnionThreeSetsWhenThereAreDuplicates() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("World");
        Set<String> set3 = new HashSet<>();
        set2.add("World");
        set2.add("Good morning");

        Set<String> actual = setHelper.union(set1, set2, set3);

        assertThat(actual).containsExactly("Hello", "World", "Hi", "Good morning");
    }

    @Test
    public void shouldReturnEmptyIntersectionsWhenThereAreTwoDifferentSetsPassed() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("Team");

        Set<String> actual = setHelper.intersect(set1, set2);

        assertThat(actual).isEmpty();
    }

    @Test
    public void shouldReturnSingleCommonValueWhenIntersecting() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("World");

        Set<String> actual = setHelper.intersect(set1, set2);

        assertThat(actual).containsOnly("World");
    }

    @Test
    public void shouldReturnSingleIntersectionsWhenThereAreThreeSets() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hi");
        set2.add("World");
        Set<String> set3 = new HashSet<>();
        set3.add("World");
        set3.add("Hey");

        Set<String> actual = setHelper.intersect(set1, set2, set3);

        assertThat(actual).containsOnly("World");
    }

    @Test
    public void shouldReturnMultipleIntersectionsWhenThereAreThreeSets() {
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");
        set1.add("Dear");
        set1.add("World");
        Set<String> set2 = new HashSet<>();
        set2.add("Hey");
        set2.add("Hello");
        set2.add("World");
        Set<String> set3 = new HashSet<>();
        set3.add("Hello");
        set3.add("World");
        set3.add("Team");

        Set<String> actual = setHelper.intersect(set1, set2, set3);

        assertThat(actual).containsOnly("Hello", "World");
    }

    @Test
    public void shouldReturnEmptySetWhenNoSetsPassed() {
        Set<String> actual = setHelper.intersect();

        assertThat(actual).isEmpty();
    }

    @Test
    public void shouldReturnEmptySetWhenNullValuePassed() {
        Set<String> actual = setHelper.intersect(null);

        assertThat(actual).isEmpty();
    }
}
