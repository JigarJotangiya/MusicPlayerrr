package p082e.p149u.p150a.p151g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

/* renamed from: e.u.a.g.b */
/* compiled from: FrameworkSQLiteOpenHelper */
class C4226b implements C4215c {

    /* renamed from: g */
    private final Context f12608g;

    /* renamed from: h */
    private final String f12609h;

    /* renamed from: i */
    private final C4215c.C4216a f12610i;

    /* renamed from: j */
    private final boolean f12611j;

    /* renamed from: k */
    private final Object f12612k = new Object();

    /* renamed from: l */
    private C4227a f12613l;

    /* renamed from: m */
    private boolean f12614m;

    /* renamed from: e.u.a.g.b$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class C4227a extends SQLiteOpenHelper {

        /* renamed from: g */
        final C4223a[] f12615g;

        /* renamed from: h */
        final C4215c.C4216a f12616h;

        /* renamed from: i */
        private boolean f12617i;

        /* renamed from: e.u.a.g.b$a$a */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C4228a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C4215c.C4216a f12618a;

            /* renamed from: b */
            final /* synthetic */ C4223a[] f12619b;

            C4228a(C4215c.C4216a aVar, C4223a[] aVarArr) {
                this.f12618a = aVar;
                this.f12619b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f12618a.mo14405c(C4227a.m18607p(this.f12619b, sQLiteDatabase));
            }
        }

        C4227a(Context context, String str, C4223a[] aVarArr, C4215c.C4216a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f12595a, new C4228a(aVar, aVarArr));
            this.f12616h = aVar;
            this.f12615g = aVarArr;
        }

        /* renamed from: p */
        static C4223a m18607p(C4223a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C4223a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo14410c(sQLiteDatabase)) {
                aVarArr[0] = new C4223a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized C4214b mo14414c() {
            this.f12617i = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.f12617i) {
                close();
                return mo14414c();
            }
            return mo14416d(readableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f12615g[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4223a mo14416d(SQLiteDatabase sQLiteDatabase) {
            return m18607p(this.f12615g, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f12616h.mo5610b(mo14416d(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f12616h.mo5611d(mo14416d(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f12617i = true;
            this.f12616h.mo5612e(mo14416d(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f12617i) {
                this.f12616h.mo5613f(mo14416d(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f12617i = true;
            this.f12616h.mo5614g(mo14416d(sQLiteDatabase), i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public synchronized C4214b mo14422x() {
            this.f12617i = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f12617i) {
                close();
                return mo14422x();
            }
            return mo14416d(writableDatabase);
        }
    }

    C4226b(Context context, String str, C4215c.C4216a aVar, boolean z) {
        this.f12608g = context;
        this.f12609h = str;
        this.f12610i = aVar;
        this.f12611j = z;
    }

    /* renamed from: c */
    private C4227a m18604c() {
        C4227a aVar;
        synchronized (this.f12612k) {
            if (this.f12613l == null) {
                C4223a[] aVarArr = new C4223a[1];
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || this.f12609h == null || !this.f12611j) {
                    this.f12613l = new C4227a(this.f12608g, this.f12609h, aVarArr, this.f12610i);
                } else {
                    this.f12613l = new C4227a(this.f12608g, new File(this.f12608g.getNoBackupFilesDir(), this.f12609h).getAbsolutePath(), aVarArr, this.f12610i);
                }
                if (i >= 16) {
                    this.f12613l.setWriteAheadLoggingEnabled(this.f12614m);
                }
            }
            aVar = this.f12613l;
        }
        return aVar;
    }

    /* renamed from: R */
    public C4214b mo5550R() {
        return m18604c().mo14414c();
    }

    /* renamed from: V */
    public C4214b mo5551V() {
        return m18604c().mo14422x();
    }

    public void close() {
        m18604c().close();
    }

    public String getDatabaseName() {
        return this.f12609h;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f12612k) {
            C4227a aVar = this.f12613l;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f12614m = z;
        }
    }
}
