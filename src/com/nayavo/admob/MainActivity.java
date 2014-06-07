package com.nayavo.admob;

import java.util.HashMap;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;  
import android.app.Activity; 
import android.os.Bundle; 
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		showInterstitial(null);
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView.setAdListener(new GoogleAdListener(this, adView));
        

		
	}
	
	public void refreshBanner( View v){ 
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView.setAdListener(new GoogleAdListener(this, adView));
	}
	
  public void showInterstitial( View v){ 
 	 
		InterstitialAd interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-0269953301073925/7507755330"); 
	    AdRequest adRequest = new AdRequest.Builder().build();
	    interstitial.loadAd(adRequest);
	    interstitial.setAdListener(new GoogleAdListenerInter(this, interstitial));
	  
 	}
}
