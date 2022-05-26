package com.coocent.music.base.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Artist.kt */
public final class Artist extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Artist> CREATOR = new C2336a();

    /* renamed from: h */
    private long f8198h;

    /* renamed from: i */
    private String f8199i;

    /* renamed from: j */
    private int f8200j;

    /* renamed from: k */
    private int f8201k;

    /* renamed from: com.coocent.music.base.data.entity.Artist$a */
    /* compiled from: Artist.kt */
    public static final class C2336a implements Parcelable.Creator<Artist> {
        /* renamed from: a */
        public final Artist createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Artist(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final Artist[] newArray(int i) {
            return new Artist[i];
        }
    }

    public Artist(long j, String str, int i, int i2) {
        this.f8198h = j;
        this.f8199i = str;
        this.f8200j = i;
        this.f8201k = i2;
    }

    /* renamed from: d */
    public final int mo9156d() {
        return this.f8201k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo9158e() {
        return this.f8198h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        return this.f8198h == artist.f8198h && C8594l.m46767a(this.f8199i, artist.f8199i) && this.f8200j == artist.f8200j && this.f8201k == artist.f8201k;
    }

    /* renamed from: f */
    public final int mo9160f() {
        return this.f8200j;
    }

    /* renamed from: g */
    public final String mo9161g() {
        String str = this.f8199i;
        return str == null ? "unKnow" : str;
    }

    /* renamed from: h */
    public final void mo9162h(int i) {
        this.f8201k = i;
    }

    public int hashCode() {
        int a = C1428c.m7501a(this.f8198h) * 31;
        String str = this.f8199i;
        return ((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f8200j) * 31) + this.f8201k;
    }

    /* renamed from: i */
    public final void mo9164i(long j) {
        this.f8198h = j;
    }

    /* renamed from: j */
    public final void mo9165j(int i) {
        this.f8200j = i;
    }

    /* renamed from: k */
    public final void mo9166k(String str) {
        this.f8199i = str;
    }

    public String toString() {
        return "Artist(id=" + this.f8198h + ", name=" + this.f8199i + ", musicCount=" + this.f8200j + ", albumCount=" + this.f8201k + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8198h);
        parcel.writeString(this.f8199i);
        parcel.writeInt(this.f8200j);
        parcel.writeInt(this.f8201k);
    }

    public Artist() {
        this(0, BuildConfig.FLAVOR, 0, 0);
    }
}
