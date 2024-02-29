import java.util.ArrayList;
import java.util.Collections;

/**
 * Dwarfs
 */
public class Dwarfs extends Characters
{
    String clas;
    ArrayList<Integer> abilities = new ArrayList<>();
    public Dwarfs()
    {
        
    }
    public Dwarfs(int level, Humans rival, String clas) {
        super(level, rival);
        hp = 40 + level;
        mp = 10 + level;
        speed = (level / 2) + 1;
        this.clas = clas;
        fill();
    }

    public Dwarfs(int level, Elves rival, String clas) {
        super(level, rival);
        hp = 40 + level;
        mp = 10 + level;
        speed = (level / 2) + 1;
        this.clas = clas;
        fill();
    }

    public Dwarfs(int level, Halflings rival, String clas) {
        super(level, rival);
        hp = 40 + level;
        mp = 10 + level;
        speed = (level / 2) + 1;
        this.clas = clas;
        fill();
    }

    public Dwarfs(int level, Dwarfs rival, String clas) {
        super(level, rival);
        hp = 40 + level;
        mp = 10 + level;
        speed = (level / 2) + 1;
        this.clas = clas;
        fill();
    }
    
    public void restAbility()
    {
        tempmp -= 7;
        temphp += 20;
    }

    public void useAbility(int x)
    {
        fighter f = new fighter();
        mage m = new mage();
        rogue r = new rogue();

       if(x == 3)
        {
            restAbility();
            System.out.println();
            System.out.println("...Rest...");
            System.out.println("Hp increse 20...");
            System.out.println();
        }
        else if(x == 1)
        {
            attackAbility();
            System.out.println();
            System.out.println("..Attack..");
            System.out.println("Rival Hp Damages: " + baseAtttack);
            System.out.println();
        }
        else if(x == 2)
        {
            defendAbility();
            System.out.println();
            System.out.println("..Defend..");
            System.out.println("Recovering 10 Percent Hp");
            System.out.println();
        }

        else if(x == 4)
        {
            f.burstAbility();
            System.out.println();
            System.out.println("..Burst..");
            System.out.println("Spend All Mana and Damage Rival Mana * 3");
            System.out.println();
        }
        else if(x == 5)
        {
            f.slashAbility();
            System.out.println();
            System.out.println("..Slash..");
            System.out.println("Rival Damage Base Attack * 2");
            System.out.println();
        }
        else if(x == 6)
        {
            m.blizzardAbility();
            System.out.println();
            System.out.println("..Blizzard..");
            System.out.println("Damage Rival 12 Hp, Player Lost Total 12 Mp or Hp");
            System.out.println();
        }
        else if(x == 7)
        {
            m.thunderAbility();
            System.out.println();
            System.out.println("..Thunder..");
            System.out.println("Damage Rival Base Mage * 2");
            System.out.println();
        }
        else if(x == 8)
        {
            m.fireAbility();
            System.out.println();
            System.out.println("..Fire..");
            System.out.println("Damage Rival Maximum Speed * 3");
            System.out.println();
        }
        else if(x == 9)
        {
            r.shootArrowAbility();
            System.out.println();
            System.out.println("..Shoot Arrow..");
            System.out.println("Damage Rival Base Attack + Speed + Hp");
            System.out.println();
        }
        else if(x == 0)
        {
            r.quickAttackAbility();
            System.out.println();
            System.out.println("..Quick Attack..");
            System.out.println("Damage Rival Base Attack");
            System.out.println();
        }
    }

    public void fill()
    {
        if(clas.equalsIgnoreCase("m"))
        {
            abilities.add(1);
            abilities.add(2);
            abilities.add(3);
            abilities.add(6);
            abilities.add(7);
            abilities.add(8);
        }
        else if(clas.equalsIgnoreCase("f"))
        {
            abilities.add(1);
            abilities.add(2);
            abilities.add(3);
            abilities.add(4);
            abilities.add(5);
        }
        else if(clas.equalsIgnoreCase("r"))
        {
                
            abilities.add(1);
            abilities.add(2);
            abilities.add(3);
            abilities.add(9);
            abilities.add(0);
        }
    }
    public int selectRandomAbility()
    {
        fill();
        Collections.shuffle(abilities);
        return abilities.get(0);
    }

    public Boolean checkAvailabity(int ability)
    {
        if(ability == 3)
        {
            if(tempmp > 6)
            {
                return true;
            }
        }
        else if(ability == 4)
        {
            if(tempmp > 0)
            {
                return true;
            }
        }
        else if(ability == 5)
        {
            if(tempmp > 4)
            {
                return true;
            }
        }
        else if(ability == 6)
        {
            if(tempmp > 11)
            {
                return true;
            }
            else if(tempmp + temphp > 12)
            {
                return true;
            }
        }
        else if(ability == 7)
        {
            if(tempmp > 7)
            {
                return true;
            }
        }
        else if(ability == 8)
        {
            if(tempmp > 1)
            {
                return true;
            }
            else if(hp > 2)
            {
                return true;
            }
        }
        else if(ability == 9)
        {
            if(tempmp > 1)
            {
                return true;
            }
        }
        else if(ability == 0)
        {
            if(temphp > 2)
            {
                return true;
            }
        }
        else if(ability == 1)
        {
          
            return true;
            
        }

        else if(ability == 2)
        {
          
            return true;
            
        }
        return false;
    }
    public void displayAbilities()
    {
        
        
        for(int a = 0; a < abilities.size(); a++)
        {
            String abilityName = "";
            if(checkAvailabity(abilities.get(a)) == true)
            {   
                if(abilities.get(a)== 3)
                {
                    abilityName = "3 - Rest Ability (Cost: 7 Mp)";
                }
                if(abilities.get(a)== 4)
                {
                    abilityName = "4 - Burst Ability (Cost: All Mana)";
                }
                else if(abilities.get(a) == 2)
                {
                    abilityName = "2 - Defend Ability (Cost: -)";
                }
                else if(abilities.get(a) == 1)
                {
                    abilityName = "1 - Attack Ability (Cost: -)";
                }
                else if(abilities.get(a) == 5)
                {
                    abilityName = "5 - Slash Ability (Cost: 5 Mp)";
                }
                else if(abilities.get(a) == 6)
                {
                    abilityName = "6 - Blizzard Ability (Cost: Mp + Hp = 12 (Use Mp First))";
                }
                else if(abilities.get(a) == 7)
                {
                    abilityName = "7 - Thunder Ability (Cost: 8 Mp)";
                }
                else if(abilities.get(a) == 8)
                {
                    abilityName = "8 - Fire Ability (Cost: 2 Mp or 3 Hp)";
                }
                else if(abilities.get(a) == 9)
                {
                    abilityName = "9 - Shoot Ability (Cost: 3 Hp)";
                }
                else if(abilities.get(a) == 0)
                {
                    abilityName = "0 - Quick Attack Ability (Cost: 2 Mp)";
                }
                System.out.println(abilityName);
            }
        }
    }

}