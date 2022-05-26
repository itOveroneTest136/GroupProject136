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
	 */
	public static void turomsha(){
		System.out.println("Туромша Тимофей Павлович");
		System.out.println("Уругвай, 2019" + Turomsha.URUGUY.getPopulation2019()); ;
		System.out.println("Польша, 2020" +Turomsha.POLAND.getPopulation2020()); ;
	}
	public static void busel(){
		System.out.println("Денис Бусел!");
		System.out.println("Население Беларуси в 2019 = " + Busel.BELARUS.getPopulation2019());
		System.out.println("Население Росии в 2021 = " + Busel.RUSSIA.getPopulation2021());

	}


	public static void novik(){
		System.out.println("Новик Сергей");
	}

	public static void matveev (){
		System.out.println("Dmitriy Matveev");
		System.out.println("Население Беларуси в 2019 году = " + Matveev.BELARUS.getPopulation2019());
		System.out.println("Население Беларуси в 2021 году = " + Matveev.BELARUS.getPopulation2021());
	}

	public static void beliayeva() {
		System.out.println("Беляева Наталья Александровна");
		System.out.println("Беларусь 2019 = " + Beliayeva.BELARUS.getPopulation2019());
		System.out.println("Беларусь 2021 = " + Beliayeva.BELARUS.getPopulation2021());
	}

	public static void plyosov() {
		System.out.println("Плёсов Дмитрий Александрович");
		System.out.println("Беларусь (2019) население = "+plyosov.BELARUS.getPopulation2019());
		System.out.println("Беларусь (2021) население = "+plyosov.BELARUS.getPopulation2021());
	}

	public static void leuchyk(){
		System.out.println("Левчик В С");
	}
	public static void Konstantinovich(){
		System.out.println("Konstantinovich  Svetlana Lvovna");
	}
	public static void budnik(){
		System.out.println("Будник Артём Валерьевич");
	}

	public static void samok (){
		System.out.println("Samok Iryna");
	}
}
