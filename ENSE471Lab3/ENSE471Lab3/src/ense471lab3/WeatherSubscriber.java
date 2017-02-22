/*
 Author: Clayton Brezinski
 UserID: 200220989
 Date:
 Notes:
 */
package ense471lab3;

/*

 @author Dolan
 */

 /*
 Purpose:
 Notes
 */
public class WeatherSubscriber implements WeatherListener
{
    private int id;

    public WeatherSubscriber(int inID)
    {
        this.id = inID;
        System.out.println("WeatherSubscriber: " + inID + ", created");
    }

    @Override
    public void weatherChange(WeatherEvent event)
    {
        System.out.println("WeatherSubscriber-" + id
                + ": I am notified of a weather change");

        if (event.temperature != 0 || event.weatherCondition != "")
        {
            System.out.println("WeatherSubscriber-" + id + ": temperature: " + event.temperature + " ,weather: " + event.weatherCondition);
        }
    }

    @Override
    public void temperatureChange(WeatherEvent event)
    {
        System.out.println("WeatherSubscriber-" + id
                + ": I am notified of a temperature change");

        if (event.temperature != 0 || event.weatherCondition != "")
        {
            System.out.println("WeatherSubscriber-" + id + ": temperature: " + event.temperature + " ,weather: " + event.weatherCondition);
        }
    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
