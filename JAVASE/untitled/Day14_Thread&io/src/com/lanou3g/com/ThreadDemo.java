package com.lanou3g.com;

public class ThreadDemo  extends  Thread {
    private Ticket ticket;

    public  ThreadDemo(String name,Ticket ticket){
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.sellTick();
    }
}
