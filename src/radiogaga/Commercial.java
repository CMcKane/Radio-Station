package radiogaga;

public class Commercial extends Broadcast
{
	public Commercial(String name, String description, long runtime, String sponser)
	{
		super(name, description, runtime);
		this.sponser = sponser;
	}

	protected String sponser;
}
