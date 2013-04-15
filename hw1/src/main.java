
//Leo Chaisson
//Adam Christensen

public class main {
	public static void main(String[] args){
		City City1 = new City(500000,500, "Boston");
		City City2 = new City(20000,300, "Sandwich");
		City City3 = new City(10000,200, "Holliston");
		City City4 = new City(50000,200, "Plymouth");
		City City5 = new City(30000,300, "Keene");
		City City6 = new City(70000,200, "Merrimack");
		Region[] Cities = new Region[] {City1,City2,City3};
		Region[] Cities2 = new Region[] {City4,City5,City6};
		State State1 = new State(Cities,"Massachusettes","Deval Patrick");
		State State2 = new State(Cities2,"New Hampshire","Margaret Hassan");
		Region[] States = new Region[] {State1,State2};
		Country Country1 = new Country(States, "USA","Barack Obama");
		int population1 = (City1.population+City2.population+City3.population);
		int population2 = (City4.population+City5.population+City6.population);
		System.out.println(Country1.Name+": Population: "+(population1+population2)+" Leader: "+Country1.Leader);
		System.out.println(State1.Name+": Population: "+population1+" Governor: "+State1.Governor);
		System.out.println(State1.toString());
		System.out.println(State2.Name+": Population: "+population2+" Governor: "+State2.Governor);
		System.out.println(State2.toString());
	}
}
