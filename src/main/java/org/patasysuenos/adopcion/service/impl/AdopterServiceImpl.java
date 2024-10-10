package org.patasysuenos.adopcion.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.patasysuenos.adopcion.dto.request.SaveAdopter;
import org.patasysuenos.adopcion.dto.response.GetAdopter;
import org.patasysuenos.adopcion.entity.Adopter;
import org.patasysuenos.adopcion.mapper.AdopterMapper;
import org.patasysuenos.adopcion.repository.AdopterRepository;
import org.patasysuenos.adopcion.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdopterServiceImpl implements AdopterService {
    private AdopterRepository adopterRepository;

    @Autowired
    public AdopterServiceImpl(AdopterRepository adopterRepository) {
        this.adopterRepository = adopterRepository;
    }


    @Override
    public List<GetAdopter> findAllAdopters() {
        return AdopterMapper.INSTANCE.adopterListToGetAdopterList(adopterRepository.findAll());
    }

    @Override
    public GetAdopter findAdopterById(Long id) {
        Optional<Adopter> adopterDb = adopterRepository.findById(id);

        return adopterDb.map
                (AdopterMapper.INSTANCE::adopterToGetAdopter)
                .orElseThrow(() -> new EntityNotFoundException("Adopter id "+id+" no encontrado"));
    }

    @Override
    public GetAdopter saveAdopter(SaveAdopter saveAdopter) {
        Adopter adopterToSave = AdopterMapper.INSTANCE.saveAdopterToAdopter(saveAdopter);
        adopterToSave = adopterRepository.save(adopterToSave);
        GetAdopter adopterSaved= AdopterMapper.INSTANCE.adopterToGetAdopter(adopterToSave);
        return adopterSaved;
    }

    @Override
    public GetAdopter updateAdopterById(Long id, SaveAdopter saveAdopter) {
        Adopter adopterFromDb = adopterRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Adopter id "+id+" no encontrado"));

        adopterFromDb.setAddress(saveAdopter.adress());
        adopterFromDb.setCity(saveAdopter.city());
        adopterFromDb.setName(saveAdopter.name());
        adopterFromDb.setImageUrl(saveAdopter.imageUrl());
        adopterFromDb.setEmail(saveAdopter.email());
        adopterFromDb.setLastname(saveAdopter.lastname());
        adopterFromDb.setPhone(saveAdopter.phone());
        adopterFromDb.setState(saveAdopter.state());

        adopterFromDb = adopterRepository.save(adopterFromDb);

        return AdopterMapper.INSTANCE.adopterToGetAdopter(adopterFromDb);
    }

    @Override
    public void deleteAdopterById(Long id) {
        if(adopterRepository.existsById(id)){
            adopterRepository.deleteById(id);
        } else{
            throw new EntityNotFoundException("Adopter id "+id+" no encontrado");
        }
    }
}
