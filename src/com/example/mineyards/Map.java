package com.example.mineyards;

import java.util.List;

import com.google.android.maps.*;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class Map extends MapActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_map);
	    
	    MapView mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    
	    List<Overlay> mapOverlays = mapView.getOverlays();
	    Drawable drawable = this.getResources().getDrawable(R.drawable.ic_launcher);
	    AddItems itemizedoverlay = new AddItems(drawable, this);
	    
	    GeoPoint point = new GeoPoint(19240000,-99120000);
	    OverlayItem overlayitem = new OverlayItem(point, "Hola, Mundo!", "I'm in Mexico City!");
	
	    itemizedoverlay.addOverlay(overlayitem);
	    mapOverlays.add(itemizedoverlay);
	}
	
	@Override
	protected boolean isRouteDisplayed() {
	    return false;
	}
	
	
}