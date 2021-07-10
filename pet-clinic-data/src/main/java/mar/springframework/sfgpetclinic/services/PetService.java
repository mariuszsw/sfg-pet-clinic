package mar.springframework.sfgpetclinic.services;

import mar.springframework.sfgpetclinic.model.Owner;
import mar.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
