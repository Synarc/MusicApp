package isaacsilas05.gmail.com.musicapp;

public class SongInfo {

    private String mSongtitle;
    private String mSongArtist;
    private String mSongAlbum;
    private String mImageURL;
    private String mKey;

    public SongInfo(){
        //empty constructor
    }

    public SongInfo(String mSongtitle, String mSongArtist, String mSongAlbum, String mImageURL) {
        this.mSongtitle = mSongtitle;
        this.mSongArtist = mSongArtist;
        this.mSongAlbum = mSongAlbum;
        this.mImageURL = mImageURL;
    }

    public String getmImageURL() {
        return mImageURL;
    }

    public void setmImageURL(String mImageURL) {
        this.mImageURL = mImageURL;
    }

    public String getmSongtitle() {
        return mSongtitle;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }

    public void setmSongtitle(String mSongtitle) {
        this.mSongtitle = mSongtitle;
    }

    public String getmSongArtist() {
        return mSongArtist;
    }

    public void setmSongArtist(String mSongArtist) {
        this.mSongArtist = mSongArtist;
    }

    public String getmSongAlbum() {
        return mSongAlbum;
    }

    public void setmSongAlbum(String mSongAlbum) {
        this.mSongAlbum = mSongAlbum;
    }
}
