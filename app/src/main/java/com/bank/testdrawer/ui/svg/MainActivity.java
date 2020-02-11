package com.bank.testdrawer.ui.svg;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

import android.app.Activity;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bank.testdrawer.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svg_layout);
        ImageView imageViewRes = findViewById(R.id.imageView);
        RequestBuilder<PictureDrawable> requestBuilder = Glide.with(this)
                .as(PictureDrawable.class)
                .transition(withCrossFade())
                .listener(new SvgSoftwareLayerSetter());

        Uri uri = Uri.parse("http://www.clker.com/cliparts/u/Z/2/b/a/6/android-toy-h.svg");
        requestBuilder.load(uri).into(imageViewRes);
    }

}