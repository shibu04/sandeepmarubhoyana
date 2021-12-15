package com.iiht.training.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.ngo.dto.DonationRequestDto;
import com.iiht.training.ngo.dto.NgoDto;
import com.iiht.training.ngo.exceptions.InvalidDataException;
import com.iiht.training.ngo.service.DonationRequestService;
import com.iiht.training.ngo.service.NgoService;

@RestController
@RequestMapping("/ngos")
public class NgoController {

	@Autowired
	private NgoService ngoService;

	@Autowired
	private DonationRequestService donationRequestService;

	

	@PostMapping("/register-ngo")
	public ResponseEntity<?> registerNgo(NgoDto ngoDto, BindingResult result) {
		if (!result.hasErrors()) {
			throw new InvalidDataException("The Data is not valid");
		}
		ngoService.registerNgo(ngoDto);
		return ResponseEntity.ok(ngoDto);
	}

	@PutMapping("/update-ngo")
	public ResponseEntity<?> updateNgo(NgoDto ngoDto, BindingResult result) {
		if (result.hasErrors()) {
			throw new InvalidDataException("The Data is not valid");
		}
		ngoService.updateNgo(ngoDto);
		return ResponseEntity.ok(ngoDto);
	}

	@DeleteMapping("/delete/{ngoId}")
	public ResponseEntity<?> deleteNgoById(@RequestParam Long ngoId) {
		ngoService.deleteNgo(ngoId);
		return ResponseEntity.ok(true);
	}

	@GetMapping("/get/{ngoId}")
	public ResponseEntity<?> getNgoById(@RequestParam Long ngoId) {
		NgoDto ngoById = ngoService.getNgoById(ngoId);
		return ResponseEntity.ok(ngoById);
	}

	@PostMapping("/all")
	public ResponseEntity<?> getAllRegesteredNgos() {
		List<NgoDto> allNgos = ngoService.getAllNgos();
		return ResponseEntity.ok(allNgos);
	}

	@PostMapping("/create-donation-request")
	public ResponseEntity<?> createDonationRequest( DonationRequestDto donationRequestDto,
			BindingResult result) {
		if (result.hasErrors()) {
			throw new InvalidDataException("Donation Request is not Valid");
		}
		donationRequestService.createDonationRequest(donationRequestDto);
		return ResponseEntity.ok(donationRequestDto);
	}

	@PostMapping("/donation-request-by-ngo/{ngoId}")
	public ResponseEntity<?> getDonationRequestNotificationsByNgoId(@RequestParam Long ngoId) {

		List<DonationRequestDto> donationRequestNotification = donationRequestService
				.getDonationRequestNotification(ngoId);
		return ResponseEntity.ok(donationRequestNotification);

	}

	@GetMapping("/donation-request-by-donar/{donarId}")
	public ResponseEntity<?> getDonationRequestByDonarId(@PathVariable Long donarId) {

		List<DonationRequestDto> donationRequestByDonarId = donationRequestService
				.getDonationRequestByDonarId(donarId);
		return ResponseEntity.ok(donationRequestByDonarId);
	}

}
