

/**
 * Characters
 */
public class Characters {
    int level;
    int hp;
    int mp;
    int speed;
    int baseAtttack;
    int baseMagic;
    int temphp;
    int tempmp;
    String race;
    
    int rivalhp;
    int rivalmp;   
    int rivalSpeed;

    Humans rival;
    Elves rival2;
    Halflings rival4;
    Dwarfs rival3;
    int a = -1;
    public Characters(int level, Humans rival)
    {
        race = "H";
        this.rival = rival;
        a = 1;
        this.level = level;
        calculations();
        temphp = hp;
        tempmp = mp;
        
        rivalhp = rival.hp;
        rivalSpeed = rival.speed;
    }
    public Characters()
    {

    }

    public Characters(int level, Halflings rival)
    {
        this.rival4= rival;
        a = 3;
        this.level = level;

          calculations();
         temphp = hp;
        tempmp = mp;
         rivalSpeed = rival4.speed;
         rivalhp = rival4.hp;
         race = "A";
         
    }
    public Characters(int level, Elves rival)
    {
        this.rival2 = rival;
        this.level = level;
        calculations();
        race = "E";
        a = 2;
        
        temphp = hp;
        tempmp = mp;
       
        
        rivalSpeed = rival2.speed;
        rivalhp = rival2.hp;
       
    }
    public Characters(int level, Dwarfs rival)
    {
        race = "D";
        this.rival3 = rival;
        a = 4;
        this.level = level;
        calculations();

        temphp = hp;
        tempmp = mp;
        
        rivalSpeed = rival3.speed;
        rivalhp = rival3.hp;
      
    }

    public void increase()
    {
        level++;
        calculations();
    }

    public void calculations()
    {
        hp = 20 + (4 * level);
        mp = hp / 2;
        speed = level;
        baseAtttack = (hp / 10) + 1;
        baseMagic = (mp / 5) + 2;
        
    }

  

    public void defendAbility()
    {
        temphp += (hp * 10) / 100;
    }

    class fighter implements Fighter{
        
        public void burstAbility(){
      
            if(race.equals("E"))
            {
                rival2.temphp -= tempmp * 3;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= tempmp * 3;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= tempmp * 3;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= tempmp * 3;
            }
            tempmp = 0;
        }
           
        public void slashAbility(){

            
            tempmp -= 5;
            if(race.equals("E"))
            {
                rival2.temphp -= baseAtttack * 2;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= baseAtttack * 2;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= baseAtttack * 2;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= baseAtttack * 2;
            }

        }
    
    }


    
    class mage implements Mage{
        
        public void fireAbility(){

      
            if(race.equals("H"))
            {
                if(tempmp > 1)
                {
                    tempmp -= 2;
                    int maximumSpeed = speed;
                    if(rival.speed> maximumSpeed)
                    {
                        maximumSpeed = rival.speed;
                    }
        
                    rival.temphp -= maximumSpeed * 3;
                }
                else
                {
                    int maximumSpeed = speed;
                    if(rival.speed > maximumSpeed)
                    {
                        maximumSpeed = rival.speed;
                    }
        
                    rival.temphp -= maximumSpeed * 3;
    
                    if(rival.temphp < 1)
                    {
    
                    }
                    else
                    {
                        temphp -= 3;
                    }
            }
            }
            else if(race.equals("E"))
            {
                if(tempmp > 1)
                {
                    tempmp -= 2;
                    int maximumSpeed = speed;
                    if(rival2.speed> maximumSpeed)
                    {
                        maximumSpeed = rival2.speed;
                    }
        
                    rival2.temphp -= maximumSpeed * 3;
                }
                else
                {
                    int maximumSpeed = speed;
                    if(rival2.speed > maximumSpeed)
                    {
                        maximumSpeed = rival2.speed;
                    }
        
                    rival2.temphp -= maximumSpeed * 3;
    
                    if(rival2.temphp < 1)
                    {
    
                    }
                    else
                    {
                        temphp -= 3;
                    }
            }
        }
            else if(race.equals("D"))
            {
                {
                    if(tempmp > 1)
                    {
                        tempmp -= 2;
                        int maximumSpeed = speed;
                        if(rival3.speed> maximumSpeed)
                        {
                            maximumSpeed = rival3.speed;
                        }
            
                        rival3.temphp -= maximumSpeed * 3;
                    }
                    else
                    {
                        int maximumSpeed = speed;
                        if(rival3.speed > maximumSpeed)
                        {
                            maximumSpeed = rival3.speed;
                        }
            
                        rival3.temphp -= maximumSpeed * 3;
        
                        if(rival3.temphp < 1)
                        {
        
                        }
                        else
                        {
                            temphp -= 3;
                        }
                    }
                }
            }
            else if(race.equals("A"))
            {
                {
                    if(tempmp > 1)
                    {
                        tempmp -= 2;
                        int maximumSpeed = speed;
                        if(rival4.speed > maximumSpeed)
                        {
                            maximumSpeed = rival4.speed;
                        }
            
                        rival4.temphp -= maximumSpeed * 3;
                    }
                    else
                    {
                        int maximumSpeed = speed;
                        if(rival4.speed > maximumSpeed)
                        {
                            maximumSpeed = rival4.speed;
                        }
            
                        rival4.temphp -= maximumSpeed * 3;
        
                        if(rival4.temphp < 1)
                        {
        
                        }
                        else
                        {
                            temphp -= 3;
                        }
                    }
                }
        }}
        public void thunderAbility(){
              
            tempmp -= 8;
            

            if(race.equals("E"))
            {
                rival2.temphp -= baseMagic * 2;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= baseMagic * 2;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= baseMagic * 2;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= baseMagic * 2;
            }
        }   
        
        public void blizzardAbility(){

            if(tempmp > 11)
            {
                tempmp -= 11;
            }
            else if(tempmp > 0 && tempmp < 12)
            {
                temphp -= 12 - tempmp;
                tempmp = 0;
            }    
            else
            {
                temphp -= 12;
            }

            
            if(race.equals("E"))
            {
                rival2.temphp -= 12;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= 12;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= 12;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= 12;
            }
        }
    }

    class rogue implements Rogue{
        
        public void quickAttackAbility(){
            
            if(race.equals("E"))
            {
                rival2.temphp -= baseAtttack;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= baseAtttack;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= baseAtttack;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= baseAtttack;
            }
            tempmp -= 2;
        }
           
        public void shootArrowAbility(){
            if(race.equals("E"))
            {
                rival2.temphp -= speed + baseAtttack + 2;
            }
            else if(race.equals("D"))
            {
                rival3.temphp -= speed + baseAtttack + 2;
            }
            else if(race.equals("H"))
            {
                rival.temphp -= speed + baseAtttack + 2;
            }
            else if(race.equals("A"))
            {
                rival4.temphp -= speed + baseAtttack + 2;
            }
                if(rival.temphp < 1)
                {

                }
                else
                {
                   temphp -= 3;
                }

        }
    
    }
    public void attackAbility()
    {
        
        if(race.equals("E"))
        {
            rival2.temphp -= baseAtttack;
        }
        else if(race.equals("D"))
        {
            rival3.temphp -= baseAtttack;
        }
        else if(race.equals("H"))
        {
            rival.temphp -= baseAtttack;
        }
        else if(race.equals("A"))
        {
            rival4.temphp -= baseAtttack;
        }
    }
    
}