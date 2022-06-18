package com.Biswa.ShipX.Entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Node {
    @Id
    private int NodeID;


    private String NodeName;
    private String Address;
    private float CoordinateX;
    private float CoordinateY;
private String NodeType;
private String State;
private String District;
private int PinCode;

    public Node() {
    }

    public Node(int nodeID, String nodeName, String address, float coordinateX, float coordinateY, String nodeType, String state, String district, int pinCode) {
        NodeID = nodeID;
        NodeName = nodeName;
        Address = address;
        CoordinateX = coordinateX;
        CoordinateY = coordinateY;
        NodeType = nodeType;
        State = state;
        District = district;
        PinCode = pinCode;
    }

    public int getNodeID() {
        return NodeID;
    }

    public void setNodeID(int nodeID) {
        NodeID = nodeID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getCoordinateX() {
        return CoordinateX;
    }

    public void setCoordinateX(float coordinateX) {
        CoordinateX = coordinateX;
    }

    public float getCoordinateY() {
        return CoordinateY;
    }

    public void setCoordinateY(float coordinateY) {
        CoordinateY = coordinateY;
    }

    public String getNodeType() {
        return NodeType;
    }

    public void setNodeType(String nodeType) {
        NodeType = nodeType;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }
    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String nodeName) {
        NodeName = nodeName;
    }
}
