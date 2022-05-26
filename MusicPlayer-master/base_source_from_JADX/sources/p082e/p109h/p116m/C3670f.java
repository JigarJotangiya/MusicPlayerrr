package p082e.p109h.p116m;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.h.m.f */
/* compiled from: FontsContractCompat */
public class C3670f {

    /* renamed from: e.h.m.f$a */
    /* compiled from: FontsContractCompat */
    public static class C3671a {

        /* renamed from: a */
        private final int f11655a;

        /* renamed from: b */
        private final C3672b[] f11656b;

        @Deprecated
        public C3671a(int i, C3672b[] bVarArr) {
            this.f11655a = i;
            this.f11656b = bVarArr;
        }

        /* renamed from: a */
        static C3671a m15748a(int i, C3672b[] bVarArr) {
            return new C3671a(i, bVarArr);
        }

        /* renamed from: b */
        public C3672b[] mo12945b() {
            return this.f11656b;
        }

        /* renamed from: c */
        public int mo12946c() {
            return this.f11655a;
        }
    }

    /* renamed from: e.h.m.f$b */
    /* compiled from: FontsContractCompat */
    public static class C3672b {

        /* renamed from: a */
        private final Uri f11657a;

        /* renamed from: b */
        private final int f11658b;

        /* renamed from: c */
        private final int f11659c;

        /* renamed from: d */
        private final boolean f11660d;

        /* renamed from: e */
        private final int f11661e;

        @Deprecated
        public C3672b(Uri uri, int i, int i2, boolean z, int i3) {
            C3703i.m15827d(uri);
            this.f11657a = uri;
            this.f11658b = i;
            this.f11659c = i2;
            this.f11660d = z;
            this.f11661e = i3;
        }

        /* renamed from: a */
        static C3672b m15751a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C3672b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo12947b() {
            return this.f11661e;
        }

        /* renamed from: c */
        public int mo12948c() {
            return this.f11658b;
        }

        /* renamed from: d */
        public Uri mo12949d() {
            return this.f11657a;
        }

        /* renamed from: e */
        public int mo12950e() {
            return this.f11659c;
        }

        /* renamed from: f */
        public boolean mo12951f() {
            return this.f11660d;
        }
    }

    /* renamed from: e.h.m.f$c */
    /* compiled from: FontsContractCompat */
    public static class C3673c {
        /* renamed from: a */
        public void mo12883a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo12884b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m15747a(Context context, C3663d dVar, int i, boolean z, int i2, Handler handler, C3673c cVar) {
        C3657a aVar = new C3657a(cVar, handler);
        if (z) {
            return C3664e.m15741e(context, dVar, aVar, i, i2);
        }
        return C3664e.m15740d(context, dVar, i, (Executor) null, aVar);
    }
}
