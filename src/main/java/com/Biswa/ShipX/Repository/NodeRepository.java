package com.Biswa.ShipX.Repository;

import com.Biswa.ShipX.Entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.nodes.NodeId;

import java.util.List;

@Repository
public interface NodeRepository extends JpaRepository<Node, Integer> {


}
