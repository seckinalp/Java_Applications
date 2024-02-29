public class Player 
{
    private String name ;
    private String position ;
    private String team ;
    private int rosterNumber ;
    private int id = 0;
    private boolean isActive ;
    private static int allCount = 0 ;
    private static int count = 0 ;
    double gamesPlayed ;
    double pointPerGame;
    double assistsPerGame;
    double reboundsPerGame;
    double turnoversPerGame;


    Player(String name, String position, String team, int rosterNumber)
    {
        this.name = name;
        this.position = position;
        this.team = team;
        this.rosterNumber = rosterNumber;
        Player.register();
        this.id = allCount;
        this.isActive = true;
    }
    public void remove()
    {
        count--;
        this.isActive = false;
    }
    public int getID()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPosition()
    {
        return this.position;
    }
    public String getTeam()
    {
        return this.team;
    }
    public boolean getIsActive()
    {
        return this.isActive;       
    }
    public int getRosterNumber()
    {
        return this.rosterNumber;
    }
    public int isActive()
    {
        if ( this.isActive = true)
        {
            return this.rosterNumber;
        }
        else
        {
            return 0;
        }
    }
    public static void register()
    {
        count++;
        allCount++;
    }
    public void setName (String newName)
    {
        this.name = newName;
    }
    public void setRosterNumber(int newRosterNumber)
    {
        this.rosterNumber = newRosterNumber;
    }
    
    public void retire()
    {
        isActive = false;
        count--;
    }
    public void setPosition(String newPosition)
    {
        if(newPosition.equals("SF"))
        {
            position = newPosition;  
        }
        if(newPosition.equals("PF"))
        {
            position = newPosition;  
        }
        if(newPosition.equals("SG"))
        {
            position = newPosition;  
        }
        if(newPosition.equals("PG"))
        {
            position = newPosition;  
        }
        else
        {
            System.out.println("New position is invalid");
        }
    }
    public void transfer(String newTeam)
    {
        if(this.team.equals(newTeam))
        {
            System.out.println("Error! Already in that team");
            this.team = newTeam;
        }
        else
        {
            this.team = newTeam;
        }      
    }
    public boolean isBeforeThan(Player player)
    {
        if(this.getName().compareTo(player.getName())<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void recordGame(double points, double assists, double rebounds,double turnovers)
    {
        //calculate average
        
        this.pointPerGame = ((pointPerGame * gamesPlayed ) +  points) / ( gamesPlayed + 1 );
        this.assistsPerGame = ((assistsPerGame * gamesPlayed ) + assists) / ( gamesPlayed + 1);
        this.reboundsPerGame = ((reboundsPerGame * gamesPlayed ) + rebounds ) / ( gamesPlayed + 1);
        this.turnoversPerGame = ((turnoversPerGame * gamesPlayed ) + turnovers ) / ( gamesPlayed + 1);
        this.gamesPlayed++;
    }

    //calculate efficiency
    double efficiency;  
    public double efficiencyCalculate()
    {
        return efficiency = ( pointPerGame * ( 1.0 ) ) + ( (0.7) * assistsPerGame ) + ( (0.7) * reboundsPerGame ) - ( (0.9) * turnoversPerGame );
    }
    public boolean isMoreEfficient(Player player)
    {
        if(this.efficiencyCalculate()>player.efficiencyCalculate())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void showAll()
    { 
        System.out.printf("****************************************%n");
        System.out.println("Player ID: " + this.getID());
        System.out.println("Player name: " + this.getName());
        System.out.println("Player position: " + this.getPosition());
        System.out.println("Current team: " + this.getTeam());
        System.out.println("Jersey number: " + this.getRosterNumber());
        System.out.printf("----------------------------------------%n");
        System.out.println("PPG: " +  String.format("%.2f", this.pointPerGame));
        System.out.println("APG: " +  String.format("%.2f", this.assistsPerGame));
        System.out.println("RPG: " +  String.format("%.2f", this.reboundsPerGame));
        System.out.println("TPG: " +  String.format("%.2f", this.turnoversPerGame));
        System.out.println("Efficiency: " + String.format("%.2f", this.efficiencyCalculate()));
        System.out.printf("----------------------------------------%n");
       
        if(this.isActive)
        {
        System.out.println("Retirement Status: Active among " + count + " active player(s)");
        }
        else
        {
            System.out.println("Retirement Status: Not acvtive");
        }
        System.out.printf("****************************************%n");
    }
    public void showID()
    {
        System.out.println("Player ID: " + this.getID());
        System.out.println("Player name: " + this.getName());
        System.out.println("Player position: " + this.getPosition());
        System.out.println("Current team: " + this.getTeam());
        System.out.println("Jersey number: " + this.getRosterNumber());
        System.out.println();
    }
}
