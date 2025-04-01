/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventure.game;

import java.util.Random;
/**
 *
 * @author 17788
 */
public class Lair extends CharacterInfo {
    
    CharacterInfo stuff = new CharacterInfo();
    
    Random rand1 = new Random();
    
    
    
    //Another Private variable with the appropriate getters and setters
     private int DemonHealth = 1000;
    
    public int getDemonHealth(){
        return DemonHealth;
    }
    
    public  void setDemonHealth(int DemonHealth){
        this.DemonHealth = DemonHealth;
    }
    
    
    
    
    
    //Warning ahead of time that these next sections are fairly dialogue heavy
    //I 100% recommend that they all get read
    
   
    
    
    
    
    
    
    public static void dialect(){
        
        //I kept small sections like these out of the MAIN to control the cluster and neatness
        
        
        System.out.println("You arrive at the base of the demon's lair");
        System.out.println("You enter cautiously...");
        System.out.println("");
        System.out.println("");
        System.out.println("The ominous aura of the demon surrounds you as you enter the lair");
        System.out.println("All of a sudden....");
        System.out.println("You feel a sharp piercing sensation as a spear pierces through your internal organs");
        System.out.println("It was the demon.");
        System.out.println("Now perched on a ledge, the demon cackles at you from above, mocking you and your lackluster attempts to defeat him");
    
        
        
}
    
    
    public void fight(){
        //Figthing is never guranteed to be successful even IF you have good weapons
        //Everything is based on chance just like real video games on the market
        
        if (stuff.getWeapon().equals("Fists")){
            System.out.println("Your weak fists suck at fighting");
            System.out.println("The demon consumes your arms leaving you with next to nothing");
            System.out.println("You fade away and die....");
            System.exit(0);
        }
        
        if (stuff.getWeapon().equals("Sword")){
            
            DemonHealth -= 250;
            
             System.out.println("You strike the demon with your sword");
             
              
              int num = (int)Math.floor(Math.random()*10);
              
              if(num == 0){
                System.out.println("However...");
                System.out.println("The demon manages to strike you back ");
                System.out.println("The spear from earlier combined with the strike from the demon puts you out of your suffering");
                System.out.println("Your eyes close for one last time as you die.");
                System.out.println("MISSION FAILED");
                System.exit(0);
                
              }
            
        }
        
        if (stuff.getWeapon().equals("Bow and Arrow")){
            
              int num = (int)Math.floor(Math.random()*2);
              
              if(num == 0){
              DemonHealth -= 500;
              System.out.println("You land a direct hit on the demon!");
             
              
              System.out.println("");
              System.out.println("");
                  
              }
              
              else{
                  System.out.println("");
                  System.out.println("Your shot misses....");
                  System.out.println("");
              }
              
              int num1 = (int)Math.floor(Math.random()*10);
              
              if(num1 == 0){
                System.out.println("However...");
                System.out.println("The demon manages to strike you back ");
                System.out.println("The spear from earlier combined with the strike from the demon puts you out of your suffering");
                System.out.println("Your eyes close for one last time as you die.");
                System.out.println("MISSION FAILED");
                System.exit(0);
              }
        }
        
        if (stuff.getWeapon().equals("Steroids")){
            
            
            System.out.println("You use your steroids and grow to the size of Chris Bumstead (MR. Olympia)");
            System.out.println("You have now grown to the size of the demon and are standing toe to toe with him");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - Attack");
            System.out.println("2 - Defend"); // Defending first is always the better choice
            
            int choice = UserInput.getInteger("Make a choice.");
            
                if(choice == 1){
                    int num = (int)Math.floor(Math.random()*2);
                        if(num == 0){
                            System.out.println("With one punch, the demon disipates into thin air.");
                            System.out.println("YOU HAVE SLAYED THE DEMON");
                            System.out.println("The jungle is now free!");
                            System.out.println("Congratulations " + stuff.username);
                            System.out.println("Your reward is getting to play this awesome game over again!");
                            System.exit(0);
                        }
                        
                        
                        else{
                            System.out.println("The demon was ready for your attack...");
                            System.out.println("He counters you fully and lands a hit on you");
                            System.out.println("As you are at 1 health, you die instantly");
                            System.out.println("MISSION FAILED");
                            System.exit(0);
                        }
                }
                
                if(choice == 2){
             System.out.println("You decide to let the demon attack first and defend");
             System.out.println("It was a good choice.");
             System.out.println("The demon charges at you but since you have calves the size of logs due to the steroids, you evade his attack ");
             System.out.println("The demon slips and falls into an endless pit of doom");
             System.out.println("");
             System.out.println("");
             System.out.println("YOU HAVE SLAYED THE DEMON");
             System.out.println("The jungle is now free!");
             System.out.println("Congratulations " + stuff.username);
             System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
                }
        }
        
        
        
    }
    
