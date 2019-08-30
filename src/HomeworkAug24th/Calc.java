package HomeworkAug24th;

import java.util.Scanner;

public class Calc {

	public static Scanner calculator;

	// --------------------------------------------------------------------

	public static void calc() {

		calculator = new Scanner(System.in);
		System.out.print("Enter first number: ");

		double first = calculator.nextDouble();

		System.out.print("Enter Second number: ");

		double second = calculator.nextDouble();

		System.out.println("Select methods: ");
		System.out.println("1 : +");
		System.out.println("2 : /");
		System.out.println("3 : *");
		System.out.println("4 : -");
		System.out.println("5 : %");

		int choice = calculator.nextInt();

		if (choice == 1) {
			System.out.println(first + second);
		} else if (choice == 2) {
			System.out.println(first / second);
		} else if (choice == 3) {
			System.out.println(first * second);
		} else if (choice == 4) {
			System.out.println(first + " - " + second + " = " + (first - second));
		} else if (choice == 5) {
			System.out.println(second + "% of " + first + " is: " + (first * second) / 100);
		} else {
			System.out.println("Invalid Selection. Please try again!");
		}
		question();
	}

	// -------------------------------------------------------------------

	public static void Converter() {
		subHeader("Select from the list below:\n");
		System.out.println("1:\t\"Area\"");
		System.out.println("2:\t\"Length\"");
		System.out.println("3:\t\"Temperature\"");
		System.out.println("4:\t\"Volume\"");
		System.out.println("5:\t\"Mass\"");
		System.out.println("6:\t\"Data\"");

		calculator = new Scanner(System.in);
		int conv = calculator.nextInt();

		switch (conv) {
		case 1:
			Area();
			break;
		case 2:
			Length();
			break;
		case 3:
			Temperature();
			break;
		case 4:
			Volume();
			break;
		case 5:
			Mass();
			break;
		case 6:
			Data();
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
		}
		Converter();
	}

	// ---------------------------------------------------------------------

