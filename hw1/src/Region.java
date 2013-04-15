
public abstract class Region {
	
String Name = "";
public String getName() {
	return Name;
}

abstract int getPopulation();
abstract double getArea();
public Region(String Name)
{
	this.Name = Name;
}
}
