package com.p256kk.taurus.playerbase.p259c;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.kk.taurus.playerbase.c.a */
/* compiled from: DataSource */
public class C6618a implements Serializable {
    private String assetsPath;
    private String data;
    private HashMap<String, String> extra;

    /* renamed from: id */
    private long f30006id;
    private boolean isLive;
    private int rawId = -1;
    private String sid;
    private int startPos;
    private String tag;
    private C6620c timedTextSource;
    private String title;
    private Uri uri;

    public C6618a() {
    }

    public static Uri buildAssetsUri(String str) {
        return Uri.parse("file:///android_asset/" + str);
    }

    public static Uri buildRawPath(String str, int i) {
        return Uri.parse("android.resource://" + str + "/" + i);
    }

    public static AssetFileDescriptor getAssetsFileDescriptor(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return context.getAssets().openFd(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getAssetsPath() {
        return this.assetsPath;
    }

    public String getData() {
        return this.data;
    }

    public HashMap<String, String> getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.f30006id;
    }

    public int getRawId() {
        return this.rawId;
    }

    public String getSid() {
        return this.sid;
    }

    public int getStartPos() {
        return this.startPos;
    }

    public String getTag() {
        return this.tag;
    }

    public C6620c getTimedTextSource() {
        return this.timedTextSource;
    }

    public String getTitle() {
        return this.title;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isLive() {
        return this.isLive;
    }

    public void setAssetsPath(String str) {
        this.assetsPath = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setExtra(HashMap<String, String> hashMap) {
        this.extra = hashMap;
    }

    public void setId(long j) {
        this.f30006id = j;
    }

    public void setLive(boolean z) {
        this.isLive = z;
    }

    public void setRawId(int i) {
        this.rawId = i;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setStartPos(int i) {
        this.startPos = i;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTimedTextSource(C6620c cVar) {
        this.timedTextSource = cVar;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUri(Uri uri2) {
        this.uri = uri2;
    }

    public String toString() {
        return "DataSource{tag='" + this.tag + '\'' + ", sid='" + this.sid + '\'' + ", data='" + this.data + '\'' + ", title='" + this.title + '\'' + ", id=" + this.f30006id + ", uri=" + this.uri + ", extra=" + this.extra + ", timedTextSource=" + this.timedTextSource + ", assetsPath='" + this.assetsPath + '\'' + ", rawId=" + this.rawId + ", startPos=" + this.startPos + ", isLive=" + this.isLive + '}';
    }

    public C6618a(String str) {
        this.data = str;
    }

    public C6618a(String str, String str2) {
        this.tag = str;
        this.data = str2;
    }
}
