package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.ActiveClassesModel;

import java.math.BigInteger;
import java.util.List;

public interface ActiveClassesRepositoryCustom {

    List<ActiveClassesModel> getActiveClassesByTeacherId(BigInteger teacherId);
}
