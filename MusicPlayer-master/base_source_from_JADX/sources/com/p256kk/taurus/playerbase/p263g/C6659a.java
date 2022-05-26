package com.p256kk.taurus.playerbase.p263g;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kk.taurus.playerbase.g.a */
/* compiled from: AbsCoverContainer */
public abstract class C6659a implements C6666h {

    /* renamed from: a */
    protected Context f30055a;

    /* renamed from: b */
    private List<C6660b> f30056b = new ArrayList();

    /* renamed from: c */
    private ViewGroup f30057c = mo25967f();

    public C6659a(Context context) {
        this.f30055a = context;
    }

    /* renamed from: a */
    public void mo25962a(C6660b bVar) {
        mo25972k(bVar);
        if (mo25968g(bVar)) {
            this.f30056b.remove(bVar);
            mo25970i(bVar);
        }
    }

    /* renamed from: b */
    public void mo25963b(C6660b bVar) {
        mo25971j(bVar);
        if (mo25968g(bVar)) {
            this.f30056b.add(bVar);
            mo25969h(bVar);
        }
    }

    /* renamed from: c */
    public void mo25964c() {
        this.f30056b.clear();
        mo25973l();
    }

    /* renamed from: d */
    public ViewGroup mo25965d() {
        return this.f30057c;
    }

    /* renamed from: e */
    public int mo25966e() {
        List<C6660b> list = this.f30056b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract ViewGroup mo25967f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo25968g(C6660b bVar) {
        return (bVar == null || bVar.mo25975E() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo25969h(C6660b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo25970i(C6660b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo25971j(C6660b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo25972k(C6660b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo25973l();
}
