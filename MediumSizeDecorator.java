/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class MediumSizeDecorator extends DrinkDecorator{
    double cost = 0.85;
    String name = "Medium Size";
    
    public MediumSizeDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 0.85;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Medium Size \n";
    }
    
}
