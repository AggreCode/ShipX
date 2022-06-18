package com.Biswa.ShipX.ReqRes_Format;

import com.Biswa.ShipX.Entity.Node;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Component;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Component
public class PathRequest {
    private int PathID;
    private int Distance;
    private int ToNodeID;

    public PathRequest() {
    }

    public PathRequest(int pathID, int distance, int toNodeID) {
        PathID = pathID;
        Distance = distance;
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

    public Integer getToNodeID() {
        return ToNodeID;
    }

    public void setToNodeID(Integer toNodeID) {
        ToNodeID = toNodeID;
    }
}
