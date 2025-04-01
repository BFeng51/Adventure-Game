/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventure.game;

/**
 *
 * @author 1201182
 */
// The user now has an incentive to actually play the game with multiple turns instead of rushing to the end via travelling
public class Evolutions extends CharacterInfo{
    
    //Getters and Setters are not required here because it is a subclass
    //It inherits all the details and variables from the super class 
    
    
    public void Upgrade(){
        
        
        if(Item.equals("Mushroom")){
            System.out.println("");
            System.out.println("");
            System.out.println("Your Mushroom has been Upgraded to a Magic Mushroom!");
            System.out.println("");
            System.out.println("");
            
            
            Item = "Magic Mushroom";
        }
    
        if(Item.equals("Stick")){
            System.out.println("");
            System.out.println("");
            System.out.println("Your stick has evovled into the STAFF OF POWER");
            System.out.println("");
            System.out.println("");
            
            
            Item = "Staff of Power";
        }
        
        
        if(Item.equals("Chicken Nuggets")){
            System.out.println("");
            System.out.println("");
            System.out.println("Your chicken nuggets has morped into Dino Nuggets!");
            System.out.println("");
            System.out.println("");
            
            
            Item = "Dino Nuggets";
        }
        
        if(Item.equals("Empty Notebook")){
            System.out.println("");
            System.out.println("");
            System.out.println("Your empty notebook has turned itself into the Book of Wisdom!");
            System.out.println("");
            System.out.println("");
            
            
            Item = "Book of Wisdom";
        }
        
        if(Item.equals("Dead Phoenix")){
            System.out.println("");
            System.out.println("");
            System.out.println("Your Dead Phoenix corpse has been resurrected into the Mighty Phoenix!");
            System.out.println("");
            System.out.println("");
            
            Item = "Mighty Phoenix";
        }
 }
    
    
    public void Gift(){
        
        //"Gift" randomly chooses a weapon that user may decide to keep
        //I had some fun with the dialog
        
         int num = (int)Math.floor(Math.random()*3);
         
         if(num == 0){
             if(!Weapon.equals("Steroids")){
             System.out.println("");
             System.out.println("");
             System.out.println("A magic pixie spawns ouf of nowhere and blesses you with some Steroids");
             System.out.println("Do you accept?");
             System.out.println("Your Current Weapon is " + Weapon);
             System.out.println("");
             System.out.println("");
             System.out.println("1 - Replace " + Weapon + " With Steroids");
             System.out.println("2 - Don't accept the Steroids");
             
             int Choice = UserInput.getInteger("Make a choice");
             
                 if(Choice == 1){
                 Weapon = "Steroids";
              }
             }
         }
         
         if(num == 1){
             if(!Weapon.equals("Bow and Arrow")){
             System.out.println("");
             System.out.println("");
             System.out.println("A mountain giant runs past you and drops a nice set of Bow and Arrows");
             System.out.println("Do you accept?");
             System.out.println("Your Current Weapon is " + Weapon);
             System.out.println("");
             System.out.println("");
             System.out.println("1 - Replace " + Weapon + " With Bow and Arrow");
             System.out.println("2 - Don't accept the Bow and Arrows");
             
             int Choice = UserInput.getInteger("Make a choice");
             
                 if(Choice == 1){
                 Weapon = "Bow and Arrow";
              }
             }
         }
         
         if(num == 2){
             if(!Weapon.equals("Sword")){
             System.out.println("");
             System.out.println("");
             System.out.println("A flash of lightning stops you in your tracks");
             System.out.println("A sword falls from the sky and ends up infront of you");
             System.out.println("Do you take the sword?");
             System.out.println("Your Current Weapon is " + Weapon);
             System.out.println("");
             System.out.println("");
             System.out.println("1 - Replace " + Weapon + " With Sword");
             System.out.println("2 - Don't accept the Sword");
             
             int Choice = UserInput.getInteger("Make a choice");
             
                 if(Choice == 1){
                 Weapon = "Sword";
              }
             }
         }
         
    }
}
