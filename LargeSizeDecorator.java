/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class LargeSizeDecorator extends DrinkDecorator{
    double cost = 1.25;
    String name = "Large Size";
    
    public LargeSizeDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 1.25;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Large Size \n";
    }
    
}
