package com.example.cmput301w21t23_smartdatabook;

import android.location.Location;

/**
 * main Experiment class
 */
public class Experiment {
    private String expName;
    private String ownerUserID;
    private String trialType;
    private String description;
    private boolean regionOn;
    // private Map region;
    private int minTrials;
    private int maxTrials;
    private boolean isPublic;
    // private Trial Array<Trial>;
    private String date;
    private boolean requireLocation = false;
    private Location location;

    public Experiment(String expName, String ownerUserID, String trialType, String description, boolean regionOn, int minTrials, int maxTrials, boolean isPublic, String date) {
        this.expName = expName;
        this.ownerUserID = ownerUserID;
        this.trialType = trialType;
        this.description = description;
        this.regionOn = regionOn;
        this.minTrials = minTrials;
        this.maxTrials = maxTrials;
        this.isPublic = isPublic;
        this.date = date;
    }

    public Experiment(String expName, String ownerUserID, String trialType, String description, boolean regionOn, int minTrials, int maxTrials, boolean isPublic, String date, boolean requireLocation, Location location) {
        this.expName = expName;
        this.ownerUserID = ownerUserID;
        this.trialType = trialType;
        this.description = description;
        this.regionOn = regionOn;
        this.minTrials = minTrials;
        this.maxTrials = maxTrials;
        this.isPublic = isPublic;
        this.date = date;
        this.requireLocation = requireLocation;
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getOwnerUserID() {
        return ownerUserID;
    }

    public void setOwnerUserID(String ownerUserID) {
        this.ownerUserID = ownerUserID;
    }

    public String getTrialType() {
        return trialType;
    }

    public void setTrialType(String trialType) {
        this.trialType = trialType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRegionOn() {
        return regionOn;
    }

    public void setRegionOn(boolean regionOn) {
        this.regionOn = regionOn;
    }

    public int getMinTrials() {
        return minTrials;
    }

    public void setMinTrials(int minTrials) {
        this.minTrials = minTrials;
    }

    public int getMaxTrials() {
        return maxTrials;
    }

    public void setMaxTrials(int maxTrials) {
        this.maxTrials = maxTrials;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean requiresLocation() {
        return requireLocation;
    }

    public void toggleRequireLocation() {
        this.requireLocation = !this.requireLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
