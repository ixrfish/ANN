/* *****************************************
  * CSCI205 - Software Engineering and Design
  * Spring 2017 *
  * Name: NAMES of team members
  * Date: Apr 1, 2017
  * Time: 11:17:13 AM *
  * Project: csci205_hw
  * Package: hw03.model
  * File: ANNModel
  * Description:
  *
  * ****************************************
 */
package hw03.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *
 * @author haoyuxiong
 */
public class ANNModel {

    private SimpleBooleanProperty sigmoidalChosen;
    private SimpleBooleanProperty softSignChosen;
    private ANN ann;

    public ANN takeInFileCreate(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream f = new FileInputStream(filename);
        ObjectInputStream configIn = new ObjectInputStream(f);
        this.ann = (hw03.model.ANN) configIn.readObject();

    }

    public ANN takeInAttributeCreate(int numInp, int numOut,
                                     int numNodesInHiddenLayers, double minSSE,
                                     int maxEpoch,
                                     int actFuncNum, int alpha, int mu) {

    }

}