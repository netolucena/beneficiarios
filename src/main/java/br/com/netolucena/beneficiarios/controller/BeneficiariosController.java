package br.com.netolucena.beneficiarios.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.beneficiarios.service.BeneficiarioService;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiariosController {
	
	@Autowired
	BeneficiarioService service;
	
	@GetMapping
    public ResponseEntity<List<BeneficiarioDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
	
	@GetMapping("/{id}")
    public  ResponseEntity<BeneficiarioDTO> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.findById(id));
    }
	
	 @PostMapping
	 public ResponseEntity<BeneficiarioDTO> save(@RequestBody BeneficiarioDTO beneficiarioDTO){
		 return ResponseEntity.ok(service.save(beneficiarioDTO));
	 }
	 
	 @PutMapping("/{id}")
	 public ResponseEntity<BeneficiarioDTO> update(@PathVariable("id") Long id, @RequestBody BeneficiarioDTO beneficiarioDTO) throws Exception {
		 return ResponseEntity.ok(service.update(id, beneficiarioDTO));
	 }

	 @PutMapping("/aportar/{id}")
	 public ResponseEntity<BeneficiarioDTO> aportar(@PathVariable("id") Long id, @RequestBody BigDecimal valor) throws Exception {
		 return ResponseEntity.ok(service.aportar(id, valor));
	 }
	 
}
