package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Я - курица." + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
