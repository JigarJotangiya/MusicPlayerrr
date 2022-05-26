package p082e.p140p.p141a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0672f0;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0710p0;
import androidx.lifecycle.C0718v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p082e.p098e.C3479h;
import p082e.p109h.p118o.C3696b;
import p082e.p140p.p142b.C4106a;

/* renamed from: e.p.a.b */
/* compiled from: LoaderManagerImpl */
class C4101b extends C4100a {

    /* renamed from: c */
    static boolean f12375c = false;

    /* renamed from: a */
    private final C0718v f12376a;

    /* renamed from: b */
    private final C4104c f12377b;

    /* renamed from: e.p.a.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C4102a<D> extends C0670e0<D> {

        /* renamed from: l */
        private final int f12378l;

        /* renamed from: m */
        private final Bundle f12379m;

        /* renamed from: n */
        private final C4106a<D> f12380n;

        /* renamed from: o */
        private C0718v f12381o;

        /* renamed from: p */
        private C4103b<D> f12382p;

        /* renamed from: q */
        private C4106a<D> f12383q;

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4151j() {
            if (C4101b.f12375c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f12380n.mo14204d();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4152k() {
            if (C4101b.f12375c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f12380n.mo14205e();
            throw null;
        }

        /* renamed from: m */
        public void mo4154m(C0672f0<? super D> f0Var) {
            super.mo4154m(f0Var);
            this.f12381o = null;
        }

        /* renamed from: o */
        public void mo4156o(D d) {
            super.mo4156o(d);
            C4106a<D> aVar = this.f12383q;
            if (aVar != null) {
                aVar.mo14203c();
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C4106a<D> mo14195p(boolean z) {
            if (C4101b.f12375c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f12380n.mo14201a();
            throw null;
        }

        /* renamed from: q */
        public void mo14196q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f12378l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f12379m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f12380n);
            C4106a<D> aVar = this.f12380n;
            aVar.mo14202b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo14197r() {
            C0718v vVar = this.f12381o;
            C4103b<D> bVar = this.f12382p;
            if (vVar != null && bVar != null) {
                super.mo4154m(bVar);
                mo4149h(vVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f12378l);
            sb.append(" : ");
            C3696b.m15812a(this.f12380n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: e.p.a.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C4103b<D> implements C0672f0<D> {
    }

    /* renamed from: e.p.a.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C4104c extends C0696m0 {

        /* renamed from: d */
        private static final C0703o0.C0705b f12384d = new C4105a();

        /* renamed from: c */
        private C3479h<C4102a> f12385c = new C3479h<>();

        /* renamed from: e.p.a.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C4105a implements C0703o0.C0705b {
            C4105a() {
            }

            /* renamed from: a */
            public <T extends C0696m0> T mo4019a(Class<T> cls) {
                return new C4104c();
            }
        }

        C4104c() {
        }

        /* renamed from: g */
        static C4104c m18160g(C0710p0 p0Var) {
            return (C4104c) new C0703o0(p0Var, f12384d).mo4262a(C4104c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo4006d() {
            super.mo4006d();
            if (this.f12385c.mo12416m() <= 0) {
                this.f12385c.mo12406b();
            } else {
                this.f12385c.mo12417n(0).mo14195p(true);
                throw null;
            }
        }

        /* renamed from: f */
        public void mo14199f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f12385c.mo12416m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f12385c.mo12416m() > 0) {
                    C4102a n = this.f12385c.mo12417n(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f12385c.mo12413j(0));
                    printWriter.print(": ");
                    printWriter.println(n.toString());
                    n.mo14196q(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo14200h() {
            int m = this.f12385c.mo12416m();
            for (int i = 0; i < m; i++) {
                this.f12385c.mo12417n(i).mo14197r();
            }
        }
    }

    C4101b(C0718v vVar, C0710p0 p0Var) {
        this.f12376a = vVar;
        this.f12377b = C4104c.m18160g(p0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo14192a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f12377b.mo14199f(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo14193c() {
        this.f12377b.mo14200h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C3696b.m15812a(this.f12376a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
