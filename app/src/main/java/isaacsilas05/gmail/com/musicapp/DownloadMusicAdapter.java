package isaacsilas05.gmail.com.musicapp;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DownloadMusicAdapter extends RecyclerView.Adapter<DownloadMusicAdapter.AudioViewHolder > {

    private Context mContext;
    private List<SongInfo> mSongInfo;


    public DownloadMusicAdapter(Context mContext, List<SongInfo> mSongInfo) {
        this.mContext = mContext;
        this.mSongInfo = mSongInfo;
    }

    @NonNull
    @Override
    public DownloadMusicAdapter.AudioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.download_recyclerview, viewGroup, false);
        return new DownloadMusicAdapter.AudioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadMusicAdapter.AudioViewHolder audioViewHolder, int i) {
        final SongInfo uploadCurrent = mSongInfo.get(i);
        audioViewHolder.songArtist.setText(uploadCurrent.getmSongArtist());
        audioViewHolder.songAlbulm.setText(uploadCurrent.getmSongAlbum());
        audioViewHolder.songtitle.setText(uploadCurrent.getmSongtitle());
        
    }

    @Override
    public int getItemCount() {
        return mSongInfo.size();
    }

    public class AudioViewHolder extends RecyclerView.ViewHolder {

        TextView songtitle;
        TextView songArtist;
        TextView songAlbulm;
        ImageView imageView;

        public AudioViewHolder(@NonNull View itemView) {
            super(itemView);

            songtitle = itemView.findViewById(R.id.tvSongTitle);
            songAlbulm = itemView.findViewById(R.id.tvAlbum);
            songArtist = itemView.findViewById(R.id.tvArtist);
            imageView = itemView.findViewById(R.id.imageview);
        }
    }

}
