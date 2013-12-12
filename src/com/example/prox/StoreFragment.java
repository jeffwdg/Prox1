package com.example.prox;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

public class StoreFragment extends Fragment {
	private WebView webView;
	
	public StoreFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
        
        webView = (WebView) rootView.findViewById(R.id.storeview);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://prox.parseapp.com/");
        
        return rootView;
    }
}