	public static void Area() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"Acre - Are\"");
		System.out.println("2:\t\"Acre - Hectare\"");
		System.out.println("3:\t\"Acre - Square centimeter\"");
		System.out.println("4:\t\"Acre - Square foot\"");
		System.out.println("5:\t\"Acre - Square inch\"");
		System.out.println("6:\t\"Acre - Square meter\"");
		System.out.println("7:\t\"Are - Hectare\"");
		System.out.println("8:\t\"Are - Square centimeter\"");
		System.out.println("9:\t\"Are - Square foot\"");
		System.out.println("10:\t\"Are - Square inch\"");
		System.out.println("11:\t\"Are - Square meter\"");
		System.out.println("12:\t\"Hectare - Square centimeter\"");
		System.out.println("13:\t\"Hectare - Square foot\"");
		System.out.println("14:\t\"Hectare - Square inch\"");
		System.out.println("15:\t\"Hectare - Square meter\"");
		System.out.println("16:\t\"Square centimeter - Square foot\"");
		System.out.println("17:\t\"Square centimeter - Square inch\"");
		System.out.println("18:\t\"Square centimeter - Square meter\"");
		System.out.println("19:\t\"Square foot - Square inch\"");
		System.out.println("20:\t\"Square foot - Square meter\"");
		System.out.println("21:\t\"Square inch - Square meter\"");

		calculator = new Scanner(System.in);
		int select1 = calculator.nextInt();

		switch (select1) {
		case 1:
			acreTOare();
			break;
		case 2:
			acreTOhectare();
			break;
		case 3:
			acreTOSqcent();
			break;
		case 4:
			acreTOSqft();
			break;
		case 5:
			acreTOSqin();
			break;
		case 6:
			acreTOSqmtr();
			break;
		case 7:
			areTOhectare();
			break;
		case 8:
			areTOSqcent();
			break;
		case 9:
			areTOSqft();
			break;
		case 10:
			areTOSqin();
			break;
		case 11:
			areTOSqmtr();
			break;
		case 12:
			hecTOSqcent();
			break;
		case 13:
			hecTOSqft();
			break;
		case 14:
			hecTOSqin();
			break;
		case 15:
			hecTOSqmtr();
			break;
		case 16:
			sqcentTOSqft();
			break;
		case 17:
			sqcentTOSqin();
			break;
		case 18:
			sqcentTOSqmtr();
			break;
		case 19:
			sqftTOSqin();
			break;
		case 20:
			sqftTOSqmtr();
			break;
		case 21:
			sqinTOSqmtr();
			break;
		default:
			System.out.println("Invalid Selection. Pease try again !");
		}
		Area();
	}

	public static void acreTOare() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area1 = calculator.nextInt();

		area1 = (float) (area1 * 40.47);
		System.out.println("Area is Ares is = " + area1);
		unitask();
	}

	public static void acreTOhectare() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area2 = calculator.nextInt();

		area2 = (float) (area2 / 2.47);
		System.out.println("Area in Hectare is = " + area2);
		unitask();
	}

	public static void acreTOSqcent() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area3 = calculator.nextInt();

		area3 = (float) (area3 * 4.047e+7);
		System.out.println("Area in Square centimeter is = " + area3);
		unitask();
	}

	public static void acreTOSqft() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area4 = calculator.nextInt();

		area4 = (float) (area4 * 43560);
		System.out.println("Area in Square feet is = " + area4);
		unitask();
	}

	public static void acreTOSqin() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area5 = calculator.nextInt();

		area5 = (float) (area5 * 6.273e+6);
		System.out.println("Area in Square inch is = " + area5);
		unitask();
	}

	public static void acreTOSqmtr() {
		System.out.print("Enter Area in Acres: ");
		calculator = new Scanner(System.in);
		float area6 = calculator.nextInt();

		area6 = (float) (area6 * 4046.86);
		System.out.println("Area in Square meter is = " + area6);
		unitask();
	}

	public static void areTOhectare() {
		System.out.print("Enter Area in Ares: ");
		calculator = new Scanner(System.in);
		float area7 = calculator.nextInt();

		area7 = (float) (area7 / 100);
		System.out.println("Area in Hectare is = " + area7);
		unitask();
	}

	public static void areTOSqcent() {
		System.out.print("Enter Area in Ares: ");
		calculator = new Scanner(System.in);
		float area8 = calculator.nextInt();

		area8 = (float) (area8 * 1e+6);
		System.out.println("Area in Square centimeter is = " + area8);
		unitask();
	}

	public static void areTOSqft() {
		System.out.print("Enter Area in Ares: ");
		calculator = new Scanner(System.in);
		float area9 = calculator.nextInt();

		area9 = (float) (area9 * 1076.39);
		System.out.println("Area in Square feet is = " + area9);
		unitask();
	}

	public static void areTOSqin() {
		System.out.print("Enter Area in Ares: ");
		calculator = new Scanner(System.in);
		float area10 = calculator.nextInt();

		area10 = (float) (area10 * 155000);
		System.out.println("Area in Square inches is = " + area10);
		unitask();
	}

	public static void areTOSqmtr() {
		System.out.print("Enter Area in Ares: ");
		calculator = new Scanner(System.in);
		float area11 = calculator.nextInt();

		area11 = (float) (area11 * 100);
		System.out.println("Area in Square meters is = " + area11);
		unitask();
	}

	public static void hecTOSqcent() {
		System.out.print("Enter Area in Hectare: ");
		calculator = new Scanner(System.in);
		float area12 = calculator.nextInt();

		area12 = (float) (area12 * 1e+8);
		System.out.println("Area in Square centimeters is = " + area12);
		unitask();
	}

	public static void hecTOSqft() {
		System.out.print("Enter Area in Hectare: ");
		calculator = new Scanner(System.in);
		float area13 = calculator.nextInt();

		area13 = (float) (area13 * 107639);
		System.out.println("Area in Square feet is = " + area13);
		unitask();
	}

	public static void hecTOSqin() {
		System.out.print("Enter Area in Hectare: ");
		calculator = new Scanner(System.in);
		float area14 = calculator.nextInt();

		area14 = (float) (area14 * 155e+7);
		System.out.println("Area in Square inches is = " + area14);
		unitask();
	}

	public static void hecTOSqmtr() {
		System.out.print("Enter Area in Hectare: ");
		calculator = new Scanner(System.in);
		float area15 = calculator.nextInt();

		area15 = (float) (area15 * 10000);
		System.out.println("Area in Square meter is = " + area15);
		unitask();
	}

	public static void sqcentTOSqft() {
		System.out.print("Enter Area in Square centimeter: ");
		calculator = new Scanner(System.in);
		float area16 = calculator.nextInt();

		area16 = (float) (area16 / 929.03);
		System.out.println("Area in Square feet is = " + area16);
		unitask();
	}

	public static void sqcentTOSqin() {
		System.out.print("Enter Area in Square centimeter: ");
		calculator = new Scanner(System.in);
		float area17 = calculator.nextInt();

		area17 = (float) (area17 / 6.452);
		System.out.println("Area in Square inches is = " + area17);
		unitask();
	}

	public static void sqcentTOSqmtr() {
		System.out.print("Enter Area in Square centimeter: ");
		calculator = new Scanner(System.in);
		float area18 = calculator.nextInt();

		area18 = (float) (area18 / 10000);
		System.out.println("Area in Square meters is = " + area18);
		unitask();
	}

	public static void sqftTOSqin() {
		System.out.print("Enter Area in Square feet: ");
		calculator = new Scanner(System.in);
		float area19 = calculator.nextInt();

		area19 = (float) (area19 * 144);
		System.out.println("Area in Square inches is = " + area19);
		unitask();
	}

	public static void sqftTOSqmtr() {
		System.out.print("Enter Area in Square feet: ");
		calculator = new Scanner(System.in);
		float area20 = calculator.nextInt();

		area20 = (float) (area20 / 10.764);
		System.out.println("Area in Square meters is = " + area20);
		unitask();
	}

	public static void sqinTOSqmtr() {
		System.out.print("Enter Area in Square inches: ");
		calculator = new Scanner(System.in);
		float area21 = calculator.nextInt();

		area21 = (float) (area21 / 1550.003);
		System.out.println("Area in Square meters is = " + area21);
		unitask();
	}

	// -------------------------------------------------------------
	public static void Temperature() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"Fahrenheit - Celsius\"");
		System.out.println("2:\t\"Fahrenheit - Kelvin\"");
		System.out.println("3:\t\"Celsius - Kelvin\"");

		calculator = new Scanner(System.in);
		int selection = calculator.nextInt();

		switch (selection) {
		case 1:
			FtoC();
			break;
		case 2:
			FtoK();
			break;
		case 3:
			CtoK();
			break;
		default:
			System.out.println("Invalid Selection. Pease try again !");
		}
		Temperature();
	}

	public static void FtoC() {

		System.out.println("Enter Temperature in Fahrenheit ");
		calculator = new Scanner(System.in);
		float Temperature = calculator.nextInt();

		Temperature = ((Temperature - 32) * 5) / 9;
		System.out.println("Temperature in Celsius = " + Temperature);
		unitask();

	}

	public static void FtoK() {

		System.out.println("Enter Temperature in Fahrenheit ");
		calculator = new Scanner(System.in);
		float F = calculator.nextInt();

		float F1 = 273.5f + ((F - 32.0f) * (5.0f / 9.0f));

		System.out.println("Temperature in Kelvin = " + F1);
		unitask();

	}

	public static void CtoK() {

		System.out.println("Enter Temperature in Celsius ");
		calculator = new Scanner(System.in);
		float C = calculator.nextInt();

		float C1 = (float) (C + 273.15);

		System.out.println("Temperature in Kelvin = " + C1);
		unitask();

	}

