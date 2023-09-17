package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счете
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можно ли отдыхать?
                count++; // увеличивается счетчик месяцев отдыха
                money = (money - expenses);
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}