package es.crowdynamics.cook.dao;

import java.math.BigDecimal;
import java.util.List;

import es.crowdynamics.cook.entity.StepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepDAO  extends JpaRepository<StepEntity, BigDecimal> {
}