//----------------------------------------------------------------------------

	public static void Length() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"Millimeter - Centimeter\"");
		System.out.println("2:\t\"Millimeter - Meter\"");
		System.out.println("3:\t\"Millimeter - Kilometer\"");
		System.out.println("4:\t\"Millimeter - Inch\"");
		System.out.println("5:\t\"Millimeter - Foot\"");
		System.out.println("6:\t\"Millimeter - Yard\"");
		System.out.println("7:\t\"Millimeter - Mile\"");
		System.out.println("8:\t\"Millimeter - Nautical mile\"");
		System.out.println("9:\t\"Millimeter - Mil\"");
		System.out.println("10:\t\"Centimeter - Meter\"");
		System.out.println("11:\t\"Centimeter - Kilometer\"");
		System.out.println("12:\t\"Centimeter - Inch\"");
		System.out.println("13:\t\"Centimeter - Foot\"");
		System.out.println("14:\t\"Centimeter - Yard\"");
		System.out.println("15:\t\"Centimeter - Mile\"");
		System.out.println("16:\t\"Centimeter - Nautical mile\"");
		System.out.println("17:\t\"Centimeter - Mil\"");
		System.out.println("18:\t\"Meter - Kilometer\"");
		System.out.println("19:\t\"Meter - Inch\"");
		System.out.println("20:\t\"Meter - Foot\"");
		System.out.println("21:\t\"Meter - Yard\"");
		System.out.println("22:\t\"Meter - Mile\"");
		System.out.println("23:\t\"Meter - Nautical mile\"");
		System.out.println("24:\t\"Meter - Mil\"");
		System.out.println("25:\t\"Kilometer - Inch\"");
		System.out.println("26:\t\"Kilometer - Foot\"");
		System.out.println("27:\t\"Kilometer - Yard\"");
		System.out.println("28:\t\"Kilometer - Mile\"");
		System.out.println("29:\t\"Kilometer - Nautical mile\"");
		System.out.println("30:\t\"Kilometer - Mil\"");
		System.out.println("31:\t\"Inch - Foot\"");
		System.out.println("32:\t\"Inch - Yard\"");
		System.out.println("33:\t\"Inch - Mile\"");
		System.out.println("34:\t\"Inch - Nautical mile\"");
		System.out.println("35:\t\"Inch - Mil\"");
		System.out.println("36:\t\"Foot - Yard\"");
		System.out.println("37:\t\"Foot - Mile\"");
		System.out.println("38:\t\"Foot - Nautical mile\"");
		System.out.println("39:\t\"Foot - Mil\"");
		System.out.println("40:\t\"Yard - Mile\"");
		System.out.println("41:\t\"Yard - Nautical mile\"");
		System.out.println("42:\t\"Yard - Mil\"");
		System.out.println("43:\t\"Mile - Nautical mile\"");
		System.out.println("44:\t\"Mile - Mil\"");
		System.out.println("45:\t\"Nautical mile - Mil\"");

	}

