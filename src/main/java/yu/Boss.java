/**
 *Copyright (c) 2014. All Rights Reserved.
 */
package yu;

import java.util.Observable;

/**
 * @author hongyu.shao created on 14-8-6 下午1:38
 * @version 1.0.0
 */
public class Boss extends Observable {

    public void change(){
        setChanged();
        notifyObservers();
    }
}  
 