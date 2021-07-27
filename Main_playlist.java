package com.company;

import java.util.*;

public class Main {
private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("Hold on",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can't do it right",6.23);
        albums.add(album);

        album = new Album("For those about to rock","AD/DC");
        album.addSong("I put the finger on you",3.25);
        album.addSong("Let's go",5.22);
        album.addSong("Inject the venom",3.45);
        album.addSong("Snowballed",4.51);
        album.addSong("Evil walks",3.45);
        album.addSong("C.O.D",5.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Love don't mean a thing",playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(5,playList);
        play(playList);

    }
private static void play(LinkedList<Song> playList) {
    boolean goingForward = true;
    ListIterator<Song> songIterator = playList.listIterator();
    boolean quit = false;
    if(playList.size() ==0) {
        System.out.println("No songs in playlist");
        return;
    }else{
        System.out.println("Now playing "+songIterator.next().toString());
        printOptions();
    }
    while(!quit) {
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 0:
                System.out.println("Playlist complete.");
                quit = true;
                break;
            case 1:
                if (!goingForward) {
                    if (songIterator.hasNext()) {
                        songIterator.next();
                    }
                    goingForward = true;
                }
                if (songIterator.hasNext()) {
                    System.out.println("Now playing " + songIterator.next().toString());
                } else {
                    System.out.println("We have reached the end of the playlist");
                    goingForward = false;
                }
                break;
            case 2:
                if (goingForward) {
                    if (songIterator.hasPrevious()) {
                        songIterator.previous();
                    }
                    goingForward = false;
                }
                if (songIterator.hasPrevious()) {
                    System.out.println("Now playing " + songIterator.previous().toString());
                } else {
                    System.out.println("We are at the start playlist");
                    goingForward = true;
                }
                break;
            case 3:
                if (goingForward) {
                    if (songIterator.hasPrevious()) {
                        System.out.println("Now replaying " + songIterator.previous().toString());
                        goingForward = false;
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                }else{
                if (songIterator.hasNext()) {
                    System.out.println("Now replaying " + songIterator.next().toString());
                    goingForward = true;
                } else {
                    System.out.println("We have reached the end of the playList");
                }
        }
break;
            case 4:
                printList(playList);
                break;
            case 5:
                printOptions();
                break;
            case 6:
                if(playList.size()>0) {
                    songIterator.remove();
                    if(songIterator.hasNext()) {
                        System.out.println("Now playing "+songIterator.next());
                    }else if(songIterator.hasPrevious()) {
                        System.out.println("Now playing "+songIterator.previous());
                    }
                }
break;

        }
    }

}

    public static void printOptions() {
        System.out.println("Select option: ");
        System.out.println("Press: \n" +
                "0  - to quit;\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist;\n" +
                "5 - print available action\n" +
                "6 - remove current song."
               );
    }
    private static void printList(LinkedList<Song> playList) {
        Iterator<Song>  iterator = playList.iterator();
        System.out.println("==================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("==================================");
    }











}
