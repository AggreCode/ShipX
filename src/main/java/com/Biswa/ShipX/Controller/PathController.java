package com.Biswa.ShipX.Controller;

import com.Biswa.ShipX.Entity.Path;
import com.Biswa.ShipX.Exception.ResourceNotFoundException;
import com.Biswa.ShipX.Repository.PathRepository;
import com.Biswa.ShipX.ReqRes_Format.PathRequest;
import com.Biswa.ShipX.Service.NodeService;
import com.Biswa.ShipX.Service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class PathController {

    @Autowired
    private PathService pathService;
    @Autowired
    private NodeService nodeService;

    @GetMapping("/ShipX/api/paths")
    public List<Path> getAllPaths() {
        return pathService.getAllPath();
    }

    @GetMapping("/ShipX/api/{nodeId}/paths/")
    public ResponseEntity getAllPathsForNodeID(@PathVariable Integer nodeId) {
        if (!nodeService.findById(nodeId)) {
            return new ResponseEntity<>("Node Id Not found", HttpStatus.NOT_FOUND);
        }
        List<Path> paths = pathService.getAllPathById(nodeId);
        return new ResponseEntity<>(paths, HttpStatus.OK);
    }

    @PostMapping("/ShipX/api/{fromNodeId}/paths/")
    public ResponseEntity<Path> postPath(@PathVariable Integer fromNodeId, @RequestBody HashMap<String, Integer> req) {
        Path path = new Path();

        Path res_path = nodeService.getById(fromNodeId).map((FromNode) ->
        {

            Integer ToNodeId = req.get("ToNodeID");
            nodeService.getById(ToNodeId).map(ToNode -> {
                path.setToNode(ToNode);
                path.setFromNode(FromNode);
                return 1;
            }).orElseThrow(() -> new ResourceNotFoundException("Not found To Node with id = " + ToNodeId));
            path.setPathID(req.get("PathID"));
            path.setDistance(req.get("Distance"));
            return pathService.save(path);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found From Node with id = " + fromNodeId));
        return new ResponseEntity<>(res_path, HttpStatus.CREATED);
    }

    @DeleteMapping("/ShipX/api/{PathID}/paths")
    public ResponseEntity deletePath(@PathVariable Integer PathID) {
        pathService.deleteById(PathID);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
