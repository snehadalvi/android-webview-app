package com.example.testsystemwebview;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {
    
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return false;
    }
}