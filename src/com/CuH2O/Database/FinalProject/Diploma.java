package com.CuH2O.Database.FinalProject;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Diploma {
    public static void main(String[] args) throws Exception {
        System.out.println("Йоу. Давай знакомиться, как тебя зовут? "); //Приветствие + Ввод в правила пользования программой
        BufferedReader getName = new BufferedReader((new InputStreamReader(System.in)));
        String Name = getName.readLine();
        System.out.println("Почти приятно, " + Name);
        System.out.println("С помощью общения со мной, ты можешь узнать как херово тебе будет в 2019 году");
        System.out.println("Готов проверить судьбу? Обратной дороги нет. Y / N");
        BufferedReader getAnswer = new BufferedReader((new InputStreamReader(System.in)));
        String Answer = getAnswer.readLine();

        if (Answer.equals("Y")) { //Иттерации, которые происходят дальше, если пользователь захотел идти дальше
            System.out.println("И так, есть 3 области жизни, которые ты можешь выбрать: "); //ПЕРВАЯ ИТТЕРАЦИЯ!
            System.out.println("1. Деньги");
            System.out.println("2. Карьера");
            System.out.println("3. Отношения");
            System.out.println("4. Здоровье");
            System.out.println("5. Личностный рост");
            BufferedReader getAnswer1 = new BufferedReader((new InputStreamReader(System.in)));
            String Answer1 = getAnswer1.readLine();
            if (Answer1.equals("1")) {
                System.out.println("Ну, да, зачем делать рабочий проект, если можно надеяться то, что гороскоп принесет деньги. Осталось еще 2 области: ");
                System.out.println("2. Карьера");
                System.out.println("3. Отношения");
                System.out.println("4. Здоровье");
                System.out.println("5. Личностный рост");
                BufferedReader getAnswer3 = new BufferedReader((new InputStreamReader(System.in)));
                String Answer3 = getAnswer3.readLine();
            }

        }
        else
        {
            System.out.println("Интересно зачем тогда было вообще обращаться ко мне? Надеюсь, никогда больше не связываться с тобой…");
        }
    }
}
