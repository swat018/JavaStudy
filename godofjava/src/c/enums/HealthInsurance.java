package c.enums;

public enum HealthInsurance {
	LEVEL_ONE(1, 1.0),
	LEVEL_TWO(2, 2.0),
	LEVEL_THREE(3, 3.2),
	LEVEL_FOUR(4, 4.5),
	LEVEL_FIVE(5, 5.6),
	LEVEL_SIX(6, 7.1);
	private final int maxSalary;
	private final double radio;
	
	HealthInsurance(int maxSalary, double radio) {
		this.maxSalary = maxSalary;
		this.radio = radio;
	}
	public double getradio( ) {
		return radio;
	}
	public static HealthInsurance getHealthInsurance(int salary) {
		if(salary<1000) {
			return LEVEL_ONE;
		} else if(salary<2000) {
			return LEVEL_TWO;
		} else if(salary<3000) {
			return LEVEL_THREE;
		} else if(salary<4000) {
			return LEVEL_FOUR;
		} else if(salary<5000) {
			return LEVEL_FIVE;
		} else {
			return LEVEL_SIX;
		}
	}
	public static void main(String []args) {
		int sararyArray[] = new int[] {1500,5500,8000};
		HealthInsurance[] insurances = new HealthInsurance[3];
		insurances[0] = HealthInsurance.getHealthInsurance(sararyArray[0]);
		insurances[1] = HealthInsurance.getHealthInsurance(sararyArray[1]);
		insurances[2] = HealthInsurance.getHealthInsurance(sararyArray[2]);
		
		for(int loop=0;loop<3;loop++) {
			System.out.println(sararyArray[loop]+"="+insurances[loop]+","+insurances[loop].getradio());
		}
	}
}
