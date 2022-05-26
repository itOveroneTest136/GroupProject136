package enums;

public enum Leuchyk
{
	BELARUS(9_413_446, 9_349_645),
	BRITISH(67_337_516, 68_134_268),
	SPANISH(46_937_060, 47_344_649);

	private int population2019;
	private int population2021;

	Leuchyk(int population2019, int population2021)
	{
		this.population2019 = population2019;
		this.population2021 = population2021;
	}

	public int getPopulation2019()
	{
		return population2019;
	}

	public int getPopulation2021()
	{
		return population2021;
	}
}

