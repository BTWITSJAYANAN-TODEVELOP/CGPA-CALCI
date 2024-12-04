package com.example.cgpacalci;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);

        // Set WebViewClient to handle internal links
        webView.setWebViewClient(new WebViewClient());

        // Load the HTML file from assets folder
        webView.loadUrl("file:///android_asset/index.html");
    }
}
