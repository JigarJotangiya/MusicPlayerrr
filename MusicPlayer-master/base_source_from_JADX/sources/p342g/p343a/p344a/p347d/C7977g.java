package p342g.p343a.p344a.p347d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: g.a.a.d.g */
/* compiled from: TopRateDao */
public class C7977g {

    /* renamed from: b */
    private static C7977g f33690b;

    /* renamed from: a */
    private C7971a f33691a;

    public C7977g(Context context) {
        this.f33691a = new C7971a(context);
    }

    /* renamed from: b */
    public static C7977g m43680b(Context context) {
        if (f33690b == null) {
            f33690b = new C7977g(context);
        }
        return f33690b;
    }

    /* renamed from: a */
    public void mo29528a(long j) {
        SQLiteDatabase writableDatabase = this.f33691a.getWritableDatabase();
        writableDatabase.execSQL("delete from topRate where audioId =" + j);
    }
}
