package com.iiht.training.ngo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.ngo.dto.DonarDto;
import com.iiht.training.ngo.repository.DonarRepository;
import com.iiht.training.ngo.service.DonarService;

@Service(value = "donarService")
public class DonarServiceImpl implements DonarService {

	@Autowired
	private DonarRepository donarRepository;

	@Override
	public DonarDto registerDonar(DonarDto donarDto) {
		return null;
	}

	@Override
	public DonarDto updateDonar(DonarDto donarDto) {
		return null;
	}

	@Override
	public Boolean deleteDonar(Long donarid) {
		return false;
	}

	@Override
	public DonarDto getDonarById(Long donarId) {
		return null;
	}

	@Override
	public List<DonarDto> getAllDonars() {
		return null;
	}

	@Override
	public List<DonarDto> getDonarsRegisteredWithNgo(Long ngoId) {
		return null;
	}

}
