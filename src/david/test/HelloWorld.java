package david.test;

/**
 * Created by dbatty on 12/21/2015.
 */
public class HelloWorld {

    private String name = "";

    public static void main (String[] arg){
        HelloWorld h = new HelloWorld();
        System.out.println(h.getMessage());
    }

    public String getMessage()
    {
        if (name == "")
        {
            return "HelloWorl";
        }
        else
        {
            return "Hello " + name ;
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
