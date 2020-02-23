package spring.petclinic.sfgpetclinic.services;

import spring.petclinic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}