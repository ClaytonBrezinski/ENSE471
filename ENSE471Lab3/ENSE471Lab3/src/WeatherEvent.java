
import java.util.EventObject;

/*
Author: Clayton Brezinski
UserID: 200220989
Date: 
Notes:
*/

/*
 *
 * @author Dolan
 */

/*
Purpose:
Notes
*/
public class WeatherEvent extends EventObject 
{
	public double temperature = 0;
        public String weatherCondition = "";
	
	//The object on which the Event initially occurred.
	public WeatherEvent(Object src, double inTemperature,String inWeatherCondition)
        {
            super(src);
            this.temperature = inTemperature;
            this.weatherCondition = inWeatherCondition; 
	}
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/