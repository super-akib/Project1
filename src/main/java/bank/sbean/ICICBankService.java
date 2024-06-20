package bank.sbean;

import org.springframework.stereotype.Component;

@Component("icic")
public class ICICBankService  implements BankServices
{ 
	

	private String bankName;
	private String bankAddress;
	private String  ifscCode;
	
    //no-args constructor
	public ICICBankService()
	{
		
	}
	
	
    //Parameterized  constructor
	public ICICBankService(String bankName, String bankAddress, String ifscCode) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.ifscCode = ifscCode;
	}



	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	@Override
	public void deposit(long amount) {
		
		
	}

	@Override
	public void withdraw(long amount) {
		
	}

}
