public class Application
{
    private String value;

    public Application(String p_value)
    {
        value = p_value;
    }

    public String getFirstThree()
    {
        return value.substring(0, 3);   
    }

    public String getLastThree()
    {
        return value.substring(value.length() - 3);
    }

    public String getNewString()
    {
        return getFirstThree() + getLastThree(); 
    }
    
	  public static void main(String[] args) {
		  Application example = new Application("Sourabh");
		  String newString = example.getNewString();
		      System.out.println(newString);
	}
	  


	   
}
