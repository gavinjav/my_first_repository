public class Athlete extends Celebrity 
  {
    private String sport;
private String team;
private String position;
private int number; 

public Athlete()
    {
      
    }
    public Athlete(String s, String t, String p, int n, String a, String c)
    {
      super(a,c);
      sport=s;
      team=t;
      position=p;
      number=n;
    }
    public String getSport()
    {
     return sport;
    }
    public String getTeam()
    {
     return team;
    }
    public String getPosition()
    {
     return position;
    }
    public int getNumber()
    {
     return number;
    }
      public String getClue()
    {
     return super.getClue() + "and his position is " + position + "his team is" + team + "his sport is" + sport;
    }
    
  public String toString()
  {
    return "The athlete is " + super.getAnswer();
  }

}










    
  