package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.contract.Contract;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contracts")
public class ContractController {
    @PostMapping
    public void createContract(@RequestBody Contract contract) {

    }


    @PostMapping
    public void updateContract(@RequestBody Contract contract) {

    }

    @GetMapping
    public List<Contract> getAllContract() {
        return null;
    }

    @GetMapping("/{contractId")
    public Contract getContract(@PathVariable Long contractId) {
        return  null;
    }

    @DeleteMapping("/{contractId}")

    public void deleteContract(@PathVariable Long contractId) {

    }
}