    public void ItemFight(){
        
        //Almost all un-upgraded items result in imminent death
        //This gives the user an incentive to keep playing the game and find upgraded items
        
        
        if (stuff.getItem().equals("Nothing")){
            System.out.println("You do not have an item in hand.");
            System.out.println("Expecting you to attack him, the demon sits in confusion before instantaneously decapitating you");
            System.out.println("You fail your mission and die, leaving the jungle to suffer indefinitely.");
            System.exit(0);
            
        }
        
         if (stuff.getItem().equals("Mushroom")){
             System.out.println("The demon, although not a fan of mushrooms finds your attempts to defeat him feeble");
             
             DemonHealth -= 100;
             
             System.out.println("With one final blow, the demon ends your weak mortal life");
             System.out.println("You fail your mission and die, leaving the jungle to suffer indefinitely.");
             System.exit(0);
             
         }
         
         
         if (stuff.getItem().equals("Stick")){
             DemonHealth -= 999; 
             
             System.out.println("Your stick hit the demon directly in the eye, its a successful attack!");
             
             System.out.println("However, the demon uses its Sigma Male defense mechanisms to evade death");
             
             System.out.println("The demon's health is now " + DemonHealth);
             
            
             
              System.out.println("Your life is quickly ended by the demon short after");
              System.out.println("You fail your mission and die, leaving the jungle to suffer indefinitely.");
              System.exit(0);
         }
         
         if (stuff.getItem().equals("Chicken Nuggets")){
             DemonHealth -= 500; 
             
             System.out.println("Your Chicken Nuggets give the demon an allergic reaction");
             System.out.println("The demon's health is now " + DemonHealth);
             
             System.out.println("At this point, an allergy enraged demon is now attacking you with full force " );
             System.out.println("You freeze in fear and accept your fate" );
             System.out.println("You die instantly." );
             System.exit(0);
         }
         
         if (stuff.getItem().equals("Empty Notebook")){
             DemonHealth -= 1;
                     
              System.out.println("Your empty notebook does next to nothing" );
              System.out.println("The demon's health is now " + DemonHealth);
              
              System.out.println("confused by your fighting tactics, the demon stops to try and understand what you just did" );
              System.out.println("After further contemplation, the demon decides that this must be a sign from god himself" );
              System.out.println("He steps down from his reign of tyranny in fear of the lord and returns to the dark realm in which he came");
              System.out.println("The jungle is now free!");
              System.out.println("Congratulations!");
              System.exit(0);
             
         }
         
         if (stuff.getItem().equals("Dead Phoenix")){
             DemonHealth -= 5;
             
             System.out.println("The demon has ornithophobia (fear of birds)");
             System.out.println("The demon's health is now " + DemonHealth);
             
             DemonHealth -= 5;
             System.out.println("The demon also has Necrophobia (fear of of dead animals)");
             System.out.println("The demon's health is now " + DemonHealth);
             
             System.out.println("The demon takes a few deep breathes and attempts to overcome his fears " );
             System.out.println("He is successful.");
             System.out.println("With his fears out of the way, he decides to make you suffer");
             System.out.println("");
             System.out.println("");
             System.out.println("he entraps you in his torture chamber and sentences you to an eternity of pain");
             System.out.println("You fail your mission, leaving the jungle to suffer indefinitely.");
             System.exit(0);
         }
        
         if (stuff.getItem().equals("Magic Mushroom")){
             System.out.println("you ingest the magic mushrooms seemingly giving you super powers");
             System.out.println("You begin to sing Karaoke and breakdance infront of the demon to the k-pop song Anti-Fragile");
             System.out.println("Shocked by your level of expertise in both dance and vocals, the demon sees no reason to live and ends his life");
             System.out.println("");
             System.out.println("");
             System.out.println("YOU HAVE SLAYED THE DEMON");
             System.out.println("The jungle is now free!");
             System.out.println("Congratulations " + stuff.username);
             System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
         }
         
         if (stuff.getItem().equals("Dino Nuggets")){
             System.out.println("Your Dino Nuggets give the demon an extremely severe allergic reaction");
             System.out.println("The DINO in Dino Nuggets reminded the demon of the time he lost an arm wrestle to a t-rex");
             System.out.println("Those are the demon's final thoughts as he fades away from reality as he did not pack an epi-pen");
             System.out.println("");
             System.out.println("");
             System.out.println("YOU HAVE SLAYED THE DEMON");
             System.out.println("The jungle is now free!");
             System.out.println("Congratulations " + stuff.username);
             System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
         }
         
         if (stuff.getItem().equals("Book of Wisdom")){
             System.out.println("The Book of Wisdom gives the demon insight of better ways to manage a jungle than being a tyrant");
             System.out.println("The demon agrees to try a liberatarian democracy instead");
             System.out.println("");
             System.out.println("");
             System.out.println("The jungle is now free!");
             System.out.println("Congratulations " + stuff.username);
             System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
         }
         
         if (stuff.getItem().equals("Staff of Power")){
             System.out.println("The staff of power is similar to that  of gray bearded man in another movie who's name rhymes with ANDALF");
             System.out.println("With one loud shout you say the famous words:");
             System.out.println("YOU SHALL NOT PASS");
             System.out.println("");
             System.out.println("With one final strike you end the demon and his reign of tyranny on the jungle...");
             System.out.println("");
             System.out.println("");
             System.out.println("YOU HAVE SLAYED THE DEMON");
              System.out.println("The jungle is now free!");
              System.out.println("Congratulations " + stuff.username);
              System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
         }
         
         if (stuff.getItem().equals("Mighty Phoenix")){
             System.out.println("With one breath of fire, the mighty Phoenix sends the demon back to his home town of death");
             System.out.println("");
             System.out.println("");
             System.out.println("YOU HAVE SLAYED THE DEMON");
              System.out.println("The jungle is now free!");
              System.out.println("Congratulations " + stuff.username);
              System.out.println("Your reward is getting to play this awesome game over again!");
             System.exit(0);
         }
        
        
        
    }
    
    
    public void talk(){
        if(rand1.nextInt(6) == 0){
            System.out.println("You confront the demon about his vicious ways......");
            System.out.println("");
            System.out.println("");
            System.out.println("He stops for a moment to think why he is doing all of this");
            System.out.println("A life of hatred and sorrow was all this beast knew");
            System.out.println("The demon steps down from his onslaught of tyranny, knowing that he could be doing something better with his life");
            System.out.println("Congratulations!");     
            System.out.println("You've saved the jungle!");
            System.out.println("Your reward is getting to play this awesome game all over again!");
            System.exit(0);
        }
        
        if(rand1.nextInt(6) > 0){
              System.out.println("You confront the demon about his vicious ways");
              System.out.println("");
              System.out.println("");
              System.out.println("He finds your attempts to reason with him feeble minded");
              System.out.println("with one final strike he finishes you.");
              System.out.println("YOU DIED");  
              System.out.println("Try again :(");
              System.exit(0);
            
        }
        
        
    }
    
    
    
    
}
