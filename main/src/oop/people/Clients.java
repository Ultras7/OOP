package oop.people;

import oop.airport.planes.Planes;
/**
 * Created by Bekbolat on 03.02.2017.
 */

public class Clients extends People {
    static final String CATEGORY1 = "BUSINESS CLASS";
    static final String CATEGORY2 = "ECONOMY CLASS";
    private int ticketAmount;
int TicketAmount [] ={20000,15000,30000,40000,45000,25000,22000,27000,33000,25000};
    public Clients(int number, int age, float mass, int ticketAmount) {
        super(number, age, mass);
        this.ticketAmount = ticketAmount;


        if (this.ticketAmount > 30000) {
            System.out.println(CATEGORY1);
        } else if (this.ticketAmount < 30000 && this.ticketAmount > 0) {
            System.out.println(CATEGORY2);
        }

        Planes pasNumber = new Planes();
        for (int i = 1; i < pasNumber.getClientsnumber(); i++) {
            pasNumber.setClientsnumber(i++);
        }
    }






}
