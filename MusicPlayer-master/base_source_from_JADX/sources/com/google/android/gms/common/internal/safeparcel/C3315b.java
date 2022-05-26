package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3315b {
    /* renamed from: a */
    public static int m14309a(@RecentlyNonNull Parcel parcel) {
        return m14328t(parcel, 20293);
    }

    /* renamed from: b */
    public static void m14310b(@RecentlyNonNull Parcel parcel, int i) {
        m14329u(parcel, i);
    }

    /* renamed from: c */
    public static void m14311c(@RecentlyNonNull Parcel parcel, int i, boolean z) {
        m14327s(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m14312d(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int t = m14328t(parcel, i);
            parcel.writeBundle(bundle);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m14313e(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int t = m14328t(parcel, i);
            parcel.writeByteArray(bArr);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m14314f(@RecentlyNonNull Parcel parcel, int i, float f) {
        m14327s(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: g */
    public static void m14315g(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int t = m14328t(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m14316h(@RecentlyNonNull Parcel parcel, int i, int i2) {
        m14327s(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: i */
    public static void m14317i(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int t = m14328t(parcel, i);
            parcel.writeIntArray(iArr);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m14318j(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<Integer> list, boolean z) {
        if (list != null) {
            int t = m14328t(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m14319k(@RecentlyNonNull Parcel parcel, int i, long j) {
        m14327s(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: l */
    public static void m14320l(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int t = m14328t(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m14321m(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int t = m14328t(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m14322n(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str != null) {
            int t = m14328t(parcel, i);
            parcel.writeString(str);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m14323o(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int t = m14328t(parcel, i);
            parcel.writeStringArray(strArr);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m14324p(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list != null) {
            int t = m14328t(parcel, i);
            parcel.writeStringList(list);
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static <T extends Parcelable> void m14325q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int t = m14328t(parcel, i);
            parcel.writeInt(r7);
            for (T t2 : tArr) {
                if (t2 == null) {
                    parcel.writeInt(0);
                } else {
                    m14330v(parcel, t2, i2);
                }
            }
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static <T extends Parcelable> void m14326r(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list != null) {
            int t = m14328t(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m14330v(parcel, parcelable, 0);
                }
            }
            m14329u(parcel, t);
        } else if (z) {
            m14327s(parcel, i, 0);
        }
    }

    /* renamed from: s */
    private static void m14327s(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: t */
    private static int m14328t(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: u */
    private static void m14329u(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: v */
    private static <T extends Parcelable> void m14330v(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
