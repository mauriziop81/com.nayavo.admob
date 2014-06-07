package com.nayavo.admob;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class GoogleAdListenerInter extends AdListener {
private Context _context;
private InterstitialAd interstitial;
 
public GoogleAdListenerInter(Context context, InterstitialAd interstitial) {
	this.interstitial = interstitial;
this._context = context;
if (interstitial.isLoaded()) {
    interstitial.show();
  }
}
@Override
public void onAdLoaded() {
    if (interstitial.isLoaded()) {
        interstitial.show();
      }
}
}