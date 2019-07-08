/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dung Hong
 */
public class BattleshipGame {
    
    private static ArrayList<Integer> chosenPoints = new ArrayList<>();
    private static ArrayList<Integer> deployedPoints = new ArrayList<>();
    private static ArrayList<Integer> chosenStartingPoints = new ArrayList<>();
    private Carrier myCarrier = new Carrier();
    private Cruiser myCruiser = new Cruiser();
    private Destroyer myDestroyer = new Destroyer();
    
    private Ship[] shipList = new Ship[]{myCarrier, myCruiser, myDestroyer};

    public void initializeGame(){
        while( deployShip(myCarrier, createStartingPoint(), true) == false){
            deployShip(myCarrier, createStartingPoint(), true);
        }
        
        while(deployShip(myCruiser, createStartingPoint(), false) == false){
            deployShip(myCruiser, createStartingPoint(), false);
        }
        
        while(deployShip(myDestroyer, createStartingPoint(), false) == false){
            deployShip(myDestroyer, createStartingPoint(), false);
        }
    }
    
    public void startPlaying(){
        
        System.out.println("my Carrier Coordinates : "+myCarrier.getShipCoordinate());
        System.out.println("my Cruiser Coordinates : "+myCruiser.getShipCoordinate());
        System.out.println("my Destroyer Coordinates : "+myDestroyer.getShipCoordinate());
        
        
        
        while(!myCarrier.checkShrunk()){
            if(myCarrier.fireShip(createShootPoint())){
                System.out.println("HIT");
            }
        }
        
        System.out.println("Total shot :"+chosenPoints.size());
        System.out.println("Shot fired at : "+chosenPoints);
    }
    
    private int createShootPoint(){
        int shootPoint;
        Random r = new Random();
        int Low = 0;
        int Hight = 100;
        
        shootPoint = r.nextInt(Hight-Low)+ Low;
        while(chosenPoints.contains(shootPoint)){
            shootPoint = r.nextInt(Hight-Low)+ Low;
        }
        chosenPoints.add(shootPoint);
        
        return shootPoint;
    }
    
    private int createStartingPoint(){
        int startPoint;
        Random r = new Random();
        int Low = 0;
        int Hight = 100;
        
        startPoint = r.nextInt(Hight-Low)+ Low;
        
        while(chosenStartingPoints.contains(startPoint)){
            startPoint = r.nextInt(Hight-Low)+ Low;
        }
        chosenStartingPoints.add(startPoint);
        
        return startPoint;
    }
    
    private boolean deployShip(Ship theShip, int startPoint, boolean vertSet){
        if(theShip.setShipCoordinate(startPoint, vertSet)){
            if(checkDeployable(theShip)==false){
                return false;
            }
            startDeploy(theShip.getShipCoordinate());
            return true;
        }
        return false;
    }
    
    private void startDeploy(ArrayList<Integer> list){
        for(int e : list){
            deployedPoints.add(e);
        }
    }
    
    private boolean checkDeployable(Ship thisShip){
        ArrayList<Integer> shipCo = thisShip.getShipCoordinate();
        for(int e: shipCo){
            if(deployedPoints.contains(e)){
                deployedPoints.remove(deployedPoints.indexOf(e));
                if(chosenStartingPoints.contains(e)){
                    chosenStartingPoints.remove(chosenStartingPoints.indexOf(e));
                }
                thisShip.clearCoordinates();
                return false;
            }
        }
        return true;
    }
    
    
    
}
