package androidx.lifecycle;

import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8906s0;
import kotlinx.coroutines.C8921v2;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: androidx.lifecycle.e */
/* compiled from: CoroutineLiveData.kt */
public final class C0667e<T> extends C0663c0<T> {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C0655b<T> f3287m;

    /* renamed from: n */
    private C0675h f3288n;

    /* renamed from: androidx.lifecycle.e$a */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0668a extends C8595m implements C8559a<C8457t> {
        final /* synthetic */ C0667e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0668a(C0667e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        public final void invoke() {
            this.this$0.f3287m = null;
        }
    }

    @C8533f(mo30599c = "androidx.lifecycle.CoroutineLiveData", mo30600f = "CoroutineLiveData.kt", mo30601l = {234}, mo30602m = "clearSource$lifecycle_livedata_ktx_release")
    /* renamed from: androidx.lifecycle.e$b */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0669b extends C8531d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C0667e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0669b(C0667e eVar, C8508d dVar) {
            super(dVar);
            this.this$0 = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo4211s(this);
        }
    }

    public C0667e(C8513g gVar, long j, C8574p<? super C0654a0<T>, ? super C8508d<? super C8457t>, ? extends Object> pVar) {
        C8594l.m46771e(gVar, "context");
        C8594l.m46771e(pVar, "block");
        C8574p<? super C0654a0<T>, ? super C8508d<? super C8457t>, ? extends Object> pVar2 = pVar;
        long j2 = j;
        this.f3287m = new C0655b(this, pVar2, j2, C8906s0.m47808a(C8768g1.m47303c().mo30872P0().plus(gVar).plus(C8921v2.m47830a((C8665a2) gVar.get(C8665a2.f35030f)))), new C0668a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4151j() {
        super.mo4151j();
        C0655b<T> bVar = this.f3287m;
        if (bVar != null) {
            bVar.mo4197h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4152k() {
        super.mo4152k();
        C0655b<T> bVar = this.f3287m;
        if (bVar != null) {
            bVar.mo4196g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4211s(p369i.p379w.C8508d<? super p369i.C8457t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.C0667e.C0669b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.e$b r0 = (androidx.lifecycle.C0667e.C0669b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.e r0 = (androidx.lifecycle.C0667e) r0
            p369i.C8450m.m46575b(r5)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p369i.C8450m.m46575b(r5)
            androidx.lifecycle.h r5 = r4.f3288n
            if (r5 == 0) goto L_0x0047
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo4216a(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            r5 = 0
            r0.f3288n = r5
            i.t r5 = p369i.C8457t.f34900a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0667e.mo4211s(i.w.d):java.lang.Object");
    }
}
