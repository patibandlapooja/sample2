package samplegradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampletest {

	public float sampleIntrest (float pr,float rate,float time)
	{
		return pr*time*rate/100;
	}
	public static void main(String[] args)
	{
		sampletest s=new sampletest ();
		System.out.println(s.sampleIntrest(4000, 4,3));
		
	}

}