//---------------------------------------------------------------------------

	public static void Volume() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"UK gallon - US gallon\"");
		System.out.println("2:\t\"UK gallon - Liter\"");
		System.out.println("3:\t\"UK gallon - Milliliter\"");
		System.out.println("4:\t\"UK gallon - Cubic centimeter\"");
		System.out.println("5:\t\"UK gallon - Cubic meter\"");
		System.out.println("6:\t\"UK gallon - Cubic inch\"");
		System.out.println("7:\t\"UK gallon - Cubic foot\"");
		System.out.println("8:\t\"US gallon - Liter\"");
		System.out.println("9:\t\"US gallon - Milliliter\"");
		System.out.println("10:\t\"US gallon - Cubic centimeter\"");
		System.out.println("11:\t\"US gallon - Cubic meter\"");
		System.out.println("12:\t\"US gallon - Cubic inch\"");
		System.out.println("13:\t\"US gallon - Cubic foot\"");
		System.out.println("14:\t\"Liter - Milliliter\"");
		System.out.println("15:\t\"Liter - Cubic centimeter\"");
		System.out.println("16:\t\"Liter - Cubic meter\"");
		System.out.println("17:\t\"Liter - Cubic inch\"");
		System.out.println("18:\t\"Liter - Cubic foot\"");
		System.out.println("19:\t\"Milliliter - Cubic centimeter\"");
		System.out.println("20:\t\"Milliliter - Cubic meter\"");
		System.out.println("21:\t\"Milliliter - Cubic inch\"");
		System.out.println("22:\t\"Milliliter - Cubic foot\"");
		System.out.println("23:\t\"Cubic centimeter - Cubic meter\"");
		System.out.println("24:\t\"Cubic centimeter - Cubic inch\"");
		System.out.println("25:\t\"Cubic centimeter - Cubic foot\"");
		System.out.println("26:\t\"Cubic meter - Cubic inch\"");
		System.out.println("27:\t\"Cubic meter - Cubic foot\"");
		System.out.println("28:\t\"Cubic inch - Cubic foot\"");

	}

