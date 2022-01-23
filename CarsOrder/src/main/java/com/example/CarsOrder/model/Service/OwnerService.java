package com.example.CarsOrder.model.Service;
import com.example.CarsOrder.model.Entitiec.Owner;
import com.example.CarsOrder.model.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    private OwnerRepository ownerRepository;


    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getOwners() {
        return ownerRepository.findAll();

    }

    public Optional<Owner> getOwner(Integer ownerId) {
        return ownerRepository.findById(ownerId);

    }

    public void addNewOwner(Owner owner) {
        ownerRepository.save(owner);

    }
    public void deleteOwner(Integer ownerId) {
        ownerRepository.deleteById(ownerId);

    }
}
