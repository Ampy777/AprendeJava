/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.Date;
import java.util.TimerTask;

public class Timer{
    public static void main(String[] args)
    {

        /*
         * Creating timer task
         */
        TimerTask TimeTask = new TimerTask() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };  

        /*
         * Creates a new timer. The associated thread does not run as
         * a daemon.
         */
        Timer timer = new Timer();

        Date scheduleDateTime = new Date(System.currentTimeMillis() + 20000);
        System.out.println("scheduleDateTime = " + scheduleDateTime);

        /*
         * Schedules the specified task for execution at the specified
         * time. If the time is in the past, the task is scheduled for
         * immediate execution.
         *
         * Parameters:
         *
         * task - task to be scheduled.
         *
         * time - time at which task is to be executed.
         */
        timer.schedule(TimeTask, scheduleDateTime);
        System.out.println("Timer has schedule the -------cleanUpTimerTask...");
    }

    private void schedule(TimerTask TimeTask, Date scheduleDateTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
