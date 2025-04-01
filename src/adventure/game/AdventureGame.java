/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventure.game;

/**
 *
 * @author 1201182
 */
public class AdventureGame {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 1;
        int turn = 1;
        
        
        CharacterInfo stuff = new CharacterInfo();
        Evolutions stuff2 = new Evolutions();
        Lair stuff3 = new Lair();
        
        
      //Introduction has its own start  
      Introduction.Start();
      
      
      
      System.out.println("");
      System.out.println("");
      System.out.println("Your goals are:");
      System.out.println("-Find the demon's lair");
      System.out.println("-Confront the jungle demon");
      System.out.println("-Slay demon and free the jungle of its curse");
      
      
      // First While Loop for Travelling and gaining items
      while(choice != 0 && stuff.getDistance() > 0){
          
          if(turn == 7){ // The user's items get upgraded, this is my game's version of the "BONUS" Mr. Kraemer had in his example
                         // There is no reward if you did not find any items
              stuff2.Upgrade();
          }
          
          int num = (int)Math.floor(Math.random()*3);
          
          
          
          // This unlocks the ability to access weapons for the user
          if(num == 0){
              stuff2.Gift();
          }
          
          
          
          
          System.out.println("");
          System.out.println("");
          System.out.println("Your health is at " + stuff.getHealth());
          System.out.println("Your current weapon is: " + stuff.getWeapon());
          System.out.println("Your current item is: " + stuff.getItem());
          System.out.println("");
          System.out.println("Options:");
          System.out.println("1 - travel");
          System.out.println("2 - scavenge");
          System.out.println("3 - search for food");
          System.out.println("4 - quit game");
          System.out.println("5 - Show Rules");
          System.out.println(" ");
          System.out.println(" ");
          
         
          
          
          
          choice = UserInput.getInteger("Make a choice.");
          
          
          
          
          
          if(choice == 1){
              stuff.travel();
          }
          
          if(choice == 2){
              stuff.scavenge();
          }
          
          if(choice == 3){
             stuff.food();
          }
          
          if(choice == 4){
              System.exit(0);
          }
          
          if(choice == 5){
              Introduction.Rules();
          }
          
           if(choice != 1){
               System.out.println("The demon's lair is now " + stuff.getDistance() + "metres away");
               System.out.println("");
               System.out.println("");
          }
          
          
          if(stuff.getHealth() == 0){
                System.out.println("You died.");
                System.out.println("you should go do something with your life");
                choice = 0;
          }
          
      
        
          
          turn += 1;
          
      }
      
      if(stuff.getDistance() <= 0){
          
          Lair.dialect();
          
              stuff.FinalHealth();
      }
      
      
      //Second While Loop for Fighting with your gained weapons and Items (very unfortunate if you decided to fight without weapons/items)
      while(choice != 0 && stuff.getDistance() <= 0){
      
      
        System.out.println("THE DEMON'S HEALTH IS AT: " + stuff3.getDemonHealth());
        System.out.println("Your health is at: " + stuff.getHealth());
        System.out.println("Your current weapon is: " + stuff.getWeapon());
        System.out.println("Your current item is: " + stuff.getItem());
        System.out.println("");
        System.out.println("Options:");
        System.out.println("");
        System.out.println("");
        System.out.println("1 - use your weapon to fight");
        System.out.println("2 - use an item to fight");
        System.out.println("3 - try to reason with the jungle demon");
        System.out.println("4 - quit game");
        System.out.println("");
        System.out.println("");
        
       int choice2 = UserInput.getInteger("Make a choice:");
      
        
        
        
         if(choice2 == 1){
              stuff3.fight();
          }
          
          if(choice2 == 2){
              stuff3.ItemFight();
          }
          
          if(choice2 == 3){
             stuff3.talk();
          }
          
          if(choice2 == 4){
              System.exit(0);
          }
          
        
          if(stuff.getHealth() == 0){
                System.out.println("You died.");
                System.out.println("you lack the competency requirements to succeed in this game");
                System.out.println("Please Try Again!");
                choice = 0;
          }
         
          
          if(stuff3.getDemonHealth() < 1){
              System.out.println("YOU HAVE SLAYED THE DEMON");
              System.out.println("The jungle is now free!");
              System.out.println("Congratulations " + stuff.username);
              System.out.println("Your reward is getting to play this awesome game over again!");
              System.exit(0);
          }
        
        
        
        
        
        turn += 1;
        }
      
      
      
      
      }
          
      
      
      
     
    }
    

