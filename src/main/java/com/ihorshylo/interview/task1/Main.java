package com.ihorshylo.interview.task1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    /**
     * Calculates what role an employee had per given set of dates
     *
     * @param history Employee role history sorted by the effectiveFrom property in descending order
     * @param dates   list of dates
     */
    private static Map<LocalDate, Role> rolesByDates(List<Role> history, List<LocalDate> dates) {
        return null;
    }

    public static void main(String[] args) {
        List<Role> history = Arrays.asList(
            new Role("Team Leader", LocalDate.of(2020, 8, 1)),
            new Role("Fullstack developer", LocalDate.of(2016, 5, 15)),
            new Role("Frontend developer", LocalDate.of(2015, 11, 17))
        );

        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(2021, 1, 1),
            LocalDate.of(2014, 1, 1),
            LocalDate.of(2016, 6, 1)
        );

        Map<LocalDate, Role> rolesByDates = rolesByDates(history, dates);

        rolesByDates.forEach((key, value) -> System.out.println("date = " + key + ", role = " + value.getTitle()));

    }

}