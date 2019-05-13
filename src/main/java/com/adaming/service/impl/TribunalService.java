package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entities.Tribunal;
import com.adaming.service.interfaces.ITribunalService;

@Service
@Transactional
public class TribunalService  extends ServiceGenericImpl<Tribunal> implements ITribunalService{

}
