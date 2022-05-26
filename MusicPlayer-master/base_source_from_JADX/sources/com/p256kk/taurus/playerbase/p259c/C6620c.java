package com.p256kk.taurus.playerbase.p259c;

import java.io.Serializable;

/* renamed from: com.kk.taurus.playerbase.c.c */
/* compiled from: TimedTextSource */
public class C6620c implements Serializable {
    private int flag;
    private String mimeType;
    private String path;

    public C6620c(String str) {
        this.path = str;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getPath() {
        return this.path;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public C6620c(String str, String str2) {
        this.path = str;
        this.mimeType = str2;
    }

    public C6620c(String str, String str2, int i) {
        this.path = str;
        this.mimeType = str2;
        this.flag = i;
    }
}
