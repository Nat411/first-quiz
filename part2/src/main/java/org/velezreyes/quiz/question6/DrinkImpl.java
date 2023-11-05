package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{
    private String name;
    private Boolean fizzy;
    private int price;

    public DrinkImpl(String name, Boolean fizzy, int price){
        this.name = name;
        this.fizzy = fizzy;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isFizzy(){
        return fizzy;
    }
    @Override
    public int getPrice(){
        return price;
    }

    
}
