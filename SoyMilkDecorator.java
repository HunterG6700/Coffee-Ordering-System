/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class SoyMilkDecorator extends DrinkDecorator{
    double cost = .75;
    String name = "Soy milk";
    
    public SoyMilkDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + .75;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Soy Milk \n";
    }
    
}
