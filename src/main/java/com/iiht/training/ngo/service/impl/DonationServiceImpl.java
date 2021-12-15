package com.iiht.training.ngo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.ngo.dto.DonationDto;
import com.iiht.training.ngo.repository.DonationRepository;
import com.iiht.training.ngo.service.DonationService;

@Service
public class DonationServiceImpl implements DonationService {

	@Autowired
	private DonationRepository donationRepository;

	@Override
	public DonationDto registerDonation(DonationDto donationDto) {
		return null;
	}

	@Override
	public DonationDto updateDonation(DonationDto donationDto) {
		return null;
	}

	@Override
	public Boolean deleteDonation(Long donationId) {
		return false;
	}

	@Override
	public DonationDto getDonationById(Long donationId) {
		return null;
	}

	@Override
	public List<DonationDto> getAllDonations() {
		return null;
	}

	@Override
	public List<DonationDto> getDonationsByDonorId(Long donarId) {
		return null;
	}

	@Override
	public List<DonationDto> getDonationsByNgoId(Long ngoId) {
		return null;
	}

}
