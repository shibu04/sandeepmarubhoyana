package com.iiht.training.ngo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.ngo.dto.DonarDto;
import com.iiht.training.ngo.dto.DonationDto;
import com.iiht.training.ngo.service.DonarService;
import com.iiht.training.ngo.service.DonationService;

@RestController
public class DonarController {

	@Autowired
	private DonarService donarService;

	@Autowired
	private DonationService donationService;

	@PostMapping("/donars/register-donar")
	public ResponseEntity<?> registerDonar(@Valid @RequestBody DonarDto donarDto, BindingResult result) {
		return null;
	}

	@PutMapping("/donars/update-donar")
	public ResponseEntity<?> updateDonar(@Valid @RequestBody DonarDto donarDto, BindingResult result) {
		return null;
	}

	@DeleteMapping("/donars/delete/{donarId}")
	public ResponseEntity<?> deleteDonarById(@PathVariable Long donarId) {
		return null;
	}

	@GetMapping("/donars/get/{donarId}")
	public ResponseEntity<?> getDonarById(@PathVariable Long donarId) {
		return null;
	}

	@GetMapping("/donars/all")
	public ResponseEntity<?> getAllDonars() {
		return null;
	}

	@GetMapping("/donars/get-by-ngo/{ngoId}")
	public ResponseEntity<?> getDonarByNgoId(@PathVariable Long ngoId) {
		return null;
	}

	@PostMapping("/donations/add-donation")
	public ResponseEntity<?> addDonation(@Valid @RequestBody DonationDto donationDto, BindingResult result) {
		return null;

	}

	@PutMapping("/donations/update-donation")
	public ResponseEntity<?> updateDonation(@Valid @RequestBody DonationDto donationDto, BindingResult result) {
		return null;

	}

	@DeleteMapping("/donations/delete/{donationId}")
	public ResponseEntity<?> removeDonation(@PathVariable Long donationId) {
		return null;

	}

	@GetMapping("/donations/get/{donationId}")
	public ResponseEntity<?> getDonationById(@PathVariable Long donationId) {
		return null;

	}

	@GetMapping("/donations/all")
	public ResponseEntity<?> getAllDonations() {
		return null;

	}

	@GetMapping("/donations/get-by-donar/{donarId}")
	public ResponseEntity<?> getDonationsByDonorId(@PathVariable Long donarId) {
		return null;

	}

	@GetMapping("/donations/get-by-ngo/{ngoId}")
	public ResponseEntity<?> getDonationsByNgoId(@PathVariable Long ngoId) {
		return null;

	}

}
