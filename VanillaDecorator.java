/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class VanillaDecorator extends DrinkDecorator{
    double cost = 0.45;
    String name = "Vinilla";
    
    public VanillaDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 0.45;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Vanilla \n";
    }
    
}
