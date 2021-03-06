package org.droidplanner.android.graphic.map;

import org.droidplanner.R;
import org.droidplanner.android.maps.MarkerInfo;
import org.droidplanner.core.drone.variables.Home;
import org.droidplanner.core.helpers.coordinates.Coord2D;
import org.droidplanner.core.model.Drone;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class GraphicHome extends MarkerInfo.SimpleMarkerInfo {

	private Home home;

	public GraphicHome(Drone drone) {
		home = drone.getHome();
	}

	@Override
	public float getAnchorU() {
		return 0.5f;
	}

	public boolean isValid() {
		return home.isValid();
	}

	@Override
	public float getAnchorV() {
		return 0.5f;
	}

	@Override
	public Bitmap getIcon(Resources res) {
		return BitmapFactory.decodeResource(res, R.drawable.ic_wp_home);
	}

	@Override
	public Coord2D getPosition() {
		return home.getCoord();
	}

	@Override
	public String getSnippet() {
		return "Home " + home.getAltitude();
	}

	@Override
	public String getTitle() {
		return "Home";
	}

	@Override
	public boolean isVisible() {
		return home.isValid();
	}
}
