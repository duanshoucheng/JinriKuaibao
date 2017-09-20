package com.shoucheng.jinrikuaibao;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;

/**
 * Created by Administrator on 17-9-20.
 */

public class AboutMeActivity extends BaseActivity {
    @BindView(R.id.aboutmeWeb)
    WebView aboutmeWeb;

    @Override
    public int getLayoutId() {
        return R.layout.activity_aboutme;
    }

    @Override
    public void initView() {
        super.initView();
        aboutmeWeb.getSettings();
        aboutmeWeb.loadUrl("file:///android_asset/aboutme.html");
        aboutmeWeb.setWebViewClient(new LocalWebViewClient());
        aboutmeWeb.setWebChromeClient(new WebChromeClient());
//        AssetManager manager = getResources().getAssets();
//        try {
////            InputStream inputStream = manager.open("/asset/aboutme.html");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public class LocalWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.contains("tel:")) {
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_DIAL,uri));
                return true;
            }
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
    @Override
    public void onBackPressed() {
        if (aboutmeWeb.canGoBack()) {
            aboutmeWeb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
