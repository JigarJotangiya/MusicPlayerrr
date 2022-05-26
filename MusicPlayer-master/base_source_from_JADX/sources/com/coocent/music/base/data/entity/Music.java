package com.coocent.music.base.data.entity;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Music.kt */
public final class Music extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Music> CREATOR = new C2339a();

    /* renamed from: h */
    private long f8209h;

    /* renamed from: i */
    private long f8210i;

    /* renamed from: j */
    private long f8211j;

    /* renamed from: k */
    private String f8212k;

    /* renamed from: l */
    private String f8213l;

    /* renamed from: m */
    private String f8214m;

    /* renamed from: n */
    private String f8215n;

    /* renamed from: o */
    private int f8216o;

    /* renamed from: p */
    private long f8217p;

    /* renamed from: q */
    private Uri f8218q;

    /* renamed from: r */
    private boolean f8219r;

    /* renamed from: s */
    private int f8220s;

    /* renamed from: t */
    private int f8221t;

    /* renamed from: u */
    private String f8222u;

    /* renamed from: com.coocent.music.base.data.entity.Music$a */
    /* compiled from: Music.kt */
    public static final class C2339a implements Parcelable.Creator<Music> {
        /* renamed from: a */
        public final Music createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Music(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        /* renamed from: b */
        public final Music[] newArray(int i) {
            return new Music[i];
        }
    }

    public Music(long j, long j2, long j3, String str, String str2, String str3, String str4, int i, long j4) {
        this.f8209h = j;
        this.f8210i = j2;
        this.f8211j = j3;
        this.f8212k = str;
        this.f8213l = str2;
        this.f8214m = str3;
        this.f8215n = str4;
        this.f8216o = i;
        this.f8217p = j4;
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
        C8594l.m46770d(withAppendedId, "withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id)");
        this.f8218q = withAppendedId;
        this.f8222u = BuildConfig.FLAVOR;
    }

    /* renamed from: A */
    public final void mo9200A(long j) {
        this.f8217p = j;
    }

    /* renamed from: B */
    public final void mo9201B(int i) {
        this.f8221t = i;
    }

    /* renamed from: C */
    public final void mo9202C(String str) {
        this.f8212k = str;
    }

    /* renamed from: D */
    public final void mo9203D(Uri uri) {
        C8594l.m46771e(uri, "<set-?>");
        this.f8218q = uri;
    }

    /* renamed from: F */
    public final void mo9204F(int i) {
        this.f8220s = i;
    }

    /* renamed from: d */
    public final long mo9205d() {
        return this.f8211j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo9207e() {
        String str = this.f8214m;
        return str == null ? "unKnow" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        return this.f8209h == music.f8209h && this.f8210i == music.f8210i && this.f8211j == music.f8211j && C8594l.m46767a(this.f8212k, music.f8212k) && C8594l.m46767a(this.f8213l, music.f8213l) && C8594l.m46767a(this.f8214m, music.f8214m) && C8594l.m46767a(this.f8215n, music.f8215n) && this.f8216o == music.f8216o && this.f8217p == music.f8217p;
    }

    /* renamed from: f */
    public final long mo9209f() {
        return this.f8210i;
    }

    /* renamed from: g */
    public final String mo9210g() {
        String str = this.f8213l;
        return str == null ? "unKnow" : str;
    }

    /* renamed from: h */
    public final String mo9211h() {
        String str = this.f8215n;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        int a = ((((C1428c.m7501a(this.f8209h) * 31) + C1428c.m7501a(this.f8210i)) * 31) + C1428c.m7501a(this.f8211j)) * 31;
        String str = this.f8212k;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8213l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8214m;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8215n;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((hashCode3 + i) * 31) + this.f8216o) * 31) + C1428c.m7501a(this.f8217p);
    }

    /* renamed from: i */
    public final String mo9213i() {
        return this.f8222u;
    }

    /* renamed from: j */
    public final int mo9214j() {
        return this.f8216o;
    }

    /* renamed from: k */
    public final long mo9215k() {
        return this.f8209h;
    }

    /* renamed from: l */
    public final long mo9216l() {
        return this.f8217p;
    }

    /* renamed from: m */
    public final int mo9217m() {
        return this.f8221t;
    }

    /* renamed from: n */
    public final String mo9218n() {
        String str = this.f8212k;
        return str == null ? "unKnow" : str;
    }

    /* renamed from: o */
    public final Uri mo9219o() {
        return this.f8218q;
    }

    /* renamed from: p */
    public final int mo9220p() {
        return this.f8220s;
    }

    /* renamed from: q */
    public final boolean mo9221q() {
        return this.f8219r;
    }

    /* renamed from: r */
    public final void mo9222r(long j) {
        this.f8211j = j;
    }

    /* renamed from: s */
    public final void mo9223s(String str) {
        this.f8214m = str;
    }

    /* renamed from: t */
    public final void mo9224t(String str) {
        this.f8213l = str;
    }

    public String toString() {
        return "Music(id=" + this.f8209h + ", artistId=" + this.f8210i + ", albumId=" + this.f8211j + ", title=" + this.f8212k + ", artistName=" + this.f8213l + ", albumName=" + this.f8214m + ", data=" + this.f8215n + ", duration=" + this.f8216o + ", size=" + this.f8217p + ')';
    }

    /* renamed from: u */
    public final void mo9226u(String str) {
        this.f8215n = str;
    }

    /* renamed from: v */
    public final void mo9227v(int i) {
    }

    /* renamed from: w */
    public final void mo9228w(String str) {
        C8594l.m46771e(str, "<set-?>");
        this.f8222u = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8209h);
        parcel.writeLong(this.f8210i);
        parcel.writeLong(this.f8211j);
        parcel.writeString(this.f8212k);
        parcel.writeString(this.f8213l);
        parcel.writeString(this.f8214m);
        parcel.writeString(this.f8215n);
        parcel.writeInt(this.f8216o);
        parcel.writeLong(this.f8217p);
    }

    /* renamed from: x */
    public final void mo9230x(int i) {
        this.f8216o = i;
    }

    /* renamed from: y */
    public final void mo9231y(long j) {
        this.f8209h = j;
    }

    /* renamed from: z */
    public final void mo9232z(boolean z) {
        this.f8219r = z;
    }

    public Music() {
        this(0, 0, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
    }
}
