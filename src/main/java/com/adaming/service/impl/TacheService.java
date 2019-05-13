package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entities.Tache;
import com.adaming.service.interfaces.ITacheService;

@Service
@Transactional
public class TacheService  extends ServiceGenericImpl<Tache> implements ITacheService{

}
