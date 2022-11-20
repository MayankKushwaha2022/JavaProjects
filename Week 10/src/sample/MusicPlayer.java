package sample;

public interface MusicPlayer {
	public void nextSong();
	public void previousSong();
	public void shuffle();
	public void increaseVolume(int level);
	public void decreaseVolume(int level);
}