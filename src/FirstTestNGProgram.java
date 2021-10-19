import org.testng.annotations.Test;

public class FirstTestNGProgram {
    @Test
    void setup()
    {
        System.out.println("setup method");

    }
    @Test
    void login()
    {
        System.out.println("login to application");
    }
    @Test
    void logout()
    {
        System.out.println("logout from application");
    }
}

