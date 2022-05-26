package p159f.p243f.p245b.p304b.p312t;

import android.graphics.Typeface;

/* renamed from: f.f.b.b.t.a */
/* compiled from: CancelableFontCallback */
public final class C7519a extends C7527f {

    /* renamed from: a */
    private final Typeface f32729a;

    /* renamed from: b */
    private final C7520a f32730b;

    /* renamed from: c */
    private boolean f32731c;

    /* renamed from: f.f.b.b.t.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C7520a {
        /* renamed from: a */
        void mo24162a(Typeface typeface);
    }

    public C7519a(C7520a aVar, Typeface typeface) {
        this.f32729a = typeface;
        this.f32730b = aVar;
    }

    /* renamed from: d */
    private void m42004d(Typeface typeface) {
        if (!this.f32731c) {
            this.f32730b.mo24162a(typeface);
        }
    }

    /* renamed from: a */
    public void mo23420a(int i) {
        m42004d(this.f32729a);
    }

    /* renamed from: b */
    public void mo23421b(Typeface typeface, boolean z) {
        m42004d(typeface);
    }

    /* renamed from: c */
    public void mo28412c() {
        this.f32731c = true;
    }
}
