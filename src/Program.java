import enums.*;
import exceptions.TuromshaException;
import exceptions.MatveevException;
import exceptions.BeliayevaException;
import exceptions.PlyosovException;
import exceptions.BuselException;
import exceptions.MatveevException;
import exceptions.BeliayevaException;
import exceptions.PlyosovException;
import exceptions.SamokException;
import exceptions.BudnikExceptions;
import exceptions.KonstantsinovichException;
import exceptions.TuromshaException;
import generic.Beliayeva;
import generic.Novik;
import generic.LevchGineric;
import generic.BudnikGeneric;
import generic.Plyosov;

public class Program
{
	public static void main(String[] args)
	{
		Konstantinovich();
		kislushchanka();
		turomsha();
		busel();
		beliayeva();
		matveev();
		novik();
		leuchyk();
		plyosov();
		budnik();
		samok();
	}

	public static void kislushchanka(){
		System.out.println("Кислущенко Андрей Валерьевич");
	}

	/**
	 * This method shows my full name
	 * @author Туромша Тимофей
	 */
	public static void turomsha(){
		System.out.println("\nТуромша Тимофей Павлович");
		System.out.println("Уругвай, 2019 - " + Turomsha.URUGUY.getPopulation2019() + " чел.");
		System.out.println("Польша, 2020 - " + Turomsha.POLAND.getPopulation2020()+ " чел.");
		try {
			throw new TuromshaException("АШИБКО");
		} catch (TuromshaException e) {
			System.out.println(e.getDetails()+ "\n");
		}
		generic.Turomsha<Integer,String> test = new generic.Turomsha<>(42,"CTPOKA");
		generic.Turomsha<Double,Integer> test2 = new generic.Turomsha<>(55D,24);
		test.getValue2();
		test2.getValue2();



	}

	public static void busel(){
		System.out.println("Денис Бусел!");
		System.out.println("Население Беларуси в 2019 = " + Busel.BELARUS.getPopulation2019());
		System.out.println("Население Росии в 2021 = " + Busel.RUSSIA.getPopulation2021());
		try {
			throw new BuselException("Ситуация...");
		} catch (BuselException e) {
			e.printStackTrace();
		}
		generic.Busel<Integer,String> test = new generic.Busel<>(1,"five");
		generic.Busel<Double,Integer> test2 = new generic.Busel<>(7.0,17);
		test.setValue2("Строка");
		test2.setValue2(12323);
	}

	public static void novik(){
		System.out.println("Новик Сергей");
		System.out.println("Население Беларуси в 2019 = " + Busel.BELARUS.getPopulation2019());
		System.out.println("Население Росии в 2021 = " + Busel.RUSSIA.getPopulation2021());
		Novik <Integer,String> test = new Novik<>(123,"test");
		Novik <Double,Integer> test2 = new Novik<>(12.1,321);

	}

	public static void matveev (){
		System.out.println("Dmitriy Matveev");
		System.out.println("Население Беларуси в 2019 году = " + Matveev.BELARUS.getPopulation2019());
		System.out.println("Население Беларуси в 2021 году = " + Matveev.BELARUS.getPopulation2021());
		try {
			throw new MatveevException("МЯСОУБОРОЧНЫЙ КОМБАЙН");
		} catch (MatveevException e) {
			e.printStackTrace();
		}
		generic.Matveev <Integer, String> obj = new generic.Matveev<>(123, "123");
		generic.Matveev <Integer, Integer> obj2 = new generic.Matveev<>(1234, 123);
	}

	public static void beliayeva() {
		System.out.println("Беляева Наталья Александровна");
		Beliayeva<Integer, String> test = new Beliayeva<>(4, "test");
		Beliayeva<Double, Integer> test2 = new Beliayeva<>(4.0, 3);
		test.setValue2("124");
		test2.setValue2(123);
		System.out.println("Беларусь 2019 = " + enums.Beliayeva.BELARUS.getPopulation2019());
		System.out.println("Беларусь 2021 = " + enums.Beliayeva.BELARUS.getPopulation2021());
		try {
			throw new BeliayevaException("поломка программы");
		} catch (BeliayevaException e) {
			e.printStackTrace();
		}
	}

	public static void plyosov() {
		System.out.println("Плёсов Дмитрий Александрович");
		System.out.println("Беларусь (2019) население = " + plyosov.BELARUS.getPopulation2019());
		System.out.println("Беларусь (2021) население = " + plyosov.BELARUS.getPopulation2021());
		try {
			throw new PlyosovException(" ПалЯмалсО,  Апасна Апасна !!!");
		} catch (PlyosovException e) {
			e.printStackTrace();
		}
		Plyosov <Integer,String> test = new Plyosov<>(675,"Booom");
		Plyosov <Integer,Integer> test2 = new Plyosov<>(566,677);


	}

	public static void leuchyk(){
		System.out.println();
		System.out.println("Левчик В С");
		System.out.println("Население бразилии в 2019 году: " + Leuchyk.BRITISH.getPopulation2019());
		System.out.println("Население бразилии в 2021 году: " + Leuchyk.BRITISH.getPopulation2021());
		System.out.println();
		LevchGineric <Integer, String> levchGineric = new LevchGineric<>(33, "33");
		LevchGineric <Double, String> levchGineric2 = new LevchGineric<>(33.3, "33.3");

	}

	public static void Konstantinovich() {
		System.out.println("Konstantinovich  Svetlana Lvovna");
		System.out.println("Belarus (2019)="+Konstantinovi.BELARUS.getPopulatoin2019());
		System.out.println("Belarus (2021)="+Konstantinovi.BELARUS.getPopulatoin2021());
		try {
			throw new KonstantsinovichException(" сломал");
		} catch (KonstantsinovichException e) {
			e.printStackTrace();
		}
	}

	public static void budnik() {
		System.out.println("Будник Артём Валерьевич");
		System.out.println("Беларусь (2019) Население" + budnik.BELARUS.getPopulation2019());
		System.out.println("Беларусь (2021)Население" + budnik.BELARUS.getPopulation2021());
		try {
			throw new BudnikExceptions("попортил");
		} catch (BudnikExceptions e) {
			e.printStackTrace();
		}
		BudnikGeneric<Integer, String> test = new BudnikGeneric<>(123,"test");
		BudnikGeneric<Integer, Integer> test2 = new BudnikGeneric<>(123,123);
	}

	public static void samok(){
		System.out.println("Samok Iryna");
		System.out.println("Украина (2019) = " + Samok.UKRAINE.getPopulation2019());
		System.out.println("Украина (2021) = " + Samok.UKRAINE.getPopulation2021());
		try {
			throw new SamokException("сломала");
		} catch (SamokException e) {
			e.printStackTrace();
		}
	}
}