//------------------------------------------------------------------------

	public static void Mass() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"Ton - UK ton\"");
		System.out.println("2:\t\"Ton - US ton\"");
		System.out.println("3:\t\"Ton - Pound\"");
		System.out.println("4:\t\"Ton - Ounce\"");
		System.out.println("5:\t\"Ton - Kilogram\"");
		System.out.println("6:\t\"Ton - Gram\"");
		System.out.println("7:\t\"UK ton - US ton\"");
		System.out.println("8:\t\"UK ton - Pound\"");
		System.out.println("9:\t\"UK ton - Ounce\"");
		System.out.println("10:\t\"UK ton - Kilogram\"");
		System.out.println("11:\t\"UK ton - Gram\"");
		System.out.println("12:\t\"US ton - Pound\"");
		System.out.println("13:\t\"US ton - Ounce\"");
		System.out.println("14:\t\"US ton - Kilogram\"");
		System.out.println("15:\t\"US ton - Gram\"");
		System.out.println("16:\t\"Pound - Ounce\"");
		System.out.println("17:\t\"Pound - Kilogram\"");
		System.out.println("18:\t\"Pound - Gram\"");
		System.out.println("19:\t\"Ounce - Kilogram\"");
		System.out.println("20:\t\"Ounce - Gram\"");
		System.out.println("21:\t\"Kilogram - Gram\"");

	}

