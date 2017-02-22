/*
Author: Clayton Brezinski
UserID: 200220989
Date: 
Notes:
*/

package ense471lab3;

import java.util.EventListener;

/*
 *
 * @author Dolan
 */

/*
Purpose:
Notes
*/
public interface WeatherListener extends EventListener 
{
    public void weatherChange(WeatherEvent evt);
    public void temperatureChange(WeatherEvent evt);
}
/*
Purpose:
Arguments:
Outputs: 
Notes:
*/