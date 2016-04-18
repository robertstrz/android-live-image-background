package simple.liveimagebackground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import simple.liveimagelibrary.LiveBackgroundImageView;


public class MainActivity extends AppCompatActivity {

    LiveBackgroundImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        imageView = (LiveBackgroundImageView) findViewById(R.id.image);
    }

    @Override
    protected void onDestroy() {
        imageView.stopGyroscope();
        super.onDestroy();
    }
}
