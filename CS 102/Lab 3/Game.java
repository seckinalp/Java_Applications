
import java.util.Scanner;

public class Game {
    static String c = "";
    static String c2 = "";
    static Elves r2 = new Elves();
    static Humans r1 = new Humans();
    static Halflings r4 = new Halflings();
    static Dwarfs r3 = new Dwarfs();
    static Elves rival2 = new Elves();
    static Humans rival1 = new Humans();
    static Halflings rival4 = new Halflings();
    static Dwarfs rival3 = new Dwarfs();
    static int level = 1;
    static int oldmp = 0;
    static String t ="";
    static String tt = "";
    static int count = 0;
    static int choose = 0;
    static int play = 1;
    static int g = 1;

    int randomRace;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(play == 1)
        {
            int choose3 = 0;
            int choose2 = 0;
            int xxx;
            int tttt =0;
            System.out.println();
            System.out.println();
            System.out.println("1- Human");
            System.out.println("2- Elf");
            System.out.println("3- Dwarfs");
            System.out.println("4- Halflings");
            System.out.println("5- Quit");
            System.out.print("Choose your Race: ");
            choose = in.nextInt();
            System.out.println("Do you want to Auto Pilot?");
            System.out.println("1- Yes");
            System.out.println("2- No");
            choose3 = in.nextInt();
        if(choose == 1)
        {
            System.out.println();
            System.out.println("1- Fighter");
            System.out.println("2- Rogue");
            System.out.println("3- Mage");
            System.out.print("Choose your Class: ");
            choose2 = in.nextInt();
            if(choose2 == 1)
            {
                c = "f";
                t = "Fighter";
            }
            else if(choose2 == 2)
            {
                c = "r";
                t = "Rogue";
            }
            else if(choose2 == 3)
            {
                c = "m";
                t = "Mage";
            }
            int lose = 0;
            Humans player = new Humans(level, rival1, c);
          
  
           
            while(lose != 1)
            {
                int randomLevel = (int) (Math.random()* level ) + 1;
                int a = chooseRival(randomLevel);
                
                if( a == 1)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Humans " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival1 = new Humans(randomLevel, player, c2);
                    Humans playerx = new Humans(level, rival1, c);
  
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(rival1.rival.temphp > 0 && rival1.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            rival1.selectRandomAbility();
                            xxx = 1;
                        }

                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival1.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival1.selectRandomAbility();
                                if(rival1.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival1.useAbility(an);
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival1.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                    
                    
                    


                }
                else if ( a == 2)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    g = 2;
                     
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Humans " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival2 = new Elves(randomLevel, player, c2);
                    Humans playerx = new Humans(level, rival2, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(rival2.rival.temphp > 0 && rival2.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival2.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival2.selectRandomAbility();
                                if(rival2.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival2.useAbility(an);
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival2.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                    
                   
                }
                else if( a == 3)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g =1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                   
                        System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Humans " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival3 = new Dwarfs(randomLevel, player, c2);
                    Humans playerx = new Humans(level, rival3, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(rival3.rival.temphp > 0 && rival3.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival3.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival3.selectRandomAbility();
                                if(rival3.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival3.useAbility(an);
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival3.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                    
                    

                }
                else if ( a == 4)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("4 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                        
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Humans " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival4 = new Halflings(randomLevel, player, c2);
                    Humans playerx = new Humans(level, rival4, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(rival4.rival.temphp > 0 && rival4.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival4.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival4.selectRandomAbility();
                                if(rival4.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival4.useAbility(an);
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival4.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                    
                    
                }   
                level ++;
                count ++;
            }
        }
        else if(choose == 2)
            {
            System.out.println();
            System.out.println("1- Rogue");
            System.out.println("2- Mage");
            System.out.print("Choose your Class: ");
            choose2 = in.nextInt();
 
            if(choose2 == 1)
            {
                c = "r";
                t = "Rogue";
            }
            else if(choose2 == 2)
            {
                c = "m";
                t = "Mage";
            }
            int lose = 0;
            Elves player = new Elves(level, rival2, c);
           
  
           
            while(lose != 1)
            {
                int randomLevel = (int) (Math.random()* level ) + 1;
                int a = chooseRival(randomLevel);
                
                if( a == 1)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1 && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("4 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    g = 2;
                    
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Elves " + t );
                    System.out.println("Rival: " + tt);
                    
                    Humans rival = new Humans(randomLevel, player, c2);
                    Elves playerx = new Elves(level, rival, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival1.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival1.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival1.selectRandomAbility();
                                if(rival1.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival1.useAbility(an);
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival1.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;


                }
                else if ( a == 2)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    g = 2;
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Elves " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival2 = new Elves(randomLevel, player, c2);
                    Elves playerx = new Elves(level, rival2, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival2.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival2.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival2.selectRandomAbility();
                                if(rival2.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival2.useAbility(an);
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival2.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                }
                else if( a == 3)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Elf");

                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Elves " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival3 = new Dwarfs(randomLevel, player, c2);
                    Elves playerx = new Elves(level, rival3, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival3.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival3.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival3.selectRandomAbility();
                                if(rival3.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival3.useAbility(an);
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival3.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }
                else if ( a == 4)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    g = 2;
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Humans " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival4 = new Halflings(randomLevel, player, c2);
                    Elves playerx = new Elves(level, rival4, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival4.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival4.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival4.selectRandomAbility();
                                if(rival4.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival4.useAbility(an);
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival4.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }   
                level ++;
                count ++;
            }
            
        }
        else if(choose == 3)
            {
            System.out.println();
            System.out.println("1- Fighter");
            System.out.println("2- Mage");
            System.out.print("Choose your Class: ");
            choose2 = in.nextInt();
 
            if(choose2 == 1)
            {
                c = "f";
                t = "Fighter";
            }
            else if(choose2 == 2)
            {
                c = "m";
                t = "Mage";
            }
            int lose = 0;
            Dwarfs player = new Dwarfs(level, rival3, c);
           
  
           
            while(lose != 1)
            {
                int randomLevel = (int) (Math.random()* level ) + 1;
                int a = chooseRival(randomLevel);
                
                if( a == 1)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Dwarfs " + t );
                    System.out.println("Rival: " + tt);
                    
                    Humans rival = new Humans(randomLevel, player, c2);
                    Dwarfs playerx = new Dwarfs(level, rival, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival1.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival1.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival1.selectRandomAbility();
                                if(rival1.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival1.useAbility(an);
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival1.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;


                }
                else if ( a == 2)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Dwarfs " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival2 = new Elves(randomLevel, player, c2);
                    Dwarfs playerx = new Dwarfs(level, rival2, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival2.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival2.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival2.selectRandomAbility();
                                if(rival2.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival2.useAbility(an);
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival2.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                }
                else if( a == 3)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g =2;
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Dwarfs " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival3 = new Dwarfs(randomLevel, player, c2);
                    Dwarfs playerx = new Dwarfs(level, rival3, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival3.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival3.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival3.selectRandomAbility();
                                if(rival3.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival3.useAbility(an);
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival3.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }
                else if ( a == 4)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    g = 2;
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Dwarfs " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival4 = new Halflings(randomLevel, player, c2);
                    Dwarfs playerx = new Dwarfs(level, rival4, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival4.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival4.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival4.selectRandomAbility();
                                if(rival4.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival4.useAbility(an);
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival4.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }   
                level ++;
                count ++;
            }

        }
        else if(choose == 4)
            {
            System.out.println();
            System.out.println("1- Fighter");
            System.out.println("2- Rogue");
            System.out.print("Choose your Class: ");
            choose2 = in.nextInt();
 
            if(choose2 == 1)
            {
                c = "f";
                t = "Fighter";
            }
            else if(choose2 == 2)
            {
                c = "r";
                t = "Rogue";
            }
            int lose = 0;
            Halflings player = new Halflings(level, rival3, c);
           
  
           
            while(lose != 1)
            {
                int randomLevel = (int) (Math.random()* level ) + 1;
                int a = chooseRival(randomLevel);
                
                if( a == 1)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Elf");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    g = 2;
                    
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Halflings " + t );
                    System.out.println("Rival: " + tt);
                    
                    Humans rival = new Humans(randomLevel, player, c2);
                    Halflings playerx = new Halflings(level, rival, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival1.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival1.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival1.selectRandomAbility();
                                if(rival1.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival1.useAbility(an);
                            System.out.println("Rival's HP: " + rival1.temphp+ " --- Rival's MP: "+ rival1.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival1.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;


                }
                else if ( a == 2)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1 )
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Halflings " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival2 = new Elves(randomLevel, player, c2);
                    Halflings playerx = new Halflings(level, rival2, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival2.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival2.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival2.selectRandomAbility();
                                if(rival2.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival2.useAbility(an);
                            System.out.println("Rival's HP: " + rival2.temphp+ " --- Rival's MP: "+ rival2.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival2.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;
                }
                else if( a == 3)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1)
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if (tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    
                    g = 2;
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Halflings " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival3 = new Dwarfs(randomLevel, player, c2);
                    Halflings playerx = new Halflings(level, rival3, c);
         
                    if(tttt == 1)
                    {
                        System.out.println();
                    }
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival3.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival3.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival3.selectRandomAbility();
                                if(rival3.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival3.useAbility(an);
                            System.out.println("Rival's HP: " + rival3.temphp+ " --- Rival's MP: "+ rival3.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival3.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }
                else if ( a == 4)
                {
                    System.out.println();
                    System.out.println("Beaten Enemies: " + count);
                    if(level != 1  && g != 1 )
                    {
                        System.out.println("Player Hp: " + player.temphp + " Player Mana: " + oldmp);
                        System.out.println();
                        System.out.println("Do you wanna play another round? ");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int ttt = in.nextInt();
                        if(ttt == 2)
                        {
                            System.out.println("Goodbye...");
                            break;
                        }
                        else
                        {
                            System.out.println("Do you wanna use BULENT ABILTY");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No NOOO");
                            tttt = in.nextInt();
                            if(tttt == 1)
                            {
                                g = 1;
                                break;
                            }
                        }
                    }
                    
                    g = 2;
                    
                    System.out.println();
                    System.out.println(".........New Rival........");
                    System.out.println("Player's Level: " + level + " Rival's Level: " + randomLevel);
                    System.out.println("Player: Halflings " + t );
                    System.out.println("Rival: " + tt);
                    
                    rival4 = new Halflings(randomLevel, player, c2);
                    Halflings playerx = new Halflings(level, rival4, c);
                    if(level != 1)
                    {
                        oldmp += (player.mp * 20) / 100;
                        playerx.tempmp = oldmp;
                        player.temphp += (playerx.hp * 10) / 100;
                    }
                   
                    
                    while(player.temphp > 0 && rival4.temphp > 0 )
                    {

                        System.out.println();
                        System.out.println("New Round" );
                        System.out.println();
                        System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        System.out.println();
                        playerx.displayAbilities();
                        System.out.println();
                        if(choose3 == 2)
                        {
                            System.out.print("Choose Ability: ");
                            xxx = in.nextInt();
                        }
                        else
                        {    
                            xxx = 1;
                        }
                        System.out.print("Player's Move: ");
                        playerx.useAbility(xxx);
                        if(rival4.temphp > 0)
                        {
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                            System.out.print("Rival's Move: ");
                            int an = 4;
                            while(true)
                            {
                                an = rival4.selectRandomAbility();
                                if(rival4.checkAvailabity(an))
                                {
                                    break;
                                }
                            }
                            rival4.useAbility(an);
                            System.out.println("Rival's HP: " + rival4.temphp+ " --- Rival's MP: "+ rival4.tempmp + " --- Player's HP: " + player.temphp+ " --- Player's MP: " + playerx.tempmp);
                        }
                        else
                        {
                            System.out.println("Rival Lost");
                        }
                    }
                    if(rival4.rival.temphp < 1)
                    {
                       lose = 1;
                       System.out.println("Player Lost");
                    }
                    oldmp = playerx.tempmp;

                }   
                level ++;
                count ++;
        } }
         else if(choose == 5)
            {
                System.out.println();
                System.out.println("Bye");
                System.out.println();
                play = 0;
            }
        }
    in.close();
    }

    public static int chooseRival(int lvl)
    {
        int x = 1;
        if(lvl > 1)
        {
            int ra = (int) (Math.random()* lvl ) + 1;
            x = ra;
        }

        int randomRace = (int) (Math.random()* 3 ) + 1;
        int randomClass = (int) (Math.random()* 2 ) + 1;
        if (randomRace == 1)
        {
            if(randomClass == 1)
            {
                c2 = "f";
                tt = "Humans Fighter";
            }
            else if(randomClass == 2)
            {
                c2 = "r";
                tt = "Humans Rogue";
            }
            else if(randomClass == 3)
            {
                c2 = "m";
                tt = "Humans Mage";
            }
            
            if(choose == 1)
            {
                rival1 = new Humans(x, r1, c2);
            }
            else if(choose == 2)
            {
                rival1 = new Humans(x, r2, c2);
            }
            else if(choose == 3)
            {
                rival1 = new Humans(x, r3, c2);
            }
            else if(choose == 4)
            {
                rival1 = new Humans(x, r4, c2);
            }
            
            return randomRace;
        }
        else if(randomRace == 2)
        {
            if(randomClass == 1)
            {
                c2 = "r";
                tt = "Elves Rogue";
            }
            else if(randomClass == 2)
            {
                c2 = "m";
                tt = "Elves Mage";
            }
            
            if(choose == 1)
            {
                rival2 = new Elves(x, r1, c2);
            }
            else if(choose == 2)
            {
                rival2 = new Elves(x, r2, c2);
            }
            else if(choose == 3)
            {
                rival2 = new Elves(x, r3, c2);
            }
            else if(choose == 4)
            {
                rival2 = new Elves(x, r4, c2);
            }
            return randomRace;
        }
        else if(randomRace == 3)
        {
            if(randomClass == 1)
            {
                c2 = "f";
                tt = "Dwarfs Fighter";
            }
            else if(randomClass == 2)
            {
                c2 = "m";
                tt = "Dwarfs Mage";
            }
           
            if(choose == 1)
            {
                rival3 = new Dwarfs(x, r1, c2);
            }
            else if(choose == 2)
            {
                rival3 = new Dwarfs(x, r2, c2);
            }
            else if(choose == 3)
            {
                rival3 = new Dwarfs(x, r3, c2);
            }
            else if(choose == 4)
            {
                rival3 = new Dwarfs(x, r4, c2);
            }
            return randomRace;
        }
        else if(randomRace == 4)
        {
            if(randomClass == 1)
            {
                c2 = "f";
                tt = "Halflings Fighter";
            }
            else if(randomClass == 2)
            {
                c2 = "r";
                tt = "Halflings Rogue";
            }
               

            if(choose == 1)
            {
                rival4 = new Halflings(x, r1, c2); 
            }
            else if(choose == 2)
            {
                rival4 = new Halflings(x, r2, c2); 
            }
            else if(choose == 3)
            {
                rival4 = new Halflings(x, r3, c2); 
            }
            else if(choose == 4)
            {
                rival4 = new Halflings(x, r4, c2); 
            }
            return randomRace;
        }
        return -1;
    }

}
