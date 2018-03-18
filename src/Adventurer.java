public interface Adventurer
{
	String adventurerName = "";
	String className = "";
	Stats stats = null;
	final static int POINTS_PER_LEVEL = 15;
	int portrait = 0;
	int skill1 = 0;
	int skill2 = 0;
	int skill3 = 0;

	private void levelUp()
	{
		stats.levelUp(POINTS_PER_LEVEL);
	}

	public void skill1();

	public void skill2();

	public void skill3();
}
