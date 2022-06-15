package com.Biswa.ShipX.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    private int TransactionID;
    private String Source;
    private String Destination;
    private int PathDistance;
    private int Cost;

    public Transaction() {
    }

    public Transaction(int transactionID, String source, String destination, int pathDistance, int cost) {
        TransactionID = transactionID;
        Source = source;
        Destination = destination;
        PathDistance = pathDistance;
        Cost = cost;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int transactionID) {
        TransactionID = transactionID;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getPathDistance() {
        return PathDistance;
    }

    public void setPathDistance(int pathDistance) {
        PathDistance = pathDistance;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }
}
