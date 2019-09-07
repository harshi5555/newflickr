package com.test;

public class Items {
    String title;
    String link;
    private Media media;

    public Items(String title, String link,Media media) {
        this.title = title;
        this.link = link;
        this.setMedia(media);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}

class Media{
    private String m;

    public Media(String m) {
        this.setM(m);
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }
}
