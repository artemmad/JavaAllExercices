package ru.mirea.ATM;

public class Sentenses{
    public String[] sens = {"Баланс после пополнения:","Снятие невозможно!",
                            "Баланс после снятия:","Николай","Банкомат на Ленинском",
                             "Банкомат на Мосфильмовской","Банкомат № 443"};

    public String getSens(int idx) {
        return sens[idx];
    }
}
