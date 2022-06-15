package com.Biswa.ShipX.Service;

import com.Biswa.ShipX.Entity.Node;
import com.Biswa.ShipX.Repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    private NodeRepository NodeRepo;

    public List<Node> findAll() {
        return NodeRepo.findAll();
    }
}
