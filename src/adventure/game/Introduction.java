/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventure.game;

/**
 *
 * @author 1201182
 */
public class Introduction {
    
    public static int Start(){
     
      CharacterInfo player = new CharacterInfo(); 
        
      System.out.println("Welcome to the jungle"); //Guns and Roses reference
      System.out.println("We've got fun and games"); //Please listen to Welcome to the Jungle by Guns and Roses if you haven't already
      
      player.username = UserInput.getString("Hi adventurer! What name do you go by?"); 
      
      System.out.println("Nice to meet you " + player.username);
      System.out.println("We need your help, our jungle has had a curse bestowed upon it by the radical jungle demon");
      System.out.println("Will you help us?");
      
      
      
      
      
      int choice = UserInput.getInteger( "1 - yes  2 - no");
      
      
      if(choice == 1){
          System.out.println("And so your adventure begins......");
          
      }
      
      
      //This was initially added in as a developer feature for myself to be able to quickly end the program without a bunch of errors popping up
      //I decided to keep it because I found it unique and saw no reason to get rid of it
      else if(choice == 2) {
          System.out.println("You walk away from the jungle and deny the quest");
          System.out.println("");
          System.out.println("");
          System.exit(0);
      }
      
      return choice;
    }
    
    public static void Rules(){
        System.out.println("ALWAYS INPUT NUMBERS WHEN ASKED TO MAKE A CHOICE");
        System.out.println("1. Travelling will always get you closer to the lair, you will never go backwards");
        System.out.println("2. Scavenging takes away 10 health every time");
        System.out.println("3. Holding on to Items for extended periods of time may grant upgrades");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
    }
}
