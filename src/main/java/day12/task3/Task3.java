package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {


    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Moby", 1978);
        MusicBand musicBand2 = new MusicBand("Sting", 1976);
        MusicBand musicBand3 = new MusicBand("Radiohad", 1987);
        MusicBand musicBand4 = new MusicBand("DaftPank", 1997);
        MusicBand musicBand5 = new MusicBand("U2", 1976);
        MusicBand musicBand6 = new MusicBand("Billi", 2015);
        MusicBand musicBand11 = new MusicBand("30second", 2001);
        MusicBand musicBand7 = new MusicBand("muv", 2013);
        MusicBand musicBand8 = new MusicBand("stars", 2009);
        MusicBand musicBand9 = new MusicBand("city", 2011);
        MusicBand musicBand10 = new MusicBand("Electro", 2015);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand11);
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        List<MusicBand>musicBands2000=new ArrayList<>();
        for (MusicBand band:musicBands){
            if (band.getYear()>2000)
                musicBands2000.add(band);

        }
        System.out.println(musicBands2000);
    }

}
