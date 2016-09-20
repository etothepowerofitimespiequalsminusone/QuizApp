package com.example.laganovskis.cover;

/**
 * Created by Laganovskis on 9/2/2016.
 */
public class Albums {

    private int id;
    private String albumName;
    private String albumURL;


    public Albums(){

    }

    public Albums(String albumName, String albumURL) {
        this.albumName = albumName;
        this.albumURL = albumURL;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumURL() {
        return albumURL;
    }

    public void setAlbumURL(String albumURL) {
        this.albumURL = albumURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
