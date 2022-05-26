package com.coocent.music.base.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Playlist.kt */
public final class Playlist extends C2342b implements Parcelable {
    public static final Parcelable.Creator<Playlist> CREATOR = new C2340a();

    /* renamed from: h */
    private long f8223h;

    /* renamed from: i */
    private String f8224i;

    /* renamed from: j */
    private int f8225j;

    /* renamed from: k */
    private boolean f8226k;

    /* renamed from: l */
    private long[] f8227l;

    /* renamed from: m */
    private String f8228m;

    /* renamed from: n */
    private String f8229n;

    /* renamed from: o */
    private boolean f8230o;

    /* renamed from: com.coocent.music.base.data.entity.Playlist$a */
    /* compiled from: Playlist.kt */
    public static final class C2340a implements Parcelable.Creator<Playlist> {
        /* renamed from: a */
        public final Playlist createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new Playlist(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.createLongArray());
        }

        /* renamed from: b */
        public final Playlist[] newArray(int i) {
            return new Playlist[i];
        }
    }

    public Playlist(long j, String str, int i, boolean z, long[] jArr) {
        C8594l.m46771e(jArr, "musicIds");
        this.f8223h = j;
        this.f8224i = str;
        this.f8225j = i;
        this.f8226k = z;
        this.f8227l = jArr;
        this.f8228m = BuildConfig.FLAVOR;
        this.f8229n = BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public final String mo9237d() {
        return this.f8229n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo9239e() {
        return this.f8223h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8594l.m46767a(Playlist.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.coocent.music.base.data.entity.Playlist");
        Playlist playlist = (Playlist) obj;
        return this.f8223h == playlist.f8223h && C8594l.m46767a(this.f8224i, playlist.f8224i) && this.f8225j == playlist.f8225j && this.f8226k == playlist.f8226k && Arrays.equals(this.f8227l, playlist.f8227l);
    }

    /* renamed from: f */
    public final long[] mo9241f() {
        return this.f8227l;
    }

    /* renamed from: g */
    public final String mo9242g() {
        String str = this.f8224i;
        return str == null ? "unKnow" : str;
    }

    /* renamed from: h */
    public final int mo9243h() {
        return this.f8225j;
    }

    public int hashCode() {
        int a = C1428c.m7501a(this.f8223h) * 31;
        String str = this.f8224i;
        return ((((((a + (str != null ? str.hashCode() : 0)) * 31) + this.f8225j) * 31) + C1427b.m7500a(this.f8226k)) * 31) + Arrays.hashCode(this.f8227l);
    }

    /* renamed from: i */
    public final String mo9245i() {
        return this.f8228m;
    }

    /* renamed from: j */
    public final boolean mo9246j() {
        return this.f8230o;
    }

    /* renamed from: k */
    public final void mo9247k(String str) {
        C8594l.m46771e(str, "<set-?>");
        this.f8229n = str;
    }

    /* renamed from: l */
    public final void mo9248l(boolean z) {
        this.f8230o = z;
    }

    /* renamed from: m */
    public final void mo9249m(long j) {
        this.f8223h = j;
    }

    /* renamed from: n */
    public final void mo9250n(long[] jArr) {
        C8594l.m46771e(jArr, "<set-?>");
        this.f8227l = jArr;
    }

    /* renamed from: o */
    public final void mo9251o(String str) {
        C8594l.m46771e(str, "name");
        this.f8224i = str;
    }

    /* renamed from: p */
    public final void mo9252p(int i) {
        this.f8225j = i;
    }

    /* renamed from: q */
    public final void mo9253q(String str) {
        C8594l.m46771e(str, "<set-?>");
        this.f8228m = str;
    }

    public String toString() {
        return "Playlist(id=" + this.f8223h + ", name=" + this.f8224i + ", songCount=" + this.f8225j + ", isSelect=" + this.f8226k + ", musicIds=" + Arrays.toString(this.f8227l) + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeLong(this.f8223h);
        parcel.writeString(this.f8224i);
        parcel.writeInt(this.f8225j);
        parcel.writeInt(this.f8226k ? 1 : 0);
        parcel.writeLongArray(this.f8227l);
    }

    public Playlist() {
        this(0, BuildConfig.FLAVOR, 0, false, new long[0]);
    }
}