//------------------------------------------------------------

	public static void Data() {
		subHeader("Please Select from the list below:");
		System.out.println("1:\t\"Bit - Byte\"");
		System.out.println("2:\t\"Bit - Kilobyte\"");
		System.out.println("3:\t\"Bit - Megabyte\"");
		System.out.println("4:\t\"Bit - Gigabyte\"");
		System.out.println("5:\t\"Bit - Terabyte\"");
		System.out.println("6:\t\"Byte - Kilobyte\"");
		System.out.println("7:\t\"Byte - Megabyte\"");
		System.out.println("8:\t\"Byte - Gigabyte\"");
		System.out.println("9:\t\"Byte - Terabyte\"");
		System.out.println("10:\t\"Kilobyte - Megabyte\"");
		System.out.println("11:\t\"Kilobyte - Gigabyte\"");
		System.out.println("12:\t\"Kilobyte - Terabyte\"");
		System.out.println("13:\t\"Megabyte - Gigabyte\"");
		System.out.println("14:\t\"Megabyte - Terabyte\"");
		System.out.println("15:\t\"Gigabyte - Terabyte\"");

		calculator = new Scanner(System.in);
		int select6 = calculator.nextInt();

		switch (select6) {
		case 1:
			bitTObyte();
			break;
		case 2:
			bitTOKB();
			break;
		case 3:
			bitTOMB();
			break;
		case 4:
			bitTOGB();
			break;
		case 5:
			bitTOTB();
			break;
		case 6:
			byteTOKB();
			break;
		case 7:
			byteTOMB();
			break;
		case 8:
			byteTOGB();
			break;
		case 9:
			byteTOTB();
			break;
		case 10:
			KBTOMB();
			break;
		case 11:
			KBTOGB();
			break;
		case 12:
			KBTOTB();
			break;
		case 13:
			MBTOGB();
			break;
		case 14:
			MBTOTB();
			break;
		case 15:
			GBTOTB();
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
		}
		Data();
	}

	public static void bitTObyte() {
		System.out.print("Enter Data in Bit: ");
		calculator = new Scanner(System.in);
		float data1 = calculator.nextInt();

		data1 = (float) (data1 / 8);
		System.out.println("Data in Byte is = " + data1);
		unitask();
	}

	public static void bitTOKB() {
		System.out.print("Enter Data in Bit: ");
		calculator = new Scanner(System.in);
		float data2 = calculator.nextInt();

		data2 = (float) (data2 / 8000);
		System.out.println("Data in Kilobyte is = " + data2);
		unitask();
	}

	public static void bitTOMB() {
		System.out.print("Enter Data in Bit: ");
		calculator = new Scanner(System.in);
		float data3 = calculator.nextInt();

		data3 = (float) (data3 / 8e+6);
		System.out.println("Data in Megabyte is = " + data3);
		unitask();
	}

	public static void bitTOGB() {
		System.out.print("Enter Data in Bit: ");
		calculator = new Scanner(System.in);
		float data4 = calculator.nextInt();

		data4 = (float) (data4 / 8e+9);
		System.out.println("Data in Gigabyte is = " + data4);
		unitask();
	}

	public static void bitTOTB() {
		System.out.print("Enter Data in Bit: ");
		calculator = new Scanner(System.in);
		float data5 = calculator.nextInt();

		data5 = (float) (data5 / 8e+12);
		System.out.println("Data in Terabyte is = " + data5);
		unitask();
	}

	public static void byteTOKB() {
		System.out.print("Enter Data in Byte: ");
		calculator = new Scanner(System.in);
		float data6 = calculator.nextInt();

		data6 = (float) (data6 / 1000);
		System.out.println("Data in Kilobyte is = " + data6);
		unitask();
	}

	public static void byteTOMB() {
		System.out.print("Enter Data in Byte: ");
		calculator = new Scanner(System.in);
		float data7 = calculator.nextInt();

		data7 = (float) (data7 / 1e+6);
		System.out.println("Data in Megabyte is = " + data7);
		unitask();
	}

	public static void byteTOGB() {
		System.out.print("Enter Data in Byte: ");
		calculator = new Scanner(System.in);
		float data8 = calculator.nextInt();

		data8 = (float) (data8 / 1e+9);
		System.out.println("Data in Gigabyte is = " + data8);
		unitask();
	}

	public static void byteTOTB() {
		System.out.print("Enter Data in Byte: ");
		calculator = new Scanner(System.in);
		float data9 = calculator.nextInt();

		data9 = (float) (data9 / 1e+12);
		System.out.println("Data in Terabyte is = " + data9);
		unitask();
	}

	public static void KBTOMB() {
		System.out.print("Enter Data in Kilobyte: ");
		calculator = new Scanner(System.in);
		float data10 = calculator.nextInt();

		data10 = (float) (data10 / 1000);
		System.out.println("Data in Megabyte is = " + data10);
		unitask();
	}

	public static void KBTOGB() {
		System.out.print("Enter Data in Kilobyte: ");
		calculator = new Scanner(System.in);
		float data11 = calculator.nextInt();

		data11 = (float) (data11 / 1e+6);
		System.out.println("Data in Gigabyte is = " + data11);
		unitask();
	}

	public static void KBTOTB() {
		System.out.print("Enter Data in Kilobyte: ");
		calculator = new Scanner(System.in);
		float data12 = calculator.nextInt();

		data12 = (float) (data12 / 1e+9);
		System.out.println("Data in Terabyte is = " + data12);
		unitask();
	}

	public static void MBTOGB() {
		System.out.print("Enter Data in Megabyte: ");
		calculator = new Scanner(System.in);
		float data13 = calculator.nextInt();

		data13 = (float) (data13 / 1000);
		System.out.println("Data in Gigabyte is = " + data13);
		unitask();
	}

	public static void MBTOTB() {
		System.out.print("Enter Data in Megabyte: ");
		calculator = new Scanner(System.in);
		float data14 = calculator.nextInt();

		data14 = (float) (data14 / 1e+6);
		System.out.println("Data in Terabyte is = " + data14);
		unitask();
	}

	public static void GBTOTB() {
		System.out.print("Enter Data in Gigabyte: ");
		calculator = new Scanner(System.in);
		float data15 = calculator.nextInt();

		data15 = (float) (data15 / 1000);
		System.out.println("Data in Terabyte is = " + data15);
		unitask();
	}

