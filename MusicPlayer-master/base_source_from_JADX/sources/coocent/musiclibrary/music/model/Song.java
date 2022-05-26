package coocent.musiclibrary.music.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class Song implements Parcelable {
    public static final Parcelable.Creator<Song> CREATOR = new C7407a();

    /* renamed from: g */
    public long f32554g;

    /* renamed from: h */
    public String f32555h;

    /* renamed from: i */
    public long f32556i;

    /* renamed from: j */
    public String f32557j;

    /* renamed from: k */
    public int f32558k;

    /* renamed from: l */
    public long f32559l;

    /* renamed from: m */
    public String f32560m;

    /* renamed from: n */
    public int f32561n;

    /* renamed from: o */
    public String f32562o;

    /* renamed from: p */
    public Uri f32563p;

    /* renamed from: q */
    public int f32564q;

    /* renamed from: r */
    public boolean f32565r;

    /* renamed from: s */
    private String f32566s;

    /* renamed from: t */
    private int f32567t;

    /* renamed from: u */
    private String f32568u;

    /* renamed from: coocent.musiclibrary.music.model.Song$a */
    class C7407a implements Parcelable.Creator<Song> {
        C7407a() {
        }

        /* renamed from: a */
        public Song createFromParcel(Parcel parcel) {
            return new Song(parcel);
        }

        /* renamed from: b */
        public Song[] newArray(int i) {
            return new Song[i];
        }
    }

    public Song() {
        this.f32555h = BuildConfig.FLAVOR;
        this.f32557j = BuildConfig.FLAVOR;
        this.f32560m = BuildConfig.FLAVOR;
        this.f32562o = BuildConfig.FLAVOR;
        this.f32563p = null;
        this.f32559l = -1;
        this.f32554g = -1;
        this.f32556i = -1;
        this.f32560m = BuildConfig.FLAVOR;
        this.f32557j = BuildConfig.FLAVOR;
        this.f32555h = BuildConfig.FLAVOR;
        this.f32558k = -1;
        this.f32561n = -1;
        this.f32562o = BuildConfig.FLAVOR;
        this.f32563p = null;
    }

    /* renamed from: a */
    public int mo28239a() {
        return this.f32567t;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Song{id=" + this.f32559l + ",albumId=" + this.f32554g + ", albumName='" + this.f32555h + '\'' + ", artistId=" + this.f32556i + ", artistName='" + this.f32557j + '\'' + ", duration=" + this.f32558k + ", id=" + this.f32559l + ", title='" + this.f32560m + '\'' + ", trackNumber=" + this.f32561n + ", path='" + this.f32562o + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f32554g);
        parcel.writeString(this.f32555h);
        parcel.writeLong(this.f32556i);
        parcel.writeString(this.f32557j);
        parcel.writeInt(this.f32558k);
        parcel.writeLong(this.f32559l);
        parcel.writeString(this.f32560m);
        parcel.writeInt(this.f32561n);
        parcel.writeString(this.f32562o);
        parcel.writeInt(this.f32564q);
        parcel.writeByte(this.f32565r ? (byte) 1 : 0);
        parcel.writeString(this.f32566s);
        parcel.writeInt(this.f32567t);
        parcel.writeString(this.f32568u);
        Uri uri = this.f32563p;
        parcel.writeString(uri == null ? BuildConfig.FLAVOR : uri.toString());
    }

    protected Song(Parcel parcel) {
        this.f32555h = BuildConfig.FLAVOR;
        this.f32557j = BuildConfig.FLAVOR;
        this.f32560m = BuildConfig.FLAVOR;
        this.f32562o = BuildConfig.FLAVOR;
        Uri uri = null;
        this.f32563p = null;
        this.f32554g = parcel.readLong();
        this.f32555h = parcel.readString();
        this.f32556i = parcel.readLong();
        this.f32557j = parcel.readString();
        this.f32558k = parcel.readInt();
        this.f32559l = parcel.readLong();
        this.f32560m = parcel.readString();
        this.f32561n = parcel.readInt();
        this.f32562o = parcel.readString();
        this.f32564q = parcel.readInt();
        this.f32565r = parcel.readByte() != 0;
        this.f32566s = parcel.readString();
        this.f32567t = parcel.readInt();
        this.f32568u = parcel.readString();
        this.f32563p = parcel.readString() != null ? Uri.parse(parcel.readString()) : uri;
    }
}
