package com.example.CarsOrder.controller;
import com.example.CarsOrder.model.Entitiec.Owner;
import com.example.CarsOrder.model.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping
public class OwnerController {

    private OwnerService ownerService;



    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping
    public List<Owner> getOwners() {
        return ownerService.getOwners();
    }

    @GetMapping(path = "owner/{ownerId}")
    public Optional<Owner> getOwner(@PathVariable(name = "ownerId") Integer ownerId) {
        return ownerService.getOwner(ownerId);
    }

    @PostMapping("add/owner")
    public void registerNewOwner(@RequestBody Owner owner){
        ownerService.addNewOwner(owner);
    }


    @DeleteMapping(path = "delete/owner/{ownerId}")
    public void deleteOwner(@PathVariable("ownerId")String ownerId){
        int intownerId = Integer.parseInt(ownerId);
        ownerService.deleteOwner(intownerId);
    }
}

