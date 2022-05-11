/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class MonchaDecorator extends DrinkDecorator{
    double cost = 0.50;
    String name = "Moncha";
    
    public MonchaDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 0.50;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Moncha \n";
    }
    
}
