package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entities.Phase;
import com.adaming.service.interfaces.IPhaseService;

@Service
@Transactional
public class PhaseService  extends ServiceGenericImpl<Phase> implements IPhaseService{

}
