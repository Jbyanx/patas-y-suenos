package org.patasysuenos.adopcion.service;

import org.patasysuenos.adopcion.dto.request.SaveAdopter;
import org.patasysuenos.adopcion.dto.response.GetAdopter;

import java.util.List;

public interface AdopterService {
    List<GetAdopter> findAllAdopters();
    GetAdopter findAdopterById(Long id);
    GetAdopter saveAdopter(SaveAdopter saveAdopter);
    GetAdopter updateAdopterById(Long id, SaveAdopter saveAdopter);
    void deleteAdopterById(Long id);
}
