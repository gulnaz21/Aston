package Homework_2.model.utils;

import java.util.Random;

//    Класс Randomizer отвечает за случайный выбор использования уникальных навыков
//    героями и противниками в ходе боя.

public class Randomizer {
    public static boolean random(){
        Random random = new Random();

        // Генерируем случайное значение 0 или 1
        int randomValue = random.nextInt(2);

        return randomValue == 1;
    }
}
