package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.l */
/* compiled from: Logger */
public abstract class C1405l {

    /* renamed from: a */
    private static C1405l f5464a = null;

    /* renamed from: b */
    private static final int f5465b = 20;

    /* renamed from: androidx.work.l$a */
    /* compiled from: Logger */
    public static class C1406a extends C1405l {

        /* renamed from: c */
        private int f5466c;

        public C1406a(int i) {
            super(i);
            this.f5466c = i;
        }

        /* renamed from: a */
        public void mo6816a(String str, String str2, Throwable... thArr) {
            if (this.f5466c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo6817b(String str, String str2, Throwable... thArr) {
            if (this.f5466c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo6818d(String str, String str2, Throwable... thArr) {
            if (this.f5466c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: g */
        public void mo6819g(String str, String str2, Throwable... thArr) {
            if (this.f5466c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: h */
        public void mo6820h(String str, String str2, Throwable... thArr) {
            if (this.f5466c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C1405l(int i) {
    }

    /* renamed from: c */
    public static synchronized C1405l m7460c() {
        C1405l lVar;
        synchronized (C1405l.class) {
            if (f5464a == null) {
                f5464a = new C1406a(3);
            }
            lVar = f5464a;
        }
        return lVar;
    }

    /* renamed from: e */
    public static synchronized void m7461e(C1405l lVar) {
        synchronized (C1405l.class) {
            f5464a = lVar;
        }
    }

    /* renamed from: f */
    public static String m7462f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f5465b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo6816a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo6817b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo6818d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo6819g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo6820h(String str, String str2, Throwable... thArr);
}
