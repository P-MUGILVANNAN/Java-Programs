import java.time.LocalTime;

class Greeting
 {
    public static void main(String[] args)
     {
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        
        // Get the hour of the current time
        int hour = currentTime.getHour();
        
        // Greet according to the current time
        if (hour < 12)
        {
            System.out.println("Good morning!");
        }
        else if (hour < 18)
        {
            System.out.println("Good afternoon!");
        }
        else
        {
            System.out.println("Good evening!");
        }
    }
       
}

 
