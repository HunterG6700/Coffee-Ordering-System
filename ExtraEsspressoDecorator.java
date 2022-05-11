/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class ExtraEsspressoDecorator extends DrinkDecorator{
    double cost = .85;
    String name = "Extra Esspressor";
    
    public ExtraEsspressoDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + .85;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Esspresso \n";
    }
    
}
