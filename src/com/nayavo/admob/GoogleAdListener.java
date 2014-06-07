package com.nayavo.admob;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;

public class GoogleAdListener extends AdListener {
private Context _context;
private AdView _adView;
 
public GoogleAdListener(Context context, AdView adView) {
this._context = context;
_adView = adView; 
//Hide the AdView on creation
_adView.setVisibility(View.GONE);
}
@Override
public void onAdLoaded() {
//Display the AdView if an Ad is loaded
_adView.setVisibility(View.VISIBLE);
}
}