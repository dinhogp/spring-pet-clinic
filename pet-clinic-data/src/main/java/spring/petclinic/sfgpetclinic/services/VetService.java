package spring.petclinic.sfgpetclinic.services;

public interface VetService{

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}