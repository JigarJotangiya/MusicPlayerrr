package net.coocent.android.xmlparser.feedback;

import android.app.Application;
import androidx.lifecycle.C0653a;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0692l0;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.LiveData;
import java.util.List;
import p082e.p091b.p092a.p095c.C3458a;
import p082e.p109h.p118o.C3699e;

/* renamed from: net.coocent.android.xmlparser.feedback.l */
/* compiled from: FeedbackViewModel */
class C9419l extends C0653a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9412j f36324c;

    /* renamed from: d */
    private final C0670e0<C3699e<List<String>, String>> f36325d;

    /* renamed from: e */
    private final LiveData<Integer> f36326e;

    /* renamed from: net.coocent.android.xmlparser.feedback.l$a */
    /* compiled from: FeedbackViewModel */
    class C9420a implements C3458a<C3699e<List<String>, String>, LiveData<Integer>> {
        C9420a() {
        }

        /* renamed from: a */
        public LiveData<Integer> apply(C3699e<List<String>, String> eVar) {
            return C9419l.this.f36324c.mo32531i((List) eVar.f11713a, (String) eVar.f11714b);
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.l$b */
    /* compiled from: FeedbackViewModel */
    static class C9421b implements C0703o0.C0705b {

        /* renamed from: a */
        private final Application f36328a;

        C9421b(Application application) {
            this.f36328a = application;
        }

        /* renamed from: a */
        public <T extends C0696m0> T mo4019a(Class<T> cls) {
            return new C9419l(this.f36328a);
        }
    }

    C9419l(Application application) {
        super(application);
        C0670e0<C3699e<List<String>, String>> e0Var = new C0670e0<>();
        this.f36325d = e0Var;
        this.f36326e = C0692l0.m4249a(e0Var, new C9420a());
        this.f36324c = new C9412j(application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo32534g() {
        this.f36324c.mo32528b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public LiveData<Integer> mo32535h() {
        return this.f36326e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo32536i(List<String> list, String str) {
        this.f36325d.mo4156o(new C3699e(list, str));
    }
}
