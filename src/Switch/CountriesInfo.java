package Switch;

import java.util.Scanner;

public class CountriesInfo {

	public static void main(String[] args) {
		
		
		Scanner info = new Scanner(System.in);
		
		
		
		System.out.println("Please Select from the Countries list below:");
		System.out.println("Press 1 for <<Pakistan>>");
		System.out.println("Press 2 for <<Australia>> ");
		System.out.println("Press 3 for <<China>>");
		System.out.println("Press 4 for <<India>>");
		System.out.println("Press 5 for <<United States>>");
		System.out.println("Press 6 for <<Englnd>>");
		
		int Country = info.nextInt();
		
		switch (Country) {
		
		case 1:
			System.out.println("Press 1 for <Lahore>");
			System.out.println("Press 2 for <Karachi>");
			System.out.println("Press 3 for <Islamabad>");
			
			int CityPak = info.nextInt();
			
			switch (CityPak) {
			
			case 1:
				System.out.println("Lahore is the 2nd largest city of Pakistan. It is historic cultural centre of the Punjab region and one of Pakistan's most socially liberal, progressive and cosmopolitan cities.");
				break;
			case 2:
				System.out.println("Karachi is the largest city of Pakistan and fifth-most-populous city in the world. The city is Pakistan's premier industrial and financial centre.");
				break;
			case 3:
				System.out.println("Islamabad is the capital city of Pakistan. It is noted for its high standards of living, safety and abundant greenery");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		 case 2:
			System.out.println("Press 1 for <Sydney>");
			System.out.println("Press 2 for <Perth>");
			System.out.println("Press 3 for <Canberra>");
			
			int CityAus = info.nextInt();
			
			switch (CityAus) {
			
			case 1:
				System.out.println("Sydney is Australia's oldest and largest city with a population of around 4 million.");
				break;
			case 2:
				System.out.println("Perth is the fourth-most populous city in Australia, with a population of 2.06 million.");
				break;
			case 3:
				System.out.println("Canberra is the capital of Australia.");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		case 3:
			System.out.println("Press 1 for <Shanghai>");
			System.out.println("Press 2 for <Beijing>");
			System.out.println("Press 3 for <Tianjin>");
			
			int CityChina = info.nextInt();
			
			switch (CityChina) {
			
			case 1:
				System.out.println("Shanghai is one of the four municipalities under the direct administration of the central government of the People's Republic of China.");
				break;
			case 2:
				System.out.println("Beijing is the capital of the People's Republic of China, the world's third most populous city proper, and most populous capital city.");
				break;
			case 3:
				System.out.println("Tianjin is the largest coastal city in northern China.");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		case 4:
			System.out.println("Press 1 for <Mumbai>");
			System.out.println("Press 2 for <Kolkta>");
			System.out.println("Press 3 for <Delhi>");
			
			int CityInd = info.nextInt();
			
			switch (CityInd) {
			
			case 1:
				System.out.println("Mumbai  is the capital city of the Indian state of Maharashtra. As of 2011 it is the most populous city in India with an estimated population of 12.4 million.");
				break;
			case 2:
				System.out.println("Kolkata is widely regarded as the cultural capital of India. According to the 2011 Indian census, it is the seventh most populous city with a population of 4.5 million.");
				break;
			case 3:
				System.out.println("Delhi is the capital city if India. According to the 2011 census, Delhi's population was over 11 million, the second-highest in India.");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		case 5:
			System.out.println("Press 1 for <New York City>");
			System.out.println("Press 2 for <Los Angeles>");
			System.out.println("Press 3 for <Washington DC>");
			
			int CityUSA = info.nextInt();
			
			switch (CityUSA) {
			
			case 1:
				System.out.println("New York City is the most populous city in the United States. With an estimated 2018 population of 8,398,748.");
				break;
			case 2:
				System.out.println("Los Angeles is the second most populous city in the United States. The city is known for its Mediterranean climate, ethnic diversity, Hollywood, the entertainment industry.");
				break;
			case 3:
				System.out.println("Washington DC is the capital of the United States. The city, located on the Potomac River bordering Maryland and Virginia, is one of the most visited cities in the world, with more than 20 million tourists annually.");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		case 6:
			System.out.println("Press 1 for <Birmingham>");
			System.out.println("Press 2 for <Manchester>");
			System.out.println("Press 3 for <London>");
			
			int CityEng = info.nextInt();
			
			switch (CityEng) {
			
			case 1:
				System.out.println("Birmingham is the second-most populous city in the United Kingdom. Birmingham grew in the 18th-century Midlands Enlightenment and subsequent Industrial Revolution, which saw advances in science, technology and economic development.");
				break;
			case 2:
				System.out.println("Manchester is the 5th most populated city of England with a population of 545,500 as of 2017.");
				break;
			case 3:
				System.out.println("London is the capital city of England. London is considered to be one of the world's most important global cities and has been termed the world's most powerful, most desirable, most influential, most visited, most expensive, most investment friendly, most popular for work and the most vegetarian-friendly city in the world.");
				break;
				
			default:
				System.out.println("Invalid selection.");
			}
			
			break;
			
		default:
			System.out.println("Invalid selection.");
		
		}
		
		info.close();

	}

}
