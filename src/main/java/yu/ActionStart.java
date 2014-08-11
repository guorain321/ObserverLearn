/**
 *Copyright (c) 2014. All Rights Reserved.
 */
package yu;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author hongyu.shao created on 14-8-6 下午1:28
 * @version 1.0.0
 */
public class ActionStart {
    public static void main(String[] args){
        Boss observable = new Boss();
        observable.addObserver(new PoliceA());
        observable.addObserver(new PoliceB());
        observable.change();
    }
}  
 