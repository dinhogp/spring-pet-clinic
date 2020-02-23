package spring.petclinic.sfgpetclinic.services.map;

import spring.petclinic.sfgpetclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

    Set<Owner> findAll(){
        return super.findAll();
    }

    Owner findById(Long id){
        return super.findById(id);
    }

    Owner save(Owner object){
        return super.save(object.getId(), object);
    }

    void delete(Owner object){
        super.delete(object);
    }

    void deleteById(Long id){
        super.deleteById(id);
    }
}