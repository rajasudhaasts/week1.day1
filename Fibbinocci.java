package week1.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int secNum = 1; 
		int sum;
		int n = 10;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1; i<=n; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}
		}

	}


