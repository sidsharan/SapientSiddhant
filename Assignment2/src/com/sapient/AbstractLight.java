package com.sapient;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractLight {//light class

 /** Light year.
  * light
  * @light args
  */
  private static final long DAYS = 1000;//hi
  private static final int LIGHTSPEED = 186000;//hi

 /**void main.
 * 
 * @par args
 */
  public static void main(final String... args) {

    // Compute distance light travels using long variables.


  
   
    
    long seconds;
    long distance;

    // approximate speed of light in miles per second
   

    
    seconds = DAYS * 24 * 60 * 60; // convert to seconds
    
    distance = LIGHTSPEED * seconds; // compute distance
    
    final Logger log = Logger.getLogger(AbstractLight.class.getName());
   
    if (log.isLoggable(Level.FINE)) {
    
    
      log.fine("In " + DAYS);
      log.fine(" days light will travel about ");
      log.fine(distance + " miles.");
    }
  }
}