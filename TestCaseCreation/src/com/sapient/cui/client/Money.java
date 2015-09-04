package com.sapient.cui.client;

import org.hamcrest.core.IsNull;


public class Money {
private int fAmount;
private String fCurrency;

public Money(int amount , String currency) {
	if(fAmount<0)
		{
		fAmount = 0;
		}
	fAmount=amount;
	fCurrency=currency;
	
}

public int amount() {
	return fAmount;
	}

public String currency() {
	return fCurrency;
}
public Money add(Money m)throws NullPointerException {

	return new Money(amount()+m.amount(),currency());
	
}

}
