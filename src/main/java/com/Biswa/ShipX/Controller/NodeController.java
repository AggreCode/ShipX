package com.Biswa.ShipX.Controller;


import com.Biswa.ShipX.Entity.Node;
import com.Biswa.ShipX.Repository.NodeRepository;
import com.Biswa.ShipX.Service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NodeController {

    @Autowired
    private NodeService nodeService;


    @GetMapping("/api/admin/nodes")
    public List<Node> get(){
return nodeService.findAll();

    }

}
