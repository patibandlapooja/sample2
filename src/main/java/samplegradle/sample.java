package samplegradle;

public class sample {
public float sampleInterest(float p,float r,float t) {
	return(p*t*r/100);
	
}
	public static void main(String[] args) {
		sample s1 = new sample();
		System.out.println(s1.sampleInterest(4000,4,3));
	

	}

}
