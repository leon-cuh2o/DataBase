package com.CuH2O.Database.FinalProject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class FinalProject {
    public static void main(String[] args) throws Exception {
        System.out.println("Йоу. Давай знакомиться, как тебя зовут? "); //Приветствие + Ввод в правила пользования программой
        BufferedReader getName = new BufferedReader((new InputStreamReader(System.in)));
        String Name = getName.readLine();
        System.out.println("Почти приятно, " + Name);
        System.out.println("С помощью общения со мной, ты можешь узнать как херово тебе будет в 2019 году");
        System.out.println("Готов проверить судьбу? Обратной дороги нет. Y / N");
        BufferedReader getAnswer = new BufferedReader((new InputStreamReader(System.in)));
        String Answer = getAnswer.readLine();

        if (Answer.equals("Y")) { //Иттерации, которые происходят дальше, если пользователь захотел продолжить
            System.out.println("И так, есть 3 области жизни, которые ты можешь выбрать: \n"); //Первая иттерация
            System.out.println("1. Деньги \n");
            System.out.println("2. Карьера \n");
            System.out.println("3. Отношения \n");
            System.out.println("4. Здоровье \n");
            System.out.println("5. Личностный рост \n");
            BufferedReader getAnswer1 = new BufferedReader((new InputStreamReader(System.in)));
            String Answer1 = getAnswer1.readLine();
            System.out.println("Осталось 2, выбирай: \n"); //Вторая иттерация
            System.out.println("1. Деньги \n");
            System.out.println("2. Карьера \n");
            System.out.println("3. Отношения \n");
            System.out.println("4. Здоровье \n");
            System.out.println("5. Личностный рост \n");
            BufferedReader getAnswer2 = new BufferedReader((new InputStreamReader(System.in)));
            String Answer2 = getAnswer2.readLine();
            System.out.println("Еще одна лишняя область, как и количество твоих лишних хромосом: \n"); //Третья иттерация
            System.out.println("1. Деньги \n");
            System.out.println("2. Карьера \n");
            System.out.println("3. Отношения \n");
            System.out.println("4. Здоровье \n");
            System.out.println("5. Личностный рост \n");
            BufferedReader getAnswer3 = new BufferedReader((new InputStreamReader(System.in)));
            String Answer3 = getAnswer3.readLine();

            System.out.println("Сейчас в том же порядке выведутся наши предсказания под каждую из выбранных областей \n");
            String[] List = {"\uD83E\uDD84", "\uD83C\uDF1A", "\uD83D\uDC37", "\uD83D\uDE08", "\uD83D\uDC35", "\uD83D\uDE18", "\uD83E\uDD2E", "\uD83C\uDF55", "\uD83E\uDD80", "\uD83C\uDF79"};
            for (int i = 0; i < 3; i++) {
                String random = (List[new Random().nextInt(List.length)]);
                System.out.println(random);
            }
        }
        else
        {
            System.out.println("Не очень-то и хотелось. Пока, " + Name);
        }
    }
}






