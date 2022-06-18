package com.Biswa.ShipX.Service;

import com.Biswa.ShipX.Entity.Node;
import com.Biswa.ShipX.Entity.Path;
import com.Biswa.ShipX.Repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NodeService {

    @Autowired
    private NodeRepository NodeRepo;

    public List<Node> findAll() {
        return NodeRepo.findAll();
    }

    public void save(Node req) {
        NodeRepo.save(req);
    }
    public Boolean delete(int id){
      if(NodeRepo.existsById(id)){
          NodeRepo.deleteById(id);
          return true;
      }
      return  false;
    }

    public Boolean findById(Integer nodeid) {
        return NodeRepo.existsById(nodeid);

    }

    public Optional<Node> getById(Integer fromNodeId) {

        return NodeRepo.findById(fromNodeId);


    }
}
