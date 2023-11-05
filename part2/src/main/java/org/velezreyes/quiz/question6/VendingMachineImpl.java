package org.velezreyes.quiz.question6;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
  private int money;
  private Map<String, Drink> drinks = new HashMap<>();;

  public VendingMachineImpl(){
    money = 0;
    drinks.put("ScottCola", new DrinkImpl("ScottCola", true, 75));
    drinks.put("KarenTea", new DrinkImpl("KarenTea", false, 100 ));
  }
  
  @Override
  public void insertQuarter(){
    money += 25;
    
  }
  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException{
    if (drinks.containsKey((name))){
      Drink selected = drinks.get(name);

      if(money >= selected.getPrice()){
        money -= selected.getPrice();
        return selected;
      }
      else{
        throw new NotEnoughMoneyException();
      }
    }
    else{
      throw new UnknownDrinkException();
    }
    
  }
  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

}



