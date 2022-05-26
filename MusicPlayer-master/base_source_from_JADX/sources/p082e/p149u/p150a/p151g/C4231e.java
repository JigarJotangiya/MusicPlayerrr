package p082e.p149u.p150a.p151g;

import android.database.sqlite.SQLiteStatement;
import p082e.p149u.p150a.C4222f;

/* renamed from: e.u.a.g.e */
/* compiled from: FrameworkSQLiteStatement */
class C4231e extends C4230d implements C4222f {

    /* renamed from: h */
    private final SQLiteStatement f12621h;

    C4231e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f12621h = sQLiteStatement;
    }

    /* renamed from: I0 */
    public long mo5565I0() {
        return this.f12621h.executeInsert();
    }

    /* renamed from: u */
    public int mo5568u() {
        return this.f12621h.executeUpdateDelete();
    }
}
