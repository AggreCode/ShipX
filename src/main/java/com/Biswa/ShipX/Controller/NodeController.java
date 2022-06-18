package com.Biswa.ShipX.Controller;


import com.Biswa.ShipX.Entity.Node;
import com.Biswa.ShipX.Repository.NodeRepository;
import com.Biswa.ShipX.Service.NodeService;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
public class NodeController {

    @Autowired
    private NodeService nodeService;

    private static final Logger log = LoggerFactory.getLogger(NodeController.class);

    @GetMapping("ShipX/api/admin/nodes")
    public List<Node> get(){return nodeService.findAll();}
    @GetMapping("ShipX/api/admin/nodes/{nodeId}")
    public Node getNodeById(@PathVariable Integer nodeId){
        return nodeService.getById(nodeId).get();

    }

    @PostMapping("ShipX/api/admin/nodes")
    public ResponseEntity post(@RequestBody @NotNull HashMap<String,String> req){

        Node node = new Node();

        node.setNodeName(req.get("NodeName"));
        node.setNodeID(Integer.parseInt(req.get("NodeID")));
        node.setAddress(req.get("Address"));
        node.setNodeType(req.get("NodeType"));
        node.setDistrict(req.get("District"));
        node.setCoordinateX(Float.parseFloat(req.get("CoordinateX")));
        node.setCoordinateY(Float.parseFloat(req.get("CoordinateY")));
        node.setState(req.get("State"));
        node.setPinCode(Integer.parseInt(req.get("PinCode")));

        nodeService.save(node);
       return ResponseEntity.ok().build();
    }
    @DeleteMapping("ShipX/api/admin/nodes/{id}")
    public ResponseEntity<Long> delete(@PathVariable int id)
    {
      var isRemoved= nodeService.delete(id);

      if(!isRemoved){
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
