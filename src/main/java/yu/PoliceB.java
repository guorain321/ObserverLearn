/**
 *Copyright (c) 2014. All Rights Reserved.
 */
package yu;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hongyu.shao created on 14-8-6 下午1:27
 * @version 1.0.0
 */
public class PoliceB implements Observer {

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I am "+this.getClass().getName());
    }
}
 