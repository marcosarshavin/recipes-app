package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.StepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepDAO  extends JpaRepository<StepEntity, BigDecimal> {
	
	/*public void create(StepEntity paso);
	public StepEntity find(String name);
	public StepEntity find(BigDecimal id);
	public void delete(StepEntity paso);
	public void update(StepEntity paso);
	public List<StepEntity> findAll();*/
}
