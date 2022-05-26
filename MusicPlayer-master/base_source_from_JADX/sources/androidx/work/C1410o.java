package androidx.work;

import android.annotation.SuppressLint;

/* renamed from: androidx.work.o */
/* compiled from: Operation */
public interface C1410o {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C1412b.C1415c f5468a = new C1412b.C1415c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C1412b.C1414b f5469b = new C1412b.C1414b();

    /* renamed from: androidx.work.o$b */
    /* compiled from: Operation */
    public static abstract class C1412b {

        /* renamed from: androidx.work.o$b$a */
        /* compiled from: Operation */
        public static final class C1413a extends C1412b {

            /* renamed from: a */
            private final Throwable f5470a;

            public C1413a(Throwable th) {
                this.f5470a = th;
            }

            /* renamed from: a */
            public Throwable mo6825a() {
                return this.f5470a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f5470a.getMessage()});
            }
        }

        /* renamed from: androidx.work.o$b$b */
        /* compiled from: Operation */
        public static final class C1414b extends C1412b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C1414b() {
            }
        }

        /* renamed from: androidx.work.o$b$c */
        /* compiled from: Operation */
        public static final class C1415c extends C1412b {
            public String toString() {
                return "SUCCESS";
            }

            private C1415c() {
            }
        }

        C1412b() {
        }
    }
}
