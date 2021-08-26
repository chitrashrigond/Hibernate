package com.xworkz.soap.dao;

import java.util.List;

import com.xworkz.hybernet.soap.dto.SoapDTO;

public interface SoapDAO {
int save(SoapDTO dto);
//List<SoapDTO> read(SoapDTO dto);
void delete(SoapDTO dto);
}
 