/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import infrastructure.Line;
import ai.Driver;

/**
 *
 * @author schueler
 */
public class Car
{
    public final int MAX_SPEED;
    public final int MAX_ACCL;
    public final int MAX_DCCL;
    private Line line;
    private Driver driver;
    private float x;
    private float curVelocity;
    private float curAcceleration;

    public Car(int MAX_SPEED , int MAX_ACCL , int MAX_DCCL , Line line , Driver driver , float x , float curVelocity , float curAcceleration)
    {
        this.MAX_SPEED = MAX_SPEED;
        this.MAX_ACCL = MAX_ACCL;
        this.MAX_DCCL = MAX_DCCL;
        this.line = line;
        this.driver = driver;
        this.x = x;
        this.curVelocity = curVelocity;
        this.curAcceleration = curAcceleration;
    }

    public class CarData
    {
        public int maxMaxSpeed;
        public int minMaxSpeed;
        
        public int maxMaxAcc;
        public int minMaxAcc;
        
        public int maxMaxDcc;
        public int minMaxDcc;
        
        
        /**Define the Max and Min specifications of cars. Used by Spawner class.
         * 
         */
        public CarData(int averageMaxSpeed , int maxSpeedRange , int averageMaxAcc , int maxAccRange , int averageMaxDcc , int maxDccRange)
        {
            this.maxMaxSpeed = averageMaxSpeed;
            this.minMaxSpeed = maxSpeedRange;
            this.maxMaxAcc = averageMaxAcc;
            this.minMaxAcc = maxAccRange;
            this.maxMaxDcc = averageMaxDcc;
            this.minMaxDcc = maxDccRange;
        }
    }
}
