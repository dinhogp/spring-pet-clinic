package spring.petclinic.sfgpetclinic.services;

public interface PetService{

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}