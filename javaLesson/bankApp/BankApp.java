public class BankApp{
	public static void main(String[] args){
		Account ac=new Account("4649",1592);
		System.out.println(ac);
		Account ac1=new Account("4649",2000);
		System.out.println(ac1);
		if(ac.equals(ac1)){
			System.out.println("二つの口座は同じです");
		}
	}
}

class Account{
	private String accountNumber;
	private int balance;
	public Account (String accountNumber,int balance){
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
	}
	private void setAccountNumber(String accountNumber){
		accountNumber=accountNumber.trim();
		accountNumber=accountNumber.replaceAll("　","");
		this.accountNumber=accountNumber.trim();
		//新しい文字列を作って、trimしたものを代入してる
	}

	public String getAccountNumber(){
		return this.accountNumber;
	}
	public void setBalance(int balance){
		if(balance<0){
			throw new IllegalArgumentException("引数が不正です");
		}
		this.balance=balance;
	}
	public int getBalance(){
		return this.balance;
	}

	@Override
	public String toString(){
		return String.format("￥%d(口座番号=%s)",this.balance,this.accountNumber);
	}

	@Override
	public boolean equals(Object o){
		if(this==o){return true;}
		if(o instanceof Account){
			Account a=(Account)o;
			if(this.accountNumber.equals(a.accountNumber.trim())){
				return true;
			}
		}
		return false;
	}
}
