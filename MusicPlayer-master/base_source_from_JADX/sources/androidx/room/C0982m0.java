package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.C0994s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4221e;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.m0 */
/* compiled from: QueryInterceptorDatabase */
final class C0982m0 implements C4214b {

    /* renamed from: g */
    private final C4214b f4202g;

    /* renamed from: h */
    private final C0994s0.C1000f f4203h;

    /* renamed from: i */
    private final Executor f4204i;

    C0982m0(C4214b bVar, C0994s0.C1000f fVar, Executor executor) {
        this.f4202g = bVar;
        this.f4203h = fVar;
        this.f4204i = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void mo5525F0() {
        this.f4203h.mo5609a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo5526H() {
        this.f4203h.mo5609a("END TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void mo5530Q(String str) {
        this.f4203h.mo5609a(str, new ArrayList(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void mo5532Y(String str, List list) {
        this.f4203h.mo5609a(str, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo5535d() {
        this.f4203h.mo5609a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void mo5540m0(String str) {
        this.f4203h.mo5609a(str, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void mo5542o0(C4221e eVar, C0988p0 p0Var) {
        this.f4203h.mo5609a(eVar.mo5623c(), p0Var.mo5559c());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo5546x() {
        this.f4203h.mo5609a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void mo5548z0(C4221e eVar, C0988p0 p0Var) {
        this.f4203h.mo5609a(eVar.mo5623c(), p0Var.mo5559c());
    }

    /* renamed from: D */
    public Cursor mo5524D(C4221e eVar, CancellationSignal cancellationSignal) {
        C0988p0 p0Var = new C0988p0();
        eVar.mo5625d(p0Var);
        this.f4204i.execute(new C0985o(this, eVar, p0Var));
        return this.f4202g.mo5538j0(eVar);
    }

    /* renamed from: M */
    public void mo5527M() {
        this.f4204i.execute(new C0964j(this));
        this.f4202g.mo5527M();
    }

    /* renamed from: N */
    public void mo5528N(String str, Object[] objArr) throws SQLException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f4204i.execute(new C0966k(this, str, arrayList));
        this.f4202g.mo5528N(str, arrayList.toArray());
    }

    /* renamed from: P */
    public void mo5529P() {
        this.f4204i.execute(new C0960i(this));
        this.f4202g.mo5529P();
    }

    /* renamed from: X */
    public Cursor mo5531X(String str) {
        this.f4204i.execute(new C0983n(this, str));
        return this.f4202g.mo5531X(str);
    }

    /* renamed from: a0 */
    public void mo5533a0() {
        this.f4204i.execute(new C0956h(this));
        this.f4202g.mo5533a0();
    }

    public void close() throws IOException {
        this.f4202g.close();
    }

    public String getPath() {
        return this.f4202g.getPath();
    }

    public boolean isOpen() {
        return this.f4202g.isOpen();
    }

    /* renamed from: j0 */
    public Cursor mo5538j0(C4221e eVar) {
        C0988p0 p0Var = new C0988p0();
        eVar.mo5625d(p0Var);
        this.f4204i.execute(new C0981m(this, eVar, p0Var));
        return this.f4202g.mo5538j0(eVar);
    }

    /* renamed from: m */
    public void mo5539m() {
        this.f4204i.execute(new C0987p(this));
        this.f4202g.mo5539m();
    }

    /* renamed from: n */
    public List<Pair<String, String>> mo5541n() {
        return this.f4202g.mo5541n();
    }

    /* renamed from: q */
    public void mo5543q(String str) throws SQLException {
        this.f4204i.execute(new C0973l(this, str));
        this.f4202g.mo5543q(str);
    }

    /* renamed from: r0 */
    public boolean mo5544r0() {
        return this.f4202g.mo5544r0();
    }

    /* renamed from: v */
    public C4222f mo5545v(String str) {
        return new C0990q0(this.f4202g.mo5545v(str), this.f4203h, str, this.f4204i);
    }

    /* renamed from: x0 */
    public boolean mo5547x0() {
        return this.f4202g.mo5547x0();
    }
}
