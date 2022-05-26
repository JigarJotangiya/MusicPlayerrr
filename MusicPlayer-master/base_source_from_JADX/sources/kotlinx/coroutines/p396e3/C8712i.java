package kotlinx.coroutines.p396e3;

import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8923w0;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8859z;

/* renamed from: kotlinx.coroutines.e3.i */
/* compiled from: AbstractChannel.kt */
public final class C8712i<E> extends C8721r implements C8719p<E> {

    /* renamed from: j */
    public final Throwable f35086j;

    public C8712i(Throwable th) {
        this.f35086j = th;
    }

    /* renamed from: A */
    public /* bridge */ /* synthetic */ Object mo30950A() {
        mo30965E();
        return this;
    }

    /* renamed from: B */
    public C8859z mo30951B(C8842o.C8845c cVar) {
        C8859z zVar = C8905s.f35297a;
        if (cVar == null) {
            return zVar;
        }
        cVar.mo31154d();
        throw null;
    }

    /* renamed from: D */
    public C8712i<E> mo30964D() {
        return this;
    }

    /* renamed from: E */
    public C8712i<E> mo30965E() {
        return this;
    }

    /* renamed from: F */
    public final Throwable mo30966F() {
        Throwable th = this.f35086j;
        return th == null ? new C8713j("Channel was closed") : th;
    }

    /* renamed from: G */
    public final Throwable mo30967G() {
        Throwable th = this.f35086j;
        return th == null ? new C8714k("Channel was closed") : th;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo30968a() {
        mo30964D();
        return this;
    }

    /* renamed from: e */
    public void mo30932e(E e) {
    }

    /* renamed from: f */
    public C8859z mo30933f(E e, C8842o.C8845c cVar) {
        C8859z zVar = C8905s.f35297a;
        if (cVar == null) {
            return zVar;
        }
        cVar.mo31154d();
        throw null;
    }

    public String toString() {
        return "Closed@" + C8923w0.m47834b(this) + '[' + this.f35086j + ']';
    }

    /* renamed from: z */
    public void mo30952z() {
    }
}
