package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 75;
    }

    @Override
    public String getDescription() {
        return "Я - курица." + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
