package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.ActiveClassesModel;
import com.fatec.slothapp.domain.repositories.ActiveClassesRepository;
import com.fatec.slothapp.domain.repositories.ActiveClassesRepositoryCustom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class ActiveClassesService {

    private final ActiveClassesRepository activeClassesRepository;
    private final ActiveClassesRepositoryCustom activeClassesRepositoryCustom;

    public ActiveClassesService(ActiveClassesRepository activeClassesRepository, ActiveClassesRepositoryCustom activeClassesRepositoryCustom) {
        this.activeClassesRepository = activeClassesRepository;
        this.activeClassesRepositoryCustom = activeClassesRepositoryCustom;
    }

    public List<ActiveClassesModel> getAllActiveClasses() {
        return activeClassesRepository.findAll();
    }

    public List<ActiveClassesModel> getActiveClassesByTeacherId(BigInteger teacherId) {
        return activeClassesRepositoryCustom.getActiveClassesByTeacherId(teacherId);
    }
}
