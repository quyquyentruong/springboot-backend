package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, Long> {
}
