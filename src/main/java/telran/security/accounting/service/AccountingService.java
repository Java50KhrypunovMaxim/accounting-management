package telran.security.accounting.service;

import telran.security.accounting.dto.AccountDto;
import telran.security.accounting.exceptions.AccountNotFoundException;

public interface AccountingService {
	AccountDto addAccount(AccountDto accountDto);

	AccountDto removeAccount(String email);

	void updatePassword(String email, String newPassword) throws AccountNotFoundException, IllegalArgumentException;
}
