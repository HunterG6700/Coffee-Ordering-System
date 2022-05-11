/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almiscovich
 */
public class Espresso implements Drink{
    double cost = 1.75;
    String name = "Espresso";

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String type() {
        return "Espresso \n";
    }
    
}
