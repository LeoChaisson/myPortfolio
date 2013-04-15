
public class AtomicRegion extends Region {
	int population;
	double area;
	AtomicRegion(int population, double area, String Name){
		super(Name);
		this.population = population;
		this.area = area;
	}
	
	int getPopulation() {
		return population;
	}

	
	double getArea() {
		return area;
	}
	/*public static void main(String[] args){
		City Boston1 = new City(100,100, "Boston");
		City New_York1 = new City(100,100, "New York");
		City Tokyo1 = new City(100,100, "Tokyo");
		Region[] Array2 = new Region[] {Boston1,New_York1,Tokyo1};
		ContainerRegion Container = new ContainerRegion(Array2, "USA");
		System.out.println(Container.toString());
		
	}*/
}
