package org.generation.java.controlflowloop;

//Practice 3

public class Loops {

	public static void main(String[] args) {
		//Ex1
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
	// Ex2
		String name = "Marcel";
		int counter = 0;
		while(counter < 15) {
			System.out.println(name);
			counter+= 1 ;
		}
	//Ex3
		name = "Tom";
		int counter2= 0;

		do {
			System.out.println(name);
			counter2++;
		}
		while (counter2 < 10);
	//Ex4
		name ="Peter";
		for (int counter3 = 0; counter3 < 10; counter3++) {
			System.out.println(name);
		}

	//Ex5
		for(int j= 0 ; j < 10; j++){
			if(j==7 || j == 8){
				continue;
			}
			System.out.println(j);
		}
	}
}

