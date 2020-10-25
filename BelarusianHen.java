package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 85;
    }

    @Override
    public String getDescription() {
        return "Я - курица." + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
