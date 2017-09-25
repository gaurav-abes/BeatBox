package com.bignerdranch.android.beatbox;

/**
 * Created by Gaurav on 25/09/17.
 */

public class Sound {

    private String mAssetPath;
    private String mName;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] compenets = mAssetPath.split("/");
        String fileName = compenets[compenets.length - 1];
        mName = fileName.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
