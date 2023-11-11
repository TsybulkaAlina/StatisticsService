package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxStartingWithLowest() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithEqualIncomes() {
        StatisticsService service = new StatisticsService();

        long[] equalIncomes = {7, 7, 7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(equalIncomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenIncomesContainNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-5, -10, -2, -8, -7};
        long expected = -2;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenIncomesContainDuplicateMaxValues() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {10, 5, 8, 1, 7, 4, 10};
        long expected = 10;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}