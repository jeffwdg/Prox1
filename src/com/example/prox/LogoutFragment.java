package com.example.prox;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LogoutFragment extends Fragment {
	ImageView btnlogOut;
	public LogoutFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
         
        btnlogOut=(ImageView) rootView.findViewById(R.id.btnlogOut);
			
	    // Set OnClick Listener on SignUp button 
        btnlogOut.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(getActivity(), ForgotPassword.class);
			startActivity(intent);
			//logOut();
			}
		});
	    
       
      
        
        return rootView;
    }
 
	
}
