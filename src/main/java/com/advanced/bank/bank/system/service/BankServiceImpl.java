package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.Bank;
import com.advanced.bank.bank.system.repository.AddressRepository;
import com.advanced.bank.bank.system.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository, AddressRepository addressRepository) {
        this.bankRepository = bankRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void createBank(Bank bank) {
        validateBank(bank);

        if (null == bank.getAddress().getId())
            addressRepository.save(bank.getAddress());
        bankRepository.save(bank);
    }

    @Override
    public void updateBank(Bank bank) {

    }

    @Override
    public List<Bank> getAllBanks() {
        return null;
    }

    @Override
    public Bank getBankById(Long bankId) {
        return null;
    }

    @Override
    public void deleteBankById(Long bankId) {

    }

    private void validateBank(Bank bank) {
        if (null == bank.getAddress()) {
            throw new IllegalArgumentException("Invalid address");
        }
    }
}
