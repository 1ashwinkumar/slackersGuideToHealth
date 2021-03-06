package com.tommymathews.slackersguidetohealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Health extends Activity {

    WebView webViewPhysical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        webViewPhysical = (WebView) findViewById(R.id.web_health);
        String urlPart1 = "https://www.eventbrite.com/d/";
        String urlPart2 = "--";
        String urlPart3 = "/"+ getIntent().getStringExtra(Events.EVENT_TYPE) +"/?crt=regular&sort=best";
        String state = getIntent().getStringExtra(Events.STATE);
        String city = getIntent().getStringExtra(Events.CITY);
        String url = urlPart1+state+" "+urlPart2+city+urlPart3;
        webViewPhysical.loadUrl(url);
        Intent returnIntent = getIntent();
        setResult(Activity.RESULT_CANCELED, returnIntent);
        finish();
    }

}