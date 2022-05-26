package androidx.lifecycle;

import p082e.p091b.p092a.p095c.C3458a;

/* renamed from: androidx.lifecycle.l0 */
/* compiled from: Transformations */
public class C0692l0 {

    /* renamed from: androidx.lifecycle.l0$a */
    /* compiled from: Transformations */
    class C0693a implements C0672f0<X> {

        /* renamed from: a */
        LiveData<Y> f3317a;

        /* renamed from: b */
        final /* synthetic */ C3458a f3318b;

        /* renamed from: c */
        final /* synthetic */ C0663c0 f3319c;

        /* renamed from: androidx.lifecycle.l0$a$a */
        /* compiled from: Transformations */
        class C0694a implements C0672f0<Y> {
            C0694a() {
            }

            public void onChanged(Y y) {
                C0693a.this.f3319c.mo4156o(y);
            }
        }

        C0693a(C3458a aVar, C0663c0 c0Var) {
            this.f3318b = aVar;
            this.f3319c = c0Var;
        }

        public void onChanged(X x) {
            LiveData<Y> liveData = (LiveData) this.f3318b.apply(x);
            LiveData<Y> liveData2 = this.f3317a;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f3319c.mo4206q(liveData2);
                }
                this.f3317a = liveData;
                if (liveData != null) {
                    this.f3319c.mo4205p(liveData, new C0694a());
                }
            }
        }
    }

    /* renamed from: a */
    public static <X, Y> LiveData<Y> m4249a(LiveData<X> liveData, C3458a<X, LiveData<Y>> aVar) {
        C0663c0 c0Var = new C0663c0();
        c0Var.mo4205p(liveData, new C0693a(aVar, c0Var));
        return c0Var;
    }
}
