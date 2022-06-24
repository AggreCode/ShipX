package com.Biswa.ShipX.Repository;


import com.Biswa.ShipX.Entity.Path;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PathRepository extends JpaRepository<Path,Integer> {
@Query("select t from Path t where t.FromNode.NodeID=?1 or t.ToNode.NodeID=?1")
List<Path> findByFromNodeID(Integer FromNodeID);



}
