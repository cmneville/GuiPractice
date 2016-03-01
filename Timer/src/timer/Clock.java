/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

/**
 *
 * @author chris
 */
public class Clock extends Thread{
    protected boolean stop;
    protected long startTime;
    protected long mins = 0;
    protected long secs = 0;
    @Override
    public void run(){
        startTime = System.currentTimeMillis();
        stop = false;
        while(!stop){
            mins = ((System.currentTimeMillis() - startTime) / 60000);
            secs = (((System.currentTimeMillis() - startTime) % 60000)/1000);
           
        }
    }
    
}
