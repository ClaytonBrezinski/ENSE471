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
        System.out.println("LightWatcher-" + id
                + ": I am notified that light is on");

        if (event.temperature != 0 || event.weatherCondition != "")
        {
            System.out.println("LightWatcher-" + id + ": temperature: " + event.temperature + " ,weather: " + event.weatherCondition);
        }
    }

    @Override
    public void temperatureChange(WeatherEvent evt)
    {

    }
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/
