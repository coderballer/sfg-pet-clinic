package sihanc.cmu.sfgpetclinic.services;

import sihanc.cmu.sfgpetclinic.model.Owner;
import sihanc.cmu.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
