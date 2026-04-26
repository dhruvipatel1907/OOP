/**Write a Java program to simulate a Music Playlist using LinkedList<String>. Perform the
Following operations:
1. Add songs to the playlist.
2. Display the full playlist.
3. Play the first song (remove from front).
4. Skip the last song (remove from end).
5. Display the updated playlist after each operation.*/

import java.util.*;
class MusicPlaylist {
 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		LinkedList<String> playlist = new LinkedList<String>();
 		playlist.add("Song 1");
 		playlist.add("Song 2");
 		playlist.add("Song 3");
 		playlist.add("Song 4");
 		playlist.add("Song 5");
 		System.out.println("Full Playlist:");
 		System.out.println(playlist);
 		String first = playlist.removeFirst();
 		System.out.println("\nPlaying: " + first);
		System.out.println("Playlist after playing first song:");
 		System.out.println(playlist);
 		String last = playlist.removeLast();
 		System.out.println("\nSkipped: " + last);
 		System.out.println("Playlist after skipping last song:");
 		System.out.println(playlist);
 	}
}