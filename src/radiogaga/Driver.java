package radiogaga;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Driver
{
	private static ArrayList<OldSong> oldSongsList = new ArrayList<OldSong>();
	private static ArrayList<Comercial> commercialsList = new ArrayList<Comercial>();
	private static ArrayList<Report> reportsList = new ArrayList<Report>();
	private static ArrayList<Spot> radioSpotsList = new ArrayList<Spot>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	public static void main(String[] args)
	{
		generateOldSongs();
		generateCommercials();
		generateReports();
		generateRadioSpots();
		Playlist p = new Playlist();
		p.readSongsFromFile("Hotlist.txt");
		
		for(OldSong oldSong : oldSongsList)
			p.add(oldSong);
			
		
		for(Comercial commercial : commercialsList)
			p.add(commercial);
			
		
		for(Report report : reportsList)
			p.add(report);
			
		
		for(Spot radioSpot : radioSpotsList)
			p.add(radioSpot);
		
		new RadioGUI_2(p);
	}
	
	public static void generateOldSongs()
	{
		OldSong oldSongOne;
		OldSong oldSongTwo;
		OldSong oldSongThree;
		OldSong oldSongFour;
		OldSong oldSongFive;
		OldSong oldSongSix;
		OldSong oldSongSeven;
		OldSong oldSongEight;
		OldSong oldSongNine;
		OldSong oldSongTen;
		
		try {
			
			oldSongOne = new OldSong("Bohemian Rhapsody", "Rock", 355, "Queen", "A Night at the Opera", sdf.parse("10/31/1975"));
			oldSongTwo = new OldSong("Stairway to Heaven", "Rock", 483, "Led Zeppelin", "Led Zeppelin IV", sdf.parse("12/05/1970"));
			oldSongThree = new OldSong("Imagine", "Soft Rock", 183, "John Lennon", "Imagine", sdf.parse("10/11/1971"));
			oldSongFour = new OldSong("Smells Like Teen Spirit", "Alternative Rock", 301, "Nirvana", "Nevermind", sdf.parse("09/10/1991"));
			oldSongFive = new OldSong("Hotel California", "Soft Rock", 390, "Eagles", "Hotel California", sdf.parse("02/01/1977"));
			oldSongSix = new OldSong("Sweet Child O'Mine", "Hard Rock", 355, "Guns N' Roses", "Appetite for Destruction", sdf.parse("08/15/1988"));
			oldSongSeven = new OldSong("One", "Thrash Metal", 447, "Metallica", "...And Justice for All", sdf.parse("01/10/1989"));
			oldSongEight = new OldSong("It's Not Unusual","Pop", 123, "Tom Jones", "Along Came Jones", sdf.parse("11/11/1964"));
			oldSongNine = new OldSong("Like a Rolling Stone", "Rock", 373, "Bob Dylan", "Highway 61 Revisited", sdf.parse("07/20/1965"));
			oldSongTen = new OldSong("Hey Jude", "Rock", 431, "The Beatles", "Single", sdf.parse("08/26/1968"));
			
			oldSongsList.add(oldSongOne);
			oldSongsList.add(oldSongTwo);
			oldSongsList.add(oldSongThree);
			oldSongsList.add(oldSongFour);
			oldSongsList.add(oldSongFive);
			oldSongsList.add(oldSongSix);
			oldSongsList.add(oldSongSeven);
			oldSongsList.add(oldSongEight);
			oldSongsList.add(oldSongNine);
			oldSongsList.add(oldSongTen);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generateCommercials()
	{
		Comercial comOne = new Comercial("Bose Audio", "Better Sound Through Research", 30, "Bose");
		Comercial comTwo = new Comercial("Axe Body Spray", "'Nice' women become 'Naughty'", 30, "Axe");
		Comercial comThree = new Comercial("Captain Morgan", "To Life, Love and Loot." , 30, "Diageo");
		Comercial comFour = new Comercial("Samsung Galaxy S6 Edge", "Next is Now", 30, "Samsung");
		Comercial comFive = new Comercial("iPhone 6S", "The only thing that's changed is everything.", 30, "Apple");
		Comercial comSix = new Comercial("Xbox One", "All for one. Input one.", 30, "Microsoft");
		Comercial comSeven = new Comercial("Playstation 4", "Where the Greatest Play", 30, "Sony Computer Entertainment");
		Comercial comEight = new Comercial("Fallout 4", "Welcome Home", 30, "Bethesda Game Studios");
		Comercial comNine = new Comercial("Kia Optima", "The Power to Surprise", 30, "Kia Motors");
		Comercial comTen = new Comercial("Colegate Toothpaste", "Improve mouth health simply by brushing.", 30, "Colgate");
		Comercial comEleven = new Comercial("Some Non-Prescription Drug", "We have so many side effects, why bother?!", 30, "Drug Company");
		Comercial comTwelve = new Comercial("Commercial Block", "Smorgasbord of Commercials", 300, "Various Sponsors");
		
		commercialsList.add(comOne);
		commercialsList.add(comTwo);
		commercialsList.add(comThree);
		commercialsList.add(comFour);
		commercialsList.add(comFive);
		commercialsList.add(comSix);
		commercialsList.add(comSeven);
		commercialsList.add(comEight);
		commercialsList.add(comNine);
		commercialsList.add(comTen);
		commercialsList.add(comEleven);
		commercialsList.add(comTwelve);
		
	}
	
	public static void generateReports()
	{
		//News Report
		Report newsReport = new Report("News Report", "Update about the local news.", 60, Type.NEWS);
		
		//Weather Report
		Report weatherReport = new Report("Weather Report", "Update about the local weather.", 30, Type.WEATHER);
		
		//Traffic Report
		Report trafficReport = new Report("Traffic Report", "Update about the current local traffic.", 60, Type.TRAFFIC);
		
		reportsList.add(newsReport);
		reportsList.add(weatherReport);
		reportsList.add(trafficReport);
	}
	
	public static void generateRadioSpots()
	{
		Spot radioSpot = new Spot("Radio Spot", "Timeslot reserved for the DJ to talk about events, shows, etc.", 120);
		
		radioSpotsList.add(radioSpot);
	}

}
