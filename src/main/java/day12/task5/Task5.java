package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Michael Balzary", 67));
        members1.add(new MusicArtist("Anthony Kiedis", 68));
        members1.add(new MusicArtist("Chad Smith", 70));
        members1.add(new MusicArtist("John Frusciante", 65));
        MusicBand band1 = new MusicBand("Red Hot Chili Peppers", 1983, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Serj Tankian",50));
        members2.add(new MusicArtist("Daron Malakian",51));
        members2.add(new MusicArtist("Shavo Odadjian",50));
        members2.add(new MusicArtist("John Dolmayan",53));
        MusicBand band2 = new MusicBand("System of a Down", 1994, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();



    }
}
