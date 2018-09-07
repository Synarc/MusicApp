package isaacsilas05.gmail.com.musicapp;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class UploadMusicActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1 ;
    EditText songTitle;
    EditText songAlbum;
    Button upload;
    Button choose;
    private Uri mAudioUri;
    private RecyclerView mRecyclerView;
    private List<SongInfo> mSongInfo;
    private UploadMusicAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_music);


        // stop onscreen keybooard from poping up
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        RecyclerViewSetUp();
        choose = findViewById(R.id.chooseFile);
        upload = findViewById(R.id.upload);
        songAlbum = findViewById(R.id.album);
        songTitle = findViewById(R.id.songName);

        // When upload button is clicked
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // when choose file nbutton is clicked
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseFileMethod();
            }
        });

    }

    private void RecyclerViewSetUp() {

        //Recycler view set ups
        mRecyclerView = findViewById(R.id.recyclerViewUpload);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mProgressCircle = findViewById(R.id.progress_circle);

        mSongInfo = new ArrayList<>();
        mAdapter = new UploadMusicAdapter(UploadMusicActivity.this, mSongInfo);

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


   //Choose an audio file from the folders in the phone
    private void chooseFileMethod() {
        Intent intent = new Intent();
        intent.setType("audio/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);
    }

    // gets the extension (suffix) from the file....
    // example mp3, wav.
    private String getFileExtension(Uri uri){
        ContentResolver cr = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(cr.getType(uri));
    }


   //the URI from the choose file method is returned in this method and put into the mAudioUri
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null
                && data.getData()!= null){
            mAudioUri = data.getData();
        }
    }

}
