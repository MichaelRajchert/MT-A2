package au.edu.canberra.mt_a2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    public locations locations = new locations();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        PolygonOptions ucArea = new PolygonOptions();
        ucArea.add(new LatLng(-35.2314688,149.0808584),
                   new LatLng(-35.2318777,149.0837664),
                   new LatLng(-35.2338154,149.0872369),
                   new LatLng(-35.234921,149.0916533),
                   new LatLng(-35.239973,149.0900189),
                   new LatLng(-35.2419054,149.0900632),
                   new LatLng(-35.2423299,149.0880429),
                   new LatLng(-35.2422903,149.0780278),
                   new LatLng(-35.2406632,149.0753558),
                   new LatLng(-35.238251,149.0769211),
                   new LatLng(-35.2355958,149.0778606),
                   new LatLng(-35.232333,149.0800329)
        );
        ucArea.fillColor(0x2366dbff);
        ucArea.strokeColor(0xffc7fcff);
        ucArea.strokeWidth(4);

        map.addPolygon(ucArea);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(locations.UC_StartingLocation, 14.6f));
    }
}
