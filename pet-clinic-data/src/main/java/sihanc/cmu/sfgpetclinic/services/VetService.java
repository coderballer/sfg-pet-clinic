package sihanc.cmu.sfgpetclinic.services;

import sihanc.cmu.sfgpetclinic.model.Owner;
import sihanc.cmu.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
