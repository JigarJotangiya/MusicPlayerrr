package com.airbnb.lottie.p015t.p017c;

import android.view.animation.Interpolator;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.a */
/* compiled from: BaseKeyframeAnimation */
public abstract class C1529a<K, A> {

    /* renamed from: a */
    final List<C1531b> f5906a = new ArrayList(1);

    /* renamed from: b */
    private boolean f5907b = false;

    /* renamed from: c */
    private final C1533d<K> f5908c;

    /* renamed from: d */
    protected float f5909d = 0.0f;

    /* renamed from: e */
    protected C1690c<A> f5910e;

    /* renamed from: f */
    private A f5911f = null;

    /* renamed from: g */
    private float f5912g = -1.0f;

    /* renamed from: h */
    private float f5913h = -1.0f;

    /* renamed from: com.airbnb.lottie.t.c.a$b */
    /* compiled from: BaseKeyframeAnimation */
    public interface C1531b {
        /* renamed from: a */
        void mo7132a();
    }

    /* renamed from: com.airbnb.lottie.t.c.a$c */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C1532c<T> implements C1533d<T> {
        private C1532c() {
        }

        /* renamed from: a */
        public boolean mo7164a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public C1688a<T> mo7165b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public boolean mo7166c(float f) {
            return false;
        }

        /* renamed from: d */
        public float mo7167d() {
            return 1.0f;
        }

        /* renamed from: e */
        public float mo7168e() {
            return 0.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: com.airbnb.lottie.t.c.a$d */
    /* compiled from: BaseKeyframeAnimation */
    private interface C1533d<T> {
        /* renamed from: a */
        boolean mo7164a(float f);

        /* renamed from: b */
        C1688a<T> mo7165b();

        /* renamed from: c */
        boolean mo7166c(float f);

        /* renamed from: d */
        float mo7167d();

        /* renamed from: e */
        float mo7168e();

        boolean isEmpty();
    }

    /* renamed from: com.airbnb.lottie.t.c.a$e */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C1534e<T> implements C1533d<T> {

        /* renamed from: a */
        private final List<? extends C1688a<T>> f5914a;

        /* renamed from: b */
        private C1688a<T> f5915b;

        /* renamed from: c */
        private C1688a<T> f5916c = null;

        /* renamed from: d */
        private float f5917d = -1.0f;

        C1534e(List<? extends C1688a<T>> list) {
            this.f5914a = list;
            this.f5915b = m7888f(0.0f);
        }

        /* renamed from: f */
        private C1688a<T> m7888f(float f) {
            List<? extends C1688a<T>> list = this.f5914a;
            C1688a<T> aVar = (C1688a) list.get(list.size() - 1);
            if (f >= aVar.mo7502e()) {
                return aVar;
            }
            for (int size = this.f5914a.size() - 2; size >= 1; size--) {
                C1688a<T> aVar2 = (C1688a) this.f5914a.get(size);
                if (this.f5915b != aVar2 && aVar2.mo7498a(f)) {
                    return aVar2;
                }
            }
            return (C1688a) this.f5914a.get(0);
        }

        /* renamed from: a */
        public boolean mo7164a(float f) {
            C1688a<T> aVar = this.f5916c;
            C1688a<T> aVar2 = this.f5915b;
            if (aVar == aVar2 && this.f5917d == f) {
                return true;
            }
            this.f5916c = aVar2;
            this.f5917d = f;
            return false;
        }

        /* renamed from: b */
        public C1688a<T> mo7165b() {
            return this.f5915b;
        }

        /* renamed from: c */
        public boolean mo7166c(float f) {
            if (this.f5915b.mo7498a(f)) {
                return !this.f5915b.mo7505h();
            }
            this.f5915b = m7888f(f);
            return true;
        }

        /* renamed from: d */
        public float mo7167d() {
            List<? extends C1688a<T>> list = this.f5914a;
            return ((C1688a) list.get(list.size() - 1)).mo7499b();
        }

        /* renamed from: e */
        public float mo7168e() {
            return ((C1688a) this.f5914a.get(0)).mo7502e();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: com.airbnb.lottie.t.c.a$f */
    /* compiled from: BaseKeyframeAnimation */
    private static final class C1535f<T> implements C1533d<T> {

        /* renamed from: a */
        private final C1688a<T> f5918a;

        /* renamed from: b */
        private float f5919b = -1.0f;

        C1535f(List<? extends C1688a<T>> list) {
            this.f5918a = (C1688a) list.get(0);
        }

        /* renamed from: a */
        public boolean mo7164a(float f) {
            if (this.f5919b == f) {
                return true;
            }
            this.f5919b = f;
            return false;
        }

        /* renamed from: b */
        public C1688a<T> mo7165b() {
            return this.f5918a;
        }

        /* renamed from: c */
        public boolean mo7166c(float f) {
            return !this.f5918a.mo7505h();
        }

        /* renamed from: d */
        public float mo7167d() {
            return this.f5918a.mo7499b();
        }

        /* renamed from: e */
        public float mo7168e() {
            return this.f5918a.mo7502e();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C1529a(List<? extends C1688a<K>> list) {
        this.f5908c = m7863o(list);
    }

    /* renamed from: g */
    private float m7862g() {
        if (this.f5912g == -1.0f) {
            this.f5912g = this.f5908c.mo7168e();
        }
        return this.f5912g;
    }

    /* renamed from: o */
    private static <T> C1533d<T> m7863o(List<? extends C1688a<T>> list) {
        if (list.isEmpty()) {
            return new C1532c();
        }
        if (list.size() == 1) {
            return new C1535f(list);
        }
        return new C1534e(list);
    }

    /* renamed from: a */
    public void mo7151a(C1531b bVar) {
        this.f5906a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1688a<K> mo7152b() {
        C1462c.m7603a("BaseKeyframeAnimation#getCurrentKeyframe");
        C1688a<K> b = this.f5908c.mo7165b();
        C1462c.m7604b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo7153c() {
        if (this.f5913h == -1.0f) {
            this.f5913h = this.f5908c.mo7167d();
        }
        return this.f5913h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo7154d() {
        C1688a b = mo7152b();
        if (b.mo7505h()) {
            return 0.0f;
        }
        return b.f6336d.getInterpolation(mo7155e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo7155e() {
        if (this.f5907b) {
            return 0.0f;
        }
        C1688a b = mo7152b();
        if (b.mo7505h()) {
            return 0.0f;
        }
        return (this.f5909d - b.mo7502e()) / (b.mo7499b() - b.mo7502e());
    }

    /* renamed from: f */
    public float mo7156f() {
        return this.f5909d;
    }

    /* renamed from: h */
    public A mo7157h() {
        A a;
        float e = mo7155e();
        if (this.f5910e == null && this.f5908c.mo7164a(e)) {
            return this.f5911f;
        }
        C1688a b = mo7152b();
        Interpolator interpolator = b.f6337e;
        if (interpolator == null || b.f6338f == null) {
            a = mo7158i(b, mo7154d());
        } else {
            a = mo7159j(b, e, interpolator.getInterpolation(e), b.f6338f.getInterpolation(e));
        }
        this.f5911f = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract A mo7158i(C1688a<K> aVar, float f);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public A mo7159j(C1688a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo7160k() {
        for (int i = 0; i < this.f5906a.size(); i++) {
            this.f5906a.get(i).mo7132a();
        }
    }

    /* renamed from: l */
    public void mo7161l() {
        this.f5907b = true;
    }

    /* renamed from: m */
    public void mo7162m(float f) {
        if (!this.f5908c.isEmpty()) {
            if (f < m7862g()) {
                f = m7862g();
            } else if (f > mo7153c()) {
                f = mo7153c();
            }
            if (f != this.f5909d) {
                this.f5909d = f;
                if (this.f5908c.mo7166c(f)) {
                    mo7160k();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo7163n(C1690c<A> cVar) {
        C1690c<A> cVar2 = this.f5910e;
        if (cVar2 != null) {
            cVar2.mo7509c((C1529a<?, ?>) null);
        }
        this.f5910e = cVar;
        if (cVar != null) {
            cVar.mo7509c(this);
        }
    }
}
