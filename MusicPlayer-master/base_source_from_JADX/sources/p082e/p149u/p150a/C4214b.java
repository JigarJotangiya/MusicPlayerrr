package p082e.p149u.p150a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: e.u.a.b */
/* compiled from: SupportSQLiteDatabase */
public interface C4214b extends Closeable {
    /* renamed from: D */
    Cursor mo5524D(C4221e eVar, CancellationSignal cancellationSignal);

    /* renamed from: M */
    void mo5527M();

    /* renamed from: N */
    void mo5528N(String str, Object[] objArr) throws SQLException;

    /* renamed from: P */
    void mo5529P();

    /* renamed from: X */
    Cursor mo5531X(String str);

    /* renamed from: a0 */
    void mo5533a0();

    String getPath();

    boolean isOpen();

    /* renamed from: j0 */
    Cursor mo5538j0(C4221e eVar);

    /* renamed from: m */
    void mo5539m();

    /* renamed from: n */
    List<Pair<String, String>> mo5541n();

    /* renamed from: q */
    void mo5543q(String str) throws SQLException;

    /* renamed from: r0 */
    boolean mo5544r0();

    /* renamed from: v */
    C4222f mo5545v(String str);

    /* renamed from: x0 */
    boolean mo5547x0();
}
