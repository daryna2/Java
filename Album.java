package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song>songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration) {
if(findSong(title) !=null) {
    System.out.println("Song already exist");
    return false;
}
Song newSong = new Song(title, duration);
this.songs.add(newSong);
        System.out.println("Song "+"'"+title+"'"+"  added");
return true;
    }


    private String findSong(String title) {
        for(int i = 0; i< this.songs.size();i++) {
            String song = this.songs.get(i).getTitle();
            if(song.equals(title)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
for(int i = 0;i< songs.size();i++) {
    if (i == trackNumber) {
        playList.add(this.songs.get(i));
        String songTitle = this.songs.get(i).getTitle();
        System.out.println("Song "+"'"+songTitle+"'"+" added in playList" );
        return true;
    }
}
    System.out.println("There is no track");
    return false;
}

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        if(findSong(title) == null) {
            System.out.println("Does not exist");
            return false;
        }
        for(int i = 0; i<this.songs.size();i++) {
            String song = this.songs.get(i).getTitle();
            if(song.equals(title)) {
                Song songToPlayList = this.songs.get(i);
                playList.add(songToPlayList);
                System.out.println("Song with title "+"'"+ title+"'"+" added in playList");
                return true;
            }
        }
        return false;
    }













}
