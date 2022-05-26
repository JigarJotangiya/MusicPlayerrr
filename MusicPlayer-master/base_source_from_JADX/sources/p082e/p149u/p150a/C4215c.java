package p082e.p149u.p150a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* renamed from: e.u.a.c */
/* compiled from: SupportSQLiteOpenHelper */
public interface C4215c extends Closeable {

    /* renamed from: e.u.a.c$a */
    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class C4216a {

        /* renamed from: a */
        public final int f12595a;

        public C4216a(int i) {
            this.f12595a = i;
        }

        /* renamed from: a */
        private void m18568a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        /* renamed from: b */
        public void mo5610b(C4214b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m18568a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m18568a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo14405c(p082e.p149u.p150a.C4214b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.m18568a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.mo5541n()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m18568a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.m18568a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m18568a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.getPath()
                r2.m18568a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p149u.p150a.C4215c.C4216a.mo14405c(e.u.a.b):void");
        }

        /* renamed from: d */
        public abstract void mo5611d(C4214b bVar);

        /* renamed from: e */
        public void mo5612e(C4214b bVar, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* renamed from: f */
        public void mo5613f(C4214b bVar) {
        }

        /* renamed from: g */
        public abstract void mo5614g(C4214b bVar, int i, int i2);
    }

    /* renamed from: e.u.a.c$b */
    /* compiled from: SupportSQLiteOpenHelper */
    public static class C4217b {

        /* renamed from: a */
        public final Context f12596a;

        /* renamed from: b */
        public final String f12597b;

        /* renamed from: c */
        public final C4216a f12598c;

        /* renamed from: d */
        public final boolean f12599d;

        /* renamed from: e.u.a.c$b$a */
        /* compiled from: SupportSQLiteOpenHelper */
        public static class C4218a {

            /* renamed from: a */
            Context f12600a;

            /* renamed from: b */
            String f12601b;

            /* renamed from: c */
            C4216a f12602c;

            /* renamed from: d */
            boolean f12603d;

            C4218a(Context context) {
                this.f12600a = context;
            }

            /* renamed from: a */
            public C4217b mo14406a() {
                if (this.f12602c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f12600a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f12603d || !TextUtils.isEmpty(this.f12601b)) {
                    return new C4217b(this.f12600a, this.f12601b, this.f12602c, this.f12603d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            /* renamed from: b */
            public C4218a mo14407b(C4216a aVar) {
                this.f12602c = aVar;
                return this;
            }

            /* renamed from: c */
            public C4218a mo14408c(String str) {
                this.f12601b = str;
                return this;
            }

            /* renamed from: d */
            public C4218a mo14409d(boolean z) {
                this.f12603d = z;
                return this;
            }
        }

        C4217b(Context context, String str, C4216a aVar, boolean z) {
            this.f12596a = context;
            this.f12597b = str;
            this.f12598c = aVar;
            this.f12599d = z;
        }

        /* renamed from: a */
        public static C4218a m18575a(Context context) {
            return new C4218a(context);
        }
    }

    /* renamed from: e.u.a.c$c */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C4219c {
        /* renamed from: a */
        C4215c mo5440a(C4217b bVar);
    }

    /* renamed from: R */
    C4214b mo5550R();

    /* renamed from: V */
    C4214b mo5551V();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
