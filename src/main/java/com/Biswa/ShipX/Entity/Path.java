package com.Biswa.ShipX.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Path {
    @Id
    private int PathID;
    private int Distance;
    private int FromNodeID;
    private int ToNodeID;

    public Path() {
    }

    public Path(int pathID, int distance, int fromNodeID, int toNodeID) {
        PathID = pathID;
        Distance = distance;
        FromNodeID = fromNodeID;
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

    public int getFromNodeID() {
        return FromNodeID;
    }

    public void setFromNodeID(int fromNodeID) {
        FromNodeID = fromNodeID;
    }

    public int getToNodeID() {
        return ToNodeID;
    }

    public void setToNodeID(int toNodeID) {
        ToNodeID = toNodeID;
    }
}
