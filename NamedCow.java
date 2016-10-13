class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String name)
	{
		myName = name;
	}

	public NamedCow()
	{
		myName = "unknown";
	}
}