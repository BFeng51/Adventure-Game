/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventure.game;

import java.util.Random;

/**
 *
 * @author 1201182
 */
public class CharacterInfo {
    
    public String username = new String();
    
    //private variables necessary
    private int Health = 100;
    private int Distance = (int)(Math.random()*(900)+100); //The demon's lair is a different distance every time! (makes the game more fun)
    
    
    
    
    
    
    //Orginally, these were private variables but they were changed to static because I needed them to sync and be the same in all classes
    //When you create an instance of a private varibale in a class, it only changes the variable IN that class
    static String Weapon = "Fists";
    static String Item = "Nothing";
    
 
    Random rand3 = new Random();

    
    // I kept the getters and setters for this variable because I still needed to call them in my main 
    // If you take these getters and setters out, the program will not run properly
     public String getWeapon(){
        return Weapon;
    }
    
    public  void setWeapon(String Weapon){
        this.Weapon = Weapon;
    }
    
    
    public String getItem(){
       return Item;
   }
    
    public void setItem(String newItem){
        Item = newItem;
    }
    
   
    
    
    
    
    //Standard getters and setters for private variables
    
    public  int getDistance(){
        return Distance;
    }
    
    public  void setDistance(int Distance){
        this.Distance = Distance;
    }
    
    
    
   public int getHealth(){
       return Health;
   }
    
    public void setHealth(int newHealth){
        Health = newHealth;
    }
    
    
  
    
    
    
    
    
    public void travel(){
        
        int num = (int)Math.floor(Math.random()*3);
        
        
        
        
        //Travelling is not guarenteed the same distance every time, you may go less distance or nowhere at all 
        //You will never travel backwards as I found it redundant and made the game take too long
        if(num == 0){
            
           Distance = (Distance - 100);
           
           if(Distance > 0){
            
            System.out.println("Your means of travel were extremely effective");
            System.out.println("You have travelled 100 metres");
            System.out.println("The demons lair is now " + Distance + " metres away");
        }
           else{
               
               System.out.println("You have arrived at the demon's lair....");
           }
            
            
        }
        
        if(num == 1){
            
            Distance = (Distance - 50);
            
            if(Distance > 0){
            System.out.println("Your means of travel were somewhat effective");
            System.out.println("You have travelled 50 metres");
            System.out.println("the demon's lair is now " + Distance + " metres away");
        }
            
            
        
        
    }
    
       if(num == 2){
           if(Distance > 0){
            System.out.println("Your incompetent navigation skills lead you to get lost");
            System.out.println("You did not get any close to the demon's layer");
            System.out.println("the demon's lair is now " + Distance + " metres away");
        }
    }
    }
    
    
    public void scavenge(){
       
        int num = (int)Math.floor(Math.random()*5);
        
        if(num == 0){
            Health -= 10;
             System.out.println("You found a mushroom!");
             System.out.println("you may choose to keep or discard it");
             System.out.println("Your health is now " + Health);
             
             
             //The user doesn't ALWAYS have to keep the item that they found (freedom of choice)
             int choice1 = UserInput.getInteger("1 - Keep , 2 - Discard"); 
             
             if(choice1 == 1){
                 Item = "Mushroom";
                
             }
        }
        
        if(num == 1){
            Health -= 10;
             System.out.println("You found a stick!");
             System.out.println("you may choose to keep or discard it");
             System.out.println("Your health is now " + Health);
             
             int choice2 = UserInput.getInteger("1 - Keep , 2 - Discard"); 
             
             if(choice2 == 1){
                 Item = "Stick";
             }
        }
        
        
        if(num == 2){
            Health -= 10;
             System.out.println("You found chicken nuggets!");
             System.out.println("you may choose to keep or discard it");
             System.out.println("Your health is now " + Health);
             
             int choice3 = UserInput.getInteger("1 - Keep , 2 - Discard"); 
             
             if(choice3 == 1){
                 Item = "Chicken Nuggets";
             }
        }
        
        
        if(num == 3){
            Health -= 10;
             System.out.println("You found an empty notebook!");
             System.out.println("you may choose to keep or discard it");
             System.out.println("Your health is now " + Health);
             
             int choice4 = UserInput.getInteger("1 - Keep , 2 - Discard"); 
             
             if(choice4 == 1){
                 Item = "Empty Notebook"; 
                 
             }
        }
        
        if(num == 4){
            Health -= 10;
             System.out.println("You found a dead phoenix!");
             System.out.println("you may choose to keep or discard it");
             System.out.println("Your health is now " + Health);
             
             int choice5 = UserInput.getInteger("1 - Keep , 2 - Discard"); 
             
             if(choice5 == 1){
                 Item = "Dead Phoenix";
             }
        }
            

         
         
         
        
         
         
    }
    
    
    
    
    public void food(){
        int num = rand3.nextInt(2);
        if(num == 0){
            if(Health <= 95){
                Health += 5;
                System.out.println("Your search for food was successful, you have gained 5 health");
                System.out.println("Your health is now at " + Health);
            }
            
            else{
                System.out.println("Your search for food was successful");
                System.out.println("However, your health is too high to benefit. Your health is still at " + Health);
            }
            
             
        }
        
        if(num == 1){
            Health -= 5;
            System.out.println("your search for food was unsuccessful");
            System.out.println("You have lost health due to the energy used to find food");
            System.out.println("Your new health is at " + Health);
        }
    }
    
    
    
    // Sets the player's health to 1 when they enter the lair to up the stakes
    public void FinalHealth(){
        Health = 1;
    }
    
    
    
    
    
    
    
    
    
    
}
 