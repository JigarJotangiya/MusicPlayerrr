package p082e.p149u.p150a.p151g;

import android.database.sqlite.SQLiteProgram;
import p082e.p149u.p150a.C4220d;

/* renamed from: e.u.a.g.d */
/* compiled from: FrameworkSQLiteProgram */
class C4230d implements C4220d {

    /* renamed from: g */
    private final SQLiteProgram f12620g;

    C4230d(SQLiteProgram sQLiteProgram) {
        this.f12620g = sQLiteProgram;
    }

    /* renamed from: L */
    public void mo5557L(int i, long j) {
        this.f12620g.bindLong(i, j);
    }

    /* renamed from: S */
    public void mo5558S(int i, byte[] bArr) {
        this.f12620g.bindBlob(i, bArr);
    }

    public void close() {
        this.f12620g.close();
    }

    /* renamed from: k0 */
    public void mo5561k0(int i) {
        this.f12620g.bindNull(i);
    }

    /* renamed from: r */
    public void mo5562r(int i, String str) {
        this.f12620g.bindString(i, str);
    }

    /* renamed from: y */
    public void mo5563y(int i, double d) {
        this.f12620g.bindDouble(i, d);
    }
}
