
public class ContainerRegion extends Region {
	Region[] RegionArray = new Region[5];
	public ContainerRegion(Region[] RegionArray,String name)
	{
		super(name);
		this.RegionArray = RegionArray;
	}
	
	@Override
	int getPopulation() {
		for(int i=0; i < RegionArray.length; i++){
		RegionArray[i].getPopulation();
		}
		return 0;
	}
	
	@Override
	double getArea() {
		return 0;
	}

	@Override
	public String toString() {
		String output = "";
		for(int i=0; i < RegionArray.length; i++){
			output +=RegionArray[i].getName() +": ";
			output +="Population = " + RegionArray[i].getPopulation() +" ";
			output +="Area = " + RegionArray[i].getArea() + "\n";
		}
		return output;
		};
	}
	
	
