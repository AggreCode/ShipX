package com.Biswa.ShipX.Service;

import com.Biswa.ShipX.Entity.Path;
import com.Biswa.ShipX.Repository.NodeRepository;
import com.Biswa.ShipX.Repository.PathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PathService {

    @Autowired
    private PathRepository pathRepository;



    public List<Path> getAllPath(){
        return pathRepository.findAll();
    }

    public void PostPathByFromId(Path path){
        pathRepository.save(path);
    }


    public List<Path> getAllPathById(Integer nodeId) {
     return pathRepository.getPathsByNodeID(nodeId);
    }

    public Path save(Path path) {
        return pathRepository.save(path);
    }


    public void deleteById(Integer pathId){
        pathRepository.deleteById(pathId);
    }

}
