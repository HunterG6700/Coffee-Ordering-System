/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class DrinkDecorator implements Drink{
    
    protected Drink decoratedDrink;
    
    public DrinkDecorator(Drink decoratedDrink){
        this.decoratedDrink = decoratedDrink;
    }
    @Override
    public double cost() {
        return decoratedDrink.cost();
    }

    @Override
    public String type() {
        return decoratedDrink.type();
    }
    
}
