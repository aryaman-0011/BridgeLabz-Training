package com.functionalinterface.customfunctionalinterface.loaneligibility;

@FunctionalInterface
public interface EligibleLoan {

	boolean loanEligibility(double income, int creditScore);
}
