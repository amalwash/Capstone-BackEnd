package com.example.CarsOrder.model.Repository;
import com.example.CarsOrder.model.Entitiec.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository  extends JpaRepository<Owner, Integer> {
}
