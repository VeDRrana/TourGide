package com.exsample.android.tourgide;
// Song represents a list of songs - contains a song name, artist name and picture

public class List {

    private int name;

    private int text;

    // Image resource ID
    private int imageOneId;
    private int imageTwoId;
    private int imageThreeId;

    //Constructor to create Song object with song name, artist name
    public List(int placeName,int placeText, int imageOne, int imageTwo, int imageThree) {
        name = placeName;
        text = placeText;
        imageOneId = imageOne;
        imageTwoId = imageTwo;
        imageThreeId = imageThree;
    }

    // Get item name, text, image resource id
    public int getName() {
        return name;
    }
    public int getText() {
        return text;
    }
    public int getImageOneId() {
        return imageOneId;
    }
    public int getImageTwoId() {
        return imageTwoId;
    }
    public int getImageThreeId() {
        return imageThreeId;
    }
}
