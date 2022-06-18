package com.Biswa.ShipX.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Path {
    @Id
    private int PathID;
    private int Distance;

    @ManyToOne(fetch= FetchType.LAZY,optional = false)
    @JoinColumn(name="FromNodeID",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Node FromNodeID;
    @ManyToOne(fetch= FetchType.LAZY,optional = false)
    @JoinColumn(name="ToNodeID",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Node ToNodeID;

    public Path() {
    }

    public Path(int pathID, int distance, Node fromNodeID, Node toNodeID) {
        PathID = pathID;
        Distance = distance;
        FromNodeID = fromNodeID;
        ToNodeID = toNodeID;
    }

    public Node getFromNodeID() {
        return FromNodeID;
    }

    public void setFromNodeID(Node fromNodeID) {
        FromNodeID = fromNodeID;
    }

    public Node getToNodeID() {
        return ToNodeID;
    }

    public void setToNodeID(Node toNodeID) {
        ToNodeID = toNodeID;
    }


    public int getPathID() {
        return PathID;
    }

    public void setPathID(int pathID) {
        PathID = pathID;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }


}
