package androidx.work;

import android.os.Build;
import androidx.work.C1423w;

/* renamed from: androidx.work.n */
/* compiled from: OneTimeWorkRequest */
public final class C1408n extends C1423w {

    /* renamed from: androidx.work.n$a */
    /* compiled from: OneTimeWorkRequest */
    public static final class C1409a extends C1423w.C1424a<C1409a, C1408n> {
        public C1409a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f5478c.f5316d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C1423w.C1424a mo6822d() {
            mo6824h();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1408n mo6821c() {
            if (!this.f5476a || Build.VERSION.SDK_INT < 23 || !this.f5478c.f5322j.mo6481h()) {
                return new C1408n(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1409a mo6824h() {
            return this;
        }
    }

    C1408n(C1409a aVar) {
        super(aVar.f5477b, aVar.f5478c, aVar.f5479d);
    }

    /* renamed from: d */
    public static C1408n m7473d(Class<? extends ListenableWorker> cls) {
        return (C1408n) new C1409a(cls).mo6835b();
    }
}
