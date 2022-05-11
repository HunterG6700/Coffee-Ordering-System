/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class MilkDecorator extends DrinkDecorator{
    double cost = 0.25;
    String name = "Milk";
    
    public MilkDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 0.25;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Milk \n";
    }
    
}
