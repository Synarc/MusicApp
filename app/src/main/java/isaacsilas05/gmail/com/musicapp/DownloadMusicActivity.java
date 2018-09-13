package isaacsilas05.gmail.com.musicapp;

//import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DownloadMusicActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<SongInfo> mSongInfo;
    private UploadMusicAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_music);

        RecyclerViewSetUp();

    }

    private void RecyclerViewSetUp() {

        //Recycler view set ups
        mRecyclerView = findViewById(R.id.recyclerViewDownload);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mProgressCircle = findViewById(R.id.progress_circle);

        mSongInfo = new ArrayList<>();
        mAdapter = new UploadMusicAdapter(DownloadMusicActivity.this, mSongInfo);

        mRecyclerView.setAdapter(mAdapter);

        // remove this later
        // this is used to demo the recycler view
        mSongInfo.add(new SongInfo("man", "is", "the", "bomb"));
        mSongInfo.add(new SongInfo("mans", "iss", "thes", "bombs"));
        mSongInfo.add(new SongInfo("sman", "sis", "sthe", "sbomb"));
        mSongInfo.add(new SongInfo("man", "is", "the", "bomb"));
        mSongInfo.add(new SongInfo("mans", "iss", "thes", "bombs"));
        mSongInfo.add(new SongInfo("sman", "sis", "sthe", "sbomb"));
        mSongInfo.add(new SongInfo("man", "is", "the", "bomb"));
        mSongInfo.add(new SongInfo("mans", "iss", "thes", "bombs"));
        mSongInfo.add(new SongInfo("sman", "sis", "sthe", "sbomb"));
    }

}
