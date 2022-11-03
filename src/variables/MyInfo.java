package variables;

public class MyInfo {

	// variable can be initialized and declared.
	// In line 7 variable "byte" type is declared as a type but since there has not
	// been a value assigned, the variable is not initialized.
	public float healthBattery;

	// starting from the line below, we will assign value to the variables according
	// to their range and compatibility.

	public String name = "Pamela Beesly";
	public byte myAge = 40;
	public short annualTax = 10650;
	public int annualIncome = 120000;
	public long bankBalance = 4006780l;
	public float height = 5.8f;
	public double cgpa = 3.50;
	public char sex = 'f';
	public boolean billingual = true;

	public static void main(String[] args) {

		MyInfo info = new MyInfo();
		System.out.println("My name is " + info.name + "\nMy current age marks " + info.myAge
				+ "\nMy taxt total in USD: " + info.annualTax + "\nMy income last years was in USD: "
				+ info.annualIncome + "\nMy current account balance in USD is: " + info.bankBalance + "\nMy height is: "
				+ info.height + "\nMy Cgpa is: " + info.cgpa + "\nMy sex: " + info.sex + "\nAm I billingual: "
				+ info.billingual);

	}

}
