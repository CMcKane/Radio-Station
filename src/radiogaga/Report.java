package radiogaga;

public class Report extends Broadcast
{
	public Report(String name, String description, long runtime, Enum<Type> type)
	{
		super(name, description, runtime);
		this.type = (Type) type;
	}

	protected Type type;

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

}
