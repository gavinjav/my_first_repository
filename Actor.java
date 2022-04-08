public class Actor extends Celebrity
  {
private String movie;

public Actor()
    {
      
    }
    public Actor(String m, String an, String cl)
    {
      super(an,cl);
      m=movie;
    }
    public String getMovie()
    {
     return movie;
    }
    public String getClue()
    {
  return super.getClue();  
    }
  public String toString()
  {
    return "The actor is " + super.getAnswer();
  }

}


