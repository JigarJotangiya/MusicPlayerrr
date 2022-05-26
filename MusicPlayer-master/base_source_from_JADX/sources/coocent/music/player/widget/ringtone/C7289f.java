package coocent.music.player.widget.ringtone;

import java.io.Serializable;

/* renamed from: coocent.music.player.widget.ringtone.f */
/* compiled from: Media */
public class C7289f implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: ID */
    private String f32217ID;
    private String album;
    private String arist;
    private String contactID;
    private String contactName;
    private String displayName;
    private int duration;
    private boolean isAlarm;
    private boolean isContact;
    private boolean isMusic;
    private boolean isNotification;
    private boolean isRingTone;
    private String path;
    private String title;

    public String getAlbum() {
        return this.album;
    }

    public String getArist() {
        return this.arist;
    }

    public String getContactID() {
        return this.contactID;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getID() {
        return this.f32217ID;
    }

    public String getPath() {
        return this.path;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAlarm() {
        return this.isAlarm;
    }

    public boolean isContact() {
        return this.isContact;
    }

    public boolean isMusic() {
        return this.isMusic;
    }

    public boolean isNotification() {
        return this.isNotification;
    }

    public boolean isRingTone() {
        return this.isRingTone;
    }

    public void setAlarm(boolean z) {
        this.isAlarm = z;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArist(String str) {
        this.arist = str;
    }

    public void setContact(boolean z) {
        this.isContact = z;
    }

    public void setContactID(String str) {
        this.contactID = str;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setID(String str) {
        this.f32217ID = str;
    }

    public void setMusic(boolean z) {
        this.isMusic = z;
    }

    public void setNotification(boolean z) {
        this.isNotification = z;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setRingTone(boolean z) {
        this.isRingTone = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
