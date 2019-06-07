class AbsencesException extends Exception {
}

class AccountsNBS {
	public float tax(int salary, int absences) throws AbsencesException {
		if (absences >= 7) {
			AbsencesException e = new AbsencesException();
			throw e;
		}

		return salary * 21 / 100;
	}
}

class AccountsHR {
	public static void main(String args[]) {
		AccountsNBS accounts = new AccountsNBS();

		try {
			float netSalary = 2000 - accounts.tax(2000, 9);
			System.out.println("Net Salary: " + netSalary);
		} catch (AbsencesException e) {
			System.out.println("Error - too many absences");
		}
	}
}