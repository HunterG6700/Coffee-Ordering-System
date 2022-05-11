/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class DessertJamDecorator extends DrinkDecorator{
    double cost = .50;
    String name = "Dessert jam";
    
    public DessertJamDecorator(Drink decoratedDrink){
        super(decoratedDrink);
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + .50;
    }

    @Override
    public String type() {
        return decoratedDrink.type() + "Dessert Jam \n";
    }
    
}
