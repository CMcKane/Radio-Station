package radiogaga;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Driver
{
	private static ArrayList<OldSong> oldSongsList = new ArrayList<OldSong>();
	private static ArrayList<Commercial> commercialsList = new ArrayList<Commercial>();
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
			
		
		for(Commercial commercial : commercialsList)
			p.add(commercial);
			
		
		for(Report report : reportsList)
			p.add(report);
			
		
		for(Spot radioSpot : radioSpotsList)
			p.add(radioSpot);
		
		new RadioGUI_2(p);
	}
	
	public static void generateOldSongs()
	{
		try {
			
			oldSongsList.add(new OldSong("Bohemian Rhapsody", "Rock", 355, "Queen", "A Night at the Opera", sdf.parse("10/31/1975")));
			oldSongsList.add(new OldSong("Stairway to Heaven", "Rock", 483, "Led Zeppelin", "Led Zeppelin IV", sdf.parse("12/05/1970")));
			oldSongsList.add(new OldSong("Imagine", "Soft Rock", 183, "John Lennon", "Imagine", sdf.parse("10/11/1971")));
			oldSongsList.add(new OldSong("Smells Like Teen Spirit", "Alternative Rock", 301, "Nirvana", "Nevermind", sdf.parse("09/10/1991")));
			oldSongsList.add(new OldSong("Hotel California", "Soft Rock", 390, "Eagles", "Hotel California", sdf.parse("02/01/1977")));
			oldSongsList.add(new OldSong("Sweet Child O'Mine", "Hard Rock", 355, "Guns N' Roses", "Appetite for Destruction", sdf.parse("08/15/1988")));
			oldSongsList.add(new OldSong("One", "Thrash Metal", 447, "Metallica", "...And Justice for All", sdf.parse("01/10/1989")));
			oldSongsList.add(new OldSong("It's Not Unusual","Pop", 123, "Tom Jones", "Along Came Jones", sdf.parse("11/11/1964")));
			oldSongsList.add(new OldSong("Like a Rolling Stone", "Rock", 373, "Bob Dylan", "Highway 61 Revisited", sdf.parse("07/20/1965")));
			oldSongsList.add(new OldSong("Hey Jude", "Rock", 431, "The Beatles", "Single", sdf.parse("08/26/1968")));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generateCommercials()
	{
		commercialsList.add(new Commercial("Bose Audio", "Better Sound Through Research", 30, "Bose"));
		commercialsList.add(new Commercial("Axe Body Spray", "'Nice' women become 'Naughty'", 30, "Axe"));
		commercialsList.add(new Commercial("Captain Morgan", "To Life, Love and Loot." , 30, "Diageo"));
		commercialsList.add(new Commercial("Samsung Galaxy S6 Edge", "Next is Now", 30, "Samsung"));
		commercialsList.add(new Commercial("iPhone 6S", "The only thing that's changed is everything.", 30, "Apple"));
		commercialsList.add(new Commercial("Xbox One", "All for one. Input one.", 30, "Microsoft"));
		commercialsList.add(new Commercial("Playstation 4", "Where the Greatest Play", 30, "Sony Computer Entertainment"));
		commercialsList.add(new Commercial("Fallout 4", "Welcome Home", 30, "Bethesda Game Studios"));
		commercialsList.add(new Commercial("Kia Optima", "The Power to Surprise", 30, "Kia Motors"));
		commercialsList.add(new Commercial("Colegate Toothpaste", "Improve mouth health simply by brushing.", 30, "Colgate"));
		commercialsList.add(new Commercial("Some Non-Prescription Drug", "We have so many side effects, why bother?!", 30, "Drug Company"));
		commercialsList.add(new Commercial("Commercial Block", "Smorgasbord of Commercials", 300, "Various Sponsors"));	
	}
	
	public static void generateReports()
	{
		//News Report
		reportsList.add(new Report("News Report", "Update about the local news.", 60, Type.NEWS));
		
		//Weather Report
		reportsList.add(new Report("Weather Report", "Update about the local weather.", 30, Type.WEATHER));
		
		//Traffic Report
		reportsList.add(new Report("Traffic Report", "Update about the current local traffic.", 60, Type.TRAFFIC));
	}
	
	public static void generateRadioSpots()
	{
		radioSpotsList.add(new Spot("Radio Spot", "Timeslot reserved for the DJ to talk about events, shows, etc.", 120));
	}

}
