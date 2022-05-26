package p082e.p149u.p150a.p151g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p082e.p149u.p150a.C4213a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4221e;
import p082e.p149u.p150a.C4222f;

/* renamed from: e.u.a.g.a */
/* compiled from: FrameworkSQLiteDatabase */
class C4223a implements C4214b {

    /* renamed from: h */
    private static final String[] f12604h = new String[0];

    /* renamed from: g */
    private final SQLiteDatabase f12605g;

    /* renamed from: e.u.a.g.a$a */
    /* compiled from: FrameworkSQLiteDatabase */
    class C4224a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C4221e f12606a;

        C4224a(C4223a aVar, C4221e eVar) {
            this.f12606a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f12606a.mo5625d(new C4230d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: e.u.a.g.a$b */
    /* compiled from: FrameworkSQLiteDatabase */
    class C4225b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C4221e f12607a;

        C4225b(C4223a aVar, C4221e eVar) {
            this.f12607a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f12607a.mo5625d(new C4230d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C4223a(SQLiteDatabase sQLiteDatabase) {
        this.f12605g = sQLiteDatabase;
    }

    /* renamed from: D */
    public Cursor mo5524D(C4221e eVar, CancellationSignal cancellationSignal) {
        return this.f12605g.rawQueryWithFactory(new C4225b(this, eVar), eVar.mo5623c(), f12604h, (String) null, cancellationSignal);
    }

    /* renamed from: M */
    public void mo5527M() {
        this.f12605g.setTransactionSuccessful();
    }

    /* renamed from: N */
    public void mo5528N(String str, Object[] objArr) throws SQLException {
        this.f12605g.execSQL(str, objArr);
    }

    /* renamed from: P */
    public void mo5529P() {
        this.f12605g.beginTransactionNonExclusive();
    }

    /* renamed from: X */
    public Cursor mo5531X(String str) {
        return mo5538j0(new C4213a(str));
    }

    /* renamed from: a0 */
    public void mo5533a0() {
        this.f12605g.endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo14410c(SQLiteDatabase sQLiteDatabase) {
        return this.f12605g == sQLiteDatabase;
    }

    public void close() throws IOException {
        this.f12605g.close();
    }

    public String getPath() {
        return this.f12605g.getPath();
    }

    public boolean isOpen() {
        return this.f12605g.isOpen();
    }

    /* renamed from: j0 */
    public Cursor mo5538j0(C4221e eVar) {
        return this.f12605g.rawQueryWithFactory(new C4224a(this, eVar), eVar.mo5623c(), f12604h, (String) null);
    }

    /* renamed from: m */
    public void mo5539m() {
        this.f12605g.beginTransaction();
    }

    /* renamed from: n */
    public List<Pair<String, String>> mo5541n() {
        return this.f12605g.getAttachedDbs();
    }

    /* renamed from: q */
    public void mo5543q(String str) throws SQLException {
        this.f12605g.execSQL(str);
    }

    /* renamed from: r0 */
    public boolean mo5544r0() {
        return this.f12605g.inTransaction();
    }

    /* renamed from: v */
    public C4222f mo5545v(String str) {
        return new C4231e(this.f12605g.compileStatement(str));
    }

    /* renamed from: x0 */
    public boolean mo5547x0() {
        return this.f12605g.isWriteAheadLoggingEnabled();
    }
}
