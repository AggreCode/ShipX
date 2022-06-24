package com.Biswa.ShipX.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Path {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int PathID;
    private int Distance;


//    private int FromNodeID;
//
//    private int ToNodeID;
    @ManyToOne
    @JoinColumn(name="FromNodeID",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Node FromNode;
    @ManyToOne
    @JoinColumn(name="ToNodeID",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Node ToNode;





//    public int getFromNodeID() {
//        return FromNodeID;
//    }
//
//    public void setFromNodeID(int fromNodeID) {
//        FromNodeID = fromNodeID;
//    }
//
//    public int getToNodeID() {
//        return ToNodeID;
//    }
//
//    public void setToNodeID(int toNodeID) {
//        ToNodeID = toNodeID;
//    }

    public Node getFromNode() {
        return FromNode;
    }

    public void setFromNode(Node fromNode) {
        FromNode = fromNode;
    }

    public Node getToNode() {
        return ToNode;
    }

    public void setToNode(Node toNode) {
        ToNode = toNode;
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
