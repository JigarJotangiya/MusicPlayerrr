package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzapg implements Parcelable {
    public static final Parcelable.Creator<zzapg> CREATOR = new C5334me();

    /* renamed from: A */
    public final int f27114A;

    /* renamed from: B */
    public final int f27115B;

    /* renamed from: C */
    public final long f27116C;

    /* renamed from: D */
    public final int f27117D;

    /* renamed from: E */
    public final String f27118E;

    /* renamed from: F */
    public final int f27119F;

    /* renamed from: G */
    private int f27120G;

    /* renamed from: g */
    public final String f27121g;

    /* renamed from: h */
    public final int f27122h;

    /* renamed from: i */
    public final String f27123i;

    /* renamed from: j */
    public final zzatr f27124j;

    /* renamed from: k */
    public final String f27125k;

    /* renamed from: l */
    public final String f27126l;

    /* renamed from: m */
    public final int f27127m;

    /* renamed from: n */
    public final List<byte[]> f27128n;

    /* renamed from: o */
    public final zzarf f27129o;

    /* renamed from: p */
    public final int f27130p;

    /* renamed from: q */
    public final int f27131q;

    /* renamed from: r */
    public final float f27132r;

    /* renamed from: s */
    public final int f27133s;

    /* renamed from: t */
    public final float f27134t;

    /* renamed from: u */
    public final int f27135u;

    /* renamed from: v */
    public final byte[] f27136v;

    /* renamed from: w */
    public final zzaxe f27137w;

    /* renamed from: x */
    public final int f27138x;

    /* renamed from: y */
    public final int f27139y;

    /* renamed from: z */
    public final int f27140z;

    zzapg(Parcel parcel) {
        this.f27121g = parcel.readString();
        this.f27125k = parcel.readString();
        this.f27126l = parcel.readString();
        this.f27123i = parcel.readString();
        this.f27122h = parcel.readInt();
        this.f27127m = parcel.readInt();
        this.f27130p = parcel.readInt();
        this.f27131q = parcel.readInt();
        this.f27132r = parcel.readFloat();
        this.f27133s = parcel.readInt();
        this.f27134t = parcel.readFloat();
        this.f27136v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f27135u = parcel.readInt();
        this.f27137w = (zzaxe) parcel.readParcelable(zzaxe.class.getClassLoader());
        this.f27138x = parcel.readInt();
        this.f27139y = parcel.readInt();
        this.f27140z = parcel.readInt();
        this.f27114A = parcel.readInt();
        this.f27115B = parcel.readInt();
        this.f27117D = parcel.readInt();
        this.f27118E = parcel.readString();
        this.f27119F = parcel.readInt();
        this.f27116C = parcel.readLong();
        int readInt = parcel.readInt();
        this.f27128n = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f27128n.add(parcel.createByteArray());
        }
        this.f27129o = (zzarf) parcel.readParcelable(zzarf.class.getClassLoader());
        this.f27124j = (zzatr) parcel.readParcelable(zzatr.class.getClassLoader());
    }

    /* renamed from: h */
    public static zzapg m34919h(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzarf zzarf, int i5, String str4) {
        return m34920i(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List<byte[]>) null, zzarf, 0, str4, (zzatr) null);
    }

    /* renamed from: i */
    public static zzapg m34920i(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, zzarf zzarf, int i8, String str4, zzatr zzatr) {
        return new zzapg(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    /* renamed from: j */
    public static zzapg m34921j(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzarf zzarf) {
        return new zzapg(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    /* renamed from: k */
    public static zzapg m34922k(String str, String str2, String str3, int i, zzarf zzarf) {
        return new zzapg(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, zzarf, (zzatr) null);
    }

    /* renamed from: l */
    public static zzapg m34923l(String str, String str2, String str3, int i, int i2, String str4, int i3, zzarf zzarf, long j, List<byte[]> list) {
        return new zzapg(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzaxe) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzarf, (zzatr) null);
    }

    /* renamed from: m */
    public static zzapg m34924m(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzaxe zzaxe, zzarf zzarf) {
        return new zzapg(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzaxe, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzarf, (zzatr) null);
    }

    @TargetApi(16)
    /* renamed from: n */
    private static void m34925n(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public final int mo22480a() {
        int i;
        int i2 = this.f27130p;
        if (i2 == -1 || (i = this.f27131q) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat mo22481b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f27126l);
        String str = this.f27118E;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m34925n(mediaFormat, "max-input-size", this.f27127m);
        m34925n(mediaFormat, "width", this.f27130p);
        m34925n(mediaFormat, "height", this.f27131q);
        float f = this.f27132r;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m34925n(mediaFormat, "rotation-degrees", this.f27133s);
        m34925n(mediaFormat, "channel-count", this.f27138x);
        m34925n(mediaFormat, "sample-rate", this.f27139y);
        m34925n(mediaFormat, "encoder-delay", this.f27114A);
        m34925n(mediaFormat, "encoder-padding", this.f27115B);
        for (int i = 0; i < this.f27128n.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f27128n.get(i)));
        }
        zzaxe zzaxe = this.f27137w;
        if (zzaxe != null) {
            m34925n(mediaFormat, "color-transfer", zzaxe.f27162i);
            m34925n(mediaFormat, "color-standard", zzaxe.f27160g);
            m34925n(mediaFormat, "color-range", zzaxe.f27161h);
            byte[] bArr = zzaxe.f27163j;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final zzapg mo22482d(zzarf zzarf) {
        String str = this.f27121g;
        return new zzapg(str, this.f27125k, this.f27126l, this.f27123i, this.f27122h, this.f27127m, this.f27130p, this.f27131q, this.f27132r, this.f27133s, this.f27134t, this.f27136v, this.f27135u, this.f27137w, this.f27138x, this.f27139y, this.f27140z, this.f27114A, this.f27115B, this.f27117D, this.f27118E, this.f27119F, this.f27116C, this.f27128n, zzarf, this.f27124j);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzapg mo22484e(int i, int i2) {
        String str = this.f27121g;
        return new zzapg(str, this.f27125k, this.f27126l, this.f27123i, this.f27122h, this.f27127m, this.f27130p, this.f27131q, this.f27132r, this.f27133s, this.f27134t, this.f27136v, this.f27135u, this.f27137w, this.f27138x, this.f27139y, this.f27140z, i, i2, this.f27117D, this.f27118E, this.f27119F, this.f27116C, this.f27128n, this.f27129o, this.f27124j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapg.class == obj.getClass()) {
            zzapg zzapg = (zzapg) obj;
            if (this.f27122h == zzapg.f27122h && this.f27127m == zzapg.f27127m && this.f27130p == zzapg.f27130p && this.f27131q == zzapg.f27131q && this.f27132r == zzapg.f27132r && this.f27133s == zzapg.f27133s && this.f27134t == zzapg.f27134t && this.f27135u == zzapg.f27135u && this.f27138x == zzapg.f27138x && this.f27139y == zzapg.f27139y && this.f27140z == zzapg.f27140z && this.f27114A == zzapg.f27114A && this.f27115B == zzapg.f27115B && this.f27116C == zzapg.f27116C && this.f27117D == zzapg.f27117D && C4934bm.m21445o(this.f27121g, zzapg.f27121g) && C4934bm.m21445o(this.f27118E, zzapg.f27118E) && this.f27119F == zzapg.f27119F && C4934bm.m21445o(this.f27125k, zzapg.f27125k) && C4934bm.m21445o(this.f27126l, zzapg.f27126l) && C4934bm.m21445o(this.f27123i, zzapg.f27123i) && C4934bm.m21445o(this.f27129o, zzapg.f27129o) && C4934bm.m21445o(this.f27124j, zzapg.f27124j) && C4934bm.m21445o(this.f27137w, zzapg.f27137w) && Arrays.equals(this.f27136v, zzapg.f27136v) && this.f27128n.size() == zzapg.f27128n.size()) {
                for (int i = 0; i < this.f27128n.size(); i++) {
                    if (!Arrays.equals(this.f27128n.get(i), zzapg.f27128n.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final zzapg mo22486f(int i) {
        String str = this.f27121g;
        return new zzapg(str, this.f27125k, this.f27126l, this.f27123i, this.f27122h, i, this.f27130p, this.f27131q, this.f27132r, this.f27133s, this.f27134t, this.f27136v, this.f27135u, this.f27137w, this.f27138x, this.f27139y, this.f27140z, this.f27114A, this.f27115B, this.f27117D, this.f27118E, this.f27119F, this.f27116C, this.f27128n, this.f27129o, this.f27124j);
    }

    /* renamed from: g */
    public final zzapg mo22487g(zzatr zzatr) {
        String str = this.f27121g;
        return new zzapg(str, this.f27125k, this.f27126l, this.f27123i, this.f27122h, this.f27127m, this.f27130p, this.f27131q, this.f27132r, this.f27133s, this.f27134t, this.f27136v, this.f27135u, this.f27137w, this.f27138x, this.f27139y, this.f27140z, this.f27114A, this.f27115B, this.f27117D, this.f27118E, this.f27119F, this.f27116C, this.f27128n, this.f27129o, zzatr);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f27120G;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f27121g;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.f27125k;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.f27126l;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str4 = this.f27123i;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i12 = (((((((((((i11 + i4) * 31) + this.f27122h) * 31) + this.f27130p) * 31) + this.f27131q) * 31) + this.f27138x) * 31) + this.f27139y) * 31;
        String str5 = this.f27118E;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (((i12 + i5) * 31) + this.f27119F) * 31;
        zzarf zzarf = this.f27129o;
        if (zzarf == null) {
            i6 = 0;
        } else {
            i6 = zzarf.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        zzatr zzatr = this.f27124j;
        if (zzatr != null) {
            i8 = zzatr.hashCode();
        }
        int i15 = i14 + i8;
        this.f27120G = i15;
        return i15;
    }

    public final String toString() {
        String str = this.f27121g;
        String str2 = this.f27125k;
        String str3 = this.f27126l;
        int i = this.f27122h;
        String str4 = this.f27118E;
        int i2 = this.f27130p;
        int i3 = this.f27131q;
        float f = this.f27132r;
        int i4 = this.f27138x;
        int i5 = this.f27139y;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27121g);
        parcel.writeString(this.f27125k);
        parcel.writeString(this.f27126l);
        parcel.writeString(this.f27123i);
        parcel.writeInt(this.f27122h);
        parcel.writeInt(this.f27127m);
        parcel.writeInt(this.f27130p);
        parcel.writeInt(this.f27131q);
        parcel.writeFloat(this.f27132r);
        parcel.writeInt(this.f27133s);
        parcel.writeFloat(this.f27134t);
        parcel.writeInt(this.f27136v != null ? 1 : 0);
        byte[] bArr = this.f27136v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f27135u);
        parcel.writeParcelable(this.f27137w, i);
        parcel.writeInt(this.f27138x);
        parcel.writeInt(this.f27139y);
        parcel.writeInt(this.f27140z);
        parcel.writeInt(this.f27114A);
        parcel.writeInt(this.f27115B);
        parcel.writeInt(this.f27117D);
        parcel.writeString(this.f27118E);
        parcel.writeInt(this.f27119F);
        parcel.writeLong(this.f27116C);
        int size = this.f27128n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f27128n.get(i2));
        }
        parcel.writeParcelable(this.f27129o, 0);
        parcel.writeParcelable(this.f27124j, 0);
    }

    zzapg(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzaxe zzaxe, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzarf zzarf, zzatr zzatr) {
        this.f27121g = str;
        this.f27125k = str2;
        this.f27126l = str3;
        this.f27123i = str4;
        this.f27122h = i;
        this.f27127m = i2;
        this.f27130p = i3;
        this.f27131q = i4;
        this.f27132r = f;
        this.f27133s = i5;
        this.f27134t = f2;
        this.f27136v = bArr;
        this.f27135u = i6;
        this.f27137w = zzaxe;
        this.f27138x = i7;
        this.f27139y = i8;
        this.f27140z = i9;
        this.f27114A = i10;
        this.f27115B = i11;
        this.f27117D = i12;
        this.f27118E = str5;
        this.f27119F = i13;
        this.f27116C = j;
        this.f27128n = list == null ? Collections.emptyList() : list;
        this.f27129o = zzarf;
        this.f27124j = zzatr;
    }
}
