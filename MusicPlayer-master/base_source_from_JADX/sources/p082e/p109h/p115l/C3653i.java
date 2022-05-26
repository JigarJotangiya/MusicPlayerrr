package p082e.p109h.p115l;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: e.h.l.i */
/* compiled from: ParcelableCompat */
public final class C3653i {

    /* renamed from: e.h.l.i$a */
    /* compiled from: ParcelableCompat */
    static class C3654a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a */
        private final C3655j<T> f11625a;

        C3654a(C3655j<T> jVar) {
            this.f11625a = jVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f11625a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T[] newArray(int i) {
            return this.f11625a.newArray(i);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f11625a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m15716a(C3655j<T> jVar) {
        return new C3654a(jVar);
    }
}
