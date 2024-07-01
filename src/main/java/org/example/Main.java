package org.example;

import java.util.HashMap;
import org.apache.commons.math3.stat.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла
 * (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса
 * (запустить игру в цикле на 1000 и вывести итоговый счет).
 * Необходимо:
 * Создать свой Java Maven или Gradle проект;
 * Подключить зависимость lombok.
 * Можно подумать о подключении какой-нибудь математической библиотеки для работы со статистикой
 * Самостоятельно реализовать прикладную задачу;
 * Сохранить результат в HashMap<шаг теста, результат>
 * Вывести на экран статистику по победам и поражениям
 */

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> mapChonge = new HashMap<Integer, Boolean>();
        HashMap<Integer, Boolean> mapNoChonge = new HashMap<Integer, Boolean>();
        for (int i = 0; i < 1000; i++) {
            // меняем мнение
            mapChonge.put(i, MontyHallParadox.openDoor(MontyHallParadox.testData(), true));
            // не меняем мнение
            mapNoChonge.put(i, MontyHallParadox.openDoor(MontyHallParadox.testData(), false));
        }
        System.out.println("Если меняем мнение");
        MontyHallParadox.statistic(mapChonge);
        System.out.println("--------------------------------");
        System.out.println("Если не меняем мнение");
        MontyHallParadox.statistic(mapNoChonge);




    }
}