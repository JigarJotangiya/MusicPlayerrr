package com.coocent.music.base.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Album.kt */
public final class Album extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Album> CREATOR = new C2335a();

    /* renamed from: h */
    private long f8192h;

    /* renamed from: i */
    private String f8193i;

    /* renamed from: j */
    private int f8194j;

    /* renamed from: k */
    private String f8195k;

    /* renamed from: l */
    private long f8196l;

    /* renamed from: m */
    private int f8197m;

    /* renamed from: com.coocent.music.base.data.entity.Album$a */
    /* compiled from: Album.kt */
    public static final class C2335a implements Parcelable.Creator<Album> {
        /* renamed from: a */
        public final Album createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Album(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong());
        }

        /* renamed from: b */
        public final Album[] newArray(int i) {
            return new Album[i];
        }
    }

    public Album(long j, String str, int i, String str2, long j2) {
        this.f8192h = j;
        this.f8193i = str;
        this.f8194j = i;
        this.f8195k = str2;
        this.f8196l = j2;
    }

    /* renamed from: d */
    public final long mo9135d() {
        return this.f8196l;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo9137e() {
        String str = this.f8195k;
        return str == null ? "unKnow" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Album)) {
            return false;
        }
        Album album = (Album) obj;
        return this.f8192h == album.f8192h && C8594l.m46767a(this.f8193i, album.f8193i) && this.f8194j == album.f8194j && C8594l.m46767a(this.f8195k, album.f8195k) && this.f8196l == album.f8196l;
    }

    /* renamed from: f */
    public final long mo9139f() {
        return this.f8192h;
    }

    /* renamed from: g */
    public final int mo9140g() {
        return this.f8194j;
    }

    /* renamed from: h */
    public final String mo9141h() {
        String str = this.f8193i;
        return str == null ? "unKnow" : str;
    }

    public int hashCode() {
        int a = C1428c.m7501a(this.f8192h) * 31;
        String str = this.f8193i;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f8194j) * 31;
        String str2 = this.f8195k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + C1428c.m7501a(this.f8196l);
    }

    /* renamed from: i */
    public final int mo9143i() {
        return this.f8197m;
    }

    /* renamed from: j */
    public final void mo9144j(long j) {
        this.f8196l = j;
    }

    /* renamed from: k */
    public final void mo9145k(String str) {
        this.f8195k = str;
    }

    /* renamed from: l */
    public final void mo9146l(long j) {
        this.f8192h = j;
    }

    /* renamed from: m */
    public final void mo9147m(int i) {
        this.f8194j = i;
    }

    /* renamed from: n */
    public final void mo9148n(String str) {
        this.f8193i = str;
    }

    /* renamed from: o */
    public final void mo9149o(int i) {
        this.f8197m = i;
    }

    public String toString() {
        return "Album(id=" + this.f8192h + ", name=" + this.f8193i + ", musicCount=" + this.f8194j + ", artistName=" + this.f8195k + ", artistId=" + this.f8196l + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8192h);
        parcel.writeString(this.f8193i);
        parcel.writeInt(this.f8194j);
        parcel.writeString(this.f8195k);
        parcel.writeLong(this.f8196l);
    }

    public Album() {
        this(0, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, 0);
    }
}