//----------------------------------------------------------

	public static void unitask() {

		System.out.println("\n");
		System.out.println("Do you want to continue with Unit Conversion?");
		System.out.println("Press 1 for \"YES\"");
		System.out.println("Press 2 for \"NO\"");

		calculator = new Scanner(System.in);
		int tempask = calculator.nextInt();

		switch (tempask) {

		case 1:
			Converter();
			break;
		case 2:
			rtnmenu1();
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
			unitask();

		}

	}

//------------------------------------------------------------------------

	public static void MainHeader(String name) {

		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n");
	}

	// -----------------------------------------------------------------------------------

	public static void question() {

		System.out.println("\n");
		System.out.println("Do you want to continue with Basic Calculations?");
		System.out.println("Press 1 for \"YES\"");
		System.out.println("Press 2 for \"NO\"");

		calculator = new Scanner(System.in);
		int ask = calculator.nextInt();

		switch (ask) {

		case 1:
			calc();
			break;
		case 2:
			rtnmenu();
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
			question();
		}

	}

	// -----------------------------------------------------------------------

	public static void subHeader(String name) {

		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			System.out.print("-");
		}
		System.out.println("\n");
	}

//-------------------------------------------------------------------------------

	public static void MainMenu() {
		System.out.println("Press 1 for \"Basic Calculator\"");
		System.out.println("Press 2 for \"Unit Converter\"");
		System.out.println("Press 3 to \"Exit\"");
		calculator = new Scanner(System.in);
		int menu = calculator.nextInt();

		switch (menu) {
		case 1:
			calc();
			break;
		case 2:
			Converter();
			break;
		case 3:
			System.out.println("<<<<< Good Bye >>>>>");
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
			break;
		}
	}

//------------------------------------------------------------------------------------

	public static void rtnmenu() {
		System.out.println("Press 1 for \"Unit Converter\"");
		System.out.println("Press 2 to \"Exit\"");
		calculator = new Scanner(System.in);
		int menu1 = calculator.nextInt();

		switch (menu1) {
		case 1:
			Converter();
			break;
		case 2:
			System.out.println("<<<<< Good Bye >>>>>");
			break;
		default:
			System.out.println("Invalid Selection. Please try again !\n");
			rtnmenu();
		}
	}

//---------------------------------------------------------------

	public static void rtnmenu1() {
		System.out.println("Press 1 for \"Basic Converter\"");
		System.out.println("Press 2 to \"Exit\"");
		calculator = new Scanner(System.in);
		int rtnmenu1 = calculator.nextInt();

		switch (rtnmenu1) {
		case 1:
			calc();
			break;
		case 2:
			System.out.println("<<<<< Good Bye >>>>>");
			break;
		default:
			System.out.println("Invalid Selection. Please try again !");
			rtnmenu1();

		}

	}

	public static void main(String[] args) {

		MainHeader("CALCULATOR");
		subHeader("Main Menu:");
		MainMenu();

	}

}
