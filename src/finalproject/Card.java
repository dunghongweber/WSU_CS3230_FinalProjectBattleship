/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
/**
 * @author Dung Hong
 * 
 * Assignment : Homework Week 5 - Initial Card Game
 * 
 * Due Day: Feb 17, 2018
 * 
 * Description :  Modify your card game application and classes to include 
 * the following modifications and additional capabilities
 */
public class Card implements Comparable<Card>{
    
    private ValueOfCard theCardNum;
    private Suit theCardSuite;

    public Card(ValueOfCard theCardNum, Suit theCardSuite) {
        this.theCardNum = theCardNum;
        this.theCardSuite = theCardSuite;
    }

    public ValueOfCard getTheCardNum() {
        return theCardNum;
    }

    public void setTheCardNum(ValueOfCard theCardNum) {
        this.theCardNum = theCardNum;
    }

    public Suit getTheCardSuite() {
        return theCardSuite;
    }

    public void setTheCardSuite(Suit theCardSuite) {
        this.theCardSuite = theCardSuite;
    }

    @Override
    public String toString() {
        if(this.getTheCardNum()==ValueOfCard.ACE ||
                this.getTheCardNum()==ValueOfCard.JACK ||
                this.getTheCardNum()==ValueOfCard.QUEEN ||
                this.getTheCardNum()==ValueOfCard.KING){
            return this.getTheCardNum()+" of "+this.getTheCardSuite(); 
        }
        else{
            return this.theCardNum.getvalueOfTheCard()+" of "+this.getTheCardSuite(); 
        }
    }
    
    @Override
    public int compareTo(Card t) {
        if(this.getTheCardNum().getvalueOfTheCard()>t.getTheCardNum().getvalueOfTheCard()){
            return 1;
        }else if(this.getTheCardNum().getvalueOfTheCard()<t.getTheCardNum().getvalueOfTheCard()){
            return -1;
        }else{
            return 0;
        }
    }
}
