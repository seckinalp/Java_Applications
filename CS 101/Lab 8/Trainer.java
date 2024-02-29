public class Trainer 
{
    private String name;
    private String specialty;
    private String lastTestDate;
    private String injuryStatus;
    private boolean isPlayerCovid;
    private Player player;  
    boolean isCovid;
    String testDate;
    String playerName;
    
    Trainer(String name, String specialty, Player player)
    {
        this.name = name;
        this.specialty = specialty;
        this.player = player;
        this.lastTestDate = lastTestDate;
        this.isPlayerCovid = isPlayerCovid;
    }
    public void recordCovidTest(boolean isCovid, String testDate)
    {
        if(isCovid = false)
        {
            System.out.println("Is COVID-19 positive?:" + isCovid);
            System.out.println("Last test date:" + testDate);
            System.out.println();
        }
        else
        {
            System.out.println("Is COVID-19 positive?:" + isCovid);
            System.out.println("Last test date:" + testDate);
            System.out.println();
            this.isPlayerCovid = isCovid;
        }
        this.lastTestDate = testDate;
    }
    public void updateInjuryStatus (String newInjuryStatus)
    {
        this.injuryStatus = newInjuryStatus;
    }
    public String getName()
    {
        return this.name;
    }
    public String getSpecialty()
    {
        return this.specialty;
    }
    public String getPlayer()
    {
        return this.playerName;
    }
    public String getLastTestDate()
    {
        return this.lastTestDate;
    }
    public boolean getCovidStatus()
    {
        return this.isPlayerCovid;
    }
    public String getInjuryStatus()
    {
        return this.injuryStatus;
    }

    public void showTrainer()
    {
        System.out.println("Trainer Name: " + this.getName());
        System.out.println("Trainer Specialty: " + this.getSpecialty());
        System.out.println("Player Name: " + this.player.getName());
        System.out.println("Is COVID-19 positive?: " + this.getCovidStatus());
        System.out.println("Last test date: " + this.getLastTestDate());
        if(injuryStatus == null)
        {
            System.out.println("Injury status: Healthy ");
        }
        else
        {
            System.out.println("Injury status: " + this.getInjuryStatus());
        }
        
        System.out.println();
    }
}
