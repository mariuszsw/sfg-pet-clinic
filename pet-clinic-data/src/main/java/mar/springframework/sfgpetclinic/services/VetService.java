package mar.springframework.sfgpetclinic.services;

import mar.springframework.sfgpetclinic.model.Owner;
import mar.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Owner owner);
    Set<Vet> findAll();
}
