package androidx.room;

import android.database.Cursor;
import androidx.room.p005c1.C0936a;
import java.util.List;
import p082e.p149u.p150a.C4213a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.u0 */
/* compiled from: RoomOpenHelper */
public class C1004u0 extends C4215c.C4216a {

    /* renamed from: b */
    private C0938d0 f4267b;

    /* renamed from: c */
    private final C1005a f4268c;

    /* renamed from: d */
    private final String f4269d;

    /* renamed from: e */
    private final String f4270e;

    /* renamed from: androidx.room.u0$a */
    /* compiled from: RoomOpenHelper */
    public static abstract class C1005a {

        /* renamed from: a */
        public final int f4271a;

        public C1005a(int i) {
            this.f4271a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5615a(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo5616b(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo5617c(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo5618d(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo5619e(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo5620f(C4214b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract C1006b mo5621g(C4214b bVar);
    }

    /* renamed from: androidx.room.u0$b */
    /* compiled from: RoomOpenHelper */
    public static class C1006b {

        /* renamed from: a */
        public final boolean f4272a;

        /* renamed from: b */
        public final String f4273b;

        public C1006b(boolean z, String str) {
            this.f4272a = z;
            this.f4273b = str;
        }
    }

    public C1004u0(C0938d0 d0Var, C1005a aVar, String str, String str2) {
        super(aVar.f4271a);
        this.f4267b = d0Var;
        this.f4268c = aVar;
        this.f4269d = str;
        this.f4270e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private void m5878h(C4214b bVar) {
        if (m5881k(bVar)) {
            String str = null;
            Cursor j0 = bVar.mo5538j0(new C4213a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (j0.moveToFirst()) {
                    str = j0.getString(0);
                }
                j0.close();
                if (!this.f4269d.equals(str) && !this.f4270e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                j0.close();
                throw th;
            }
        } else {
            C1006b g = this.f4268c.mo5621g(bVar);
            if (g.f4272a) {
                this.f4268c.mo5619e(bVar);
                m5882l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f4273b);
        }
    }

    /* renamed from: i */
    private void m5879i(C4214b bVar) {
        bVar.mo5543q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m5880j(C4214b bVar) {
        Cursor X = bVar.mo5531X("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (X.moveToFirst() && X.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            X.close();
        }
    }

    /* renamed from: k */
    private static boolean m5881k(C4214b bVar) {
        Cursor X = bVar.mo5531X("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (X.moveToFirst() && X.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            X.close();
        }
    }

    /* renamed from: l */
    private void m5882l(C4214b bVar) {
        m5879i(bVar);
        bVar.mo5543q(C1002t0.m5877a(this.f4269d));
    }

    /* renamed from: b */
    public void mo5610b(C4214b bVar) {
        super.mo5610b(bVar);
    }

    /* renamed from: d */
    public void mo5611d(C4214b bVar) {
        boolean j = m5880j(bVar);
        this.f4268c.mo5615a(bVar);
        if (!j) {
            C1006b g = this.f4268c.mo5621g(bVar);
            if (!g.f4272a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f4273b);
            }
        }
        m5882l(bVar);
        this.f4268c.mo5617c(bVar);
    }

    /* renamed from: e */
    public void mo5612e(C4214b bVar, int i, int i2) {
        mo5614g(bVar, i, i2);
    }

    /* renamed from: f */
    public void mo5613f(C4214b bVar) {
        super.mo5613f(bVar);
        m5878h(bVar);
        this.f4268c.mo5618d(bVar);
        this.f4267b = null;
    }

    /* renamed from: g */
    public void mo5614g(C4214b bVar, int i, int i2) {
        boolean z;
        List<C0936a> c;
        C0938d0 d0Var = this.f4267b;
        if (d0Var == null || (c = d0Var.f4095d.mo5607c(i, i2)) == null) {
            z = false;
        } else {
            this.f4268c.mo5620f(bVar);
            for (C0936a a : c) {
                a.mo5455a(bVar);
            }
            C1006b g = this.f4268c.mo5621g(bVar);
            if (g.f4272a) {
                this.f4268c.mo5619e(bVar);
                m5882l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f4273b);
            }
        }
        if (!z) {
            C0938d0 d0Var2 = this.f4267b;
            if (d0Var2 == null || d0Var2.mo5456a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f4268c.mo5616b(bVar);
            this.f4268c.mo5615a(bVar);
        }
    }
}
