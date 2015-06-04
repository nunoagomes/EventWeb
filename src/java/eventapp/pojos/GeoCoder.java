/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.pojos;

/**
 *
 * @author nunoandrebarbosagomes
 */
public class GeoCoder {
    
    private float lat;
    private float lng;

    public GeoCoder(float lat, float lng) {
        this.setLat(lat);
        this.setLng(lng);
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

  
    
}
