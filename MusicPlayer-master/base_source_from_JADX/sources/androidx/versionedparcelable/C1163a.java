package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: ParcelUtils */
public class C1163a {
    private C1163a() {
    }

    /* renamed from: a */
    public static <T extends C1166d> T m6518a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo6135a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends C1166d> T m6519b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C1163a.class.getClassLoader());
            return m6518a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m6520c(Bundle bundle, String str, C1166d dVar) {
        if (dVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m6521d(dVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: d */
    public static Parcelable m6521d(C1166d dVar) {
        return new ParcelImpl(dVar);
    }
}
