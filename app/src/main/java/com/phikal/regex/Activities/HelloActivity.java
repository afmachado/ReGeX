package com.phikal.regex.Activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.phikal.regex.R;


public class HelloActivity extends Activity {

    Uri cheatsheet = Uri.parse("http://www.cheatography.com/davechild/cheat-sheets/regular-expressions/"),
            changelog = Uri.parse("https://github.com/phikal/ReGeX/blob/master/CHANGELOG.org"),
            source = Uri.parse("http://github.com/phikal/regex");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        findViewById(R.id.close).setOnClickListener((v) ->
                onBackPressed());

        findViewById(R.id.help).setOnClickListener((v) ->
                startActivity(new Intent(Intent.ACTION_VIEW, cheatsheet)));

        findViewById(R.id.show_new).setOnClickListener((v) ->
                startActivity(new Intent(Intent.ACTION_VIEW, changelog)));

        findViewById(R.id.source).setOnClickListener((v) ->
                startActivity(new Intent(Intent.ACTION_VIEW, source)));
    }

}
