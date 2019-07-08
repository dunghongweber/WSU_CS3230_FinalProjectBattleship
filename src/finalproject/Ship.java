/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author Dung Hong
 */
public class Ship {
    private String name;
    private int size;
    private ArrayList<Integer> shipCoordinate = new ArrayList<>();

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    public boolean setShipCoordinate(int startingPoint, boolean verticalOrNot) {
        if(verticalOrNot==true){
            for(int i = 0; i < this.getSize(); i++){
                if(startingPoint<100){
                    shipCoordinate.add(startingPoint);
                    startingPoint = startingPoint+10;
                }else{
                    shipCoordinate.clear();
                    return false;
                }
            }
            return true;
        }
        else{
            int checkHor = startingPoint/10;
            for(int i = 0; i < this.getSize(); i++){
                if((startingPoint/10) == checkHor){
                    shipCoordinate.add(startingPoint);
                    startingPoint = startingPoint+1;
                }
                else {
                    shipCoordinate.clear();
                    return false;
                }
            }
            return true;
        }
    }
    
    public boolean fireShip(int firingPoint) {
        if(shipCoordinate.contains(firingPoint)){
            shipCoordinate.remove(shipCoordinate.indexOf(firingPoint));
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkShrunk(){
        if(shipCoordinate.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Integer> getShipCoordinate() {
        return shipCoordinate;
    }
    
    public void clearCoordinates(){
        this.shipCoordinate.clear();
    }
}
