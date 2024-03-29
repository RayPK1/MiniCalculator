package model;

public class MiniCalculatorModel {
	private double firstValue;
	private double secondValue;
	private double answer;

	public double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public MiniCalculatorModel() {
	}

	public void sum() {
		this.answer = this.firstValue + this.secondValue;
	}

	public void sub() {
		this.answer = this.firstValue - this.secondValue;
	}

	public void divide() {
		this.answer = this.firstValue / this.secondValue;
	}

	public void multi() {
		this.answer = this.firstValue * this.secondValue;
	}

	public void power() {
		this.answer = Math.pow(this.firstValue, this.secondValue);
	}

	public void mod() {
		this.answer = this.firstValue % this.secondValue;
	}
}
