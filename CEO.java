public class CEO extends Celebrity
  {
private String business;

public CEO()
    {
      
    }
    public CEO(String b, String an, String cl)
    {
      super(an,cl);
      b=business;
    }
    public String getBusiness()
    {
     return business;
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









    
  