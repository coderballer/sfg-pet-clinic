package sihanc.cmu.sfgpetclinic.services;

import sihanc.cmu.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
