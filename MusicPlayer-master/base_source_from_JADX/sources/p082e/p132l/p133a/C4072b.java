package p082e.p132l.p133a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import p082e.p132l.p133a.C4064a;
import p082e.p132l.p133a.C4072b;

/* renamed from: e.l.a.b */
/* compiled from: DynamicAnimation */
public abstract class C4072b<T extends C4072b<T>> implements C4064a.C4066b {

    /* renamed from: m */
    public static final C4083k f12262m = new C4075c("scaleX");

    /* renamed from: n */
    public static final C4083k f12263n = new C4076d("scaleY");

    /* renamed from: o */
    public static final C4083k f12264o = new C4077e("rotation");

    /* renamed from: p */
    public static final C4083k f12265p = new C4078f("rotationX");

    /* renamed from: q */
    public static final C4083k f12266q = new C4079g("rotationY");

    /* renamed from: r */
    public static final C4083k f12267r = new C4073a("alpha");

    /* renamed from: a */
    float f12268a = 0.0f;

    /* renamed from: b */
    float f12269b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f12270c = false;

    /* renamed from: d */
    final Object f12271d;

    /* renamed from: e */
    final C4084c f12272e;

    /* renamed from: f */
    boolean f12273f = false;

    /* renamed from: g */
    float f12274g = Float.MAX_VALUE;

    /* renamed from: h */
    float f12275h = (-Float.MAX_VALUE);

    /* renamed from: i */
    private long f12276i = 0;

    /* renamed from: j */
    private float f12277j;

    /* renamed from: k */
    private final ArrayList<C4081i> f12278k = new ArrayList<>();

    /* renamed from: l */
    private final ArrayList<C4082j> f12279l = new ArrayList<>();

    /* renamed from: e.l.a.b$a */
    /* compiled from: DynamicAnimation */
    static class C4073a extends C4083k {
        C4073a(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: e.l.a.b$b */
    /* compiled from: DynamicAnimation */
    static class C4074b extends C4083k {
    }

    /* renamed from: e.l.a.b$c */
    /* compiled from: DynamicAnimation */
    static class C4075c extends C4083k {
        C4075c(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: e.l.a.b$d */
    /* compiled from: DynamicAnimation */
    static class C4076d extends C4083k {
        C4076d(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: e.l.a.b$e */
    /* compiled from: DynamicAnimation */
    static class C4077e extends C4083k {
        C4077e(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: e.l.a.b$f */
    /* compiled from: DynamicAnimation */
    static class C4078f extends C4083k {
        C4078f(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: e.l.a.b$g */
    /* compiled from: DynamicAnimation */
    static class C4079g extends C4083k {
        C4079g(String str) {
            super(str, (C4074b) null);
        }

        /* renamed from: c */
        public float mo14129a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo14130b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: e.l.a.b$h */
    /* compiled from: DynamicAnimation */
    static class C4080h {

        /* renamed from: a */
        float f12280a;

        /* renamed from: b */
        float f12281b;

        C4080h() {
        }
    }

    /* renamed from: e.l.a.b$i */
    /* compiled from: DynamicAnimation */
    public interface C4081i {
        /* renamed from: a */
        void mo14143a(C4072b bVar, boolean z, float f, float f2);
    }

    /* renamed from: e.l.a.b$j */
    /* compiled from: DynamicAnimation */
    public interface C4082j {
        /* renamed from: a */
        void mo14144a(C4072b bVar, float f, float f2);
    }

    /* renamed from: e.l.a.b$k */
    /* compiled from: DynamicAnimation */
    public static abstract class C4083k extends C4084c<View> {
        /* synthetic */ C4083k(String str, C4074b bVar) {
            this(str);
        }

        private C4083k(String str) {
            super(str);
        }
    }

    <K> C4072b(K k, C4084c<K> cVar) {
        this.f12271d = k;
        this.f12272e = cVar;
        if (cVar == f12264o || cVar == f12265p || cVar == f12266q) {
            this.f12277j = 0.1f;
        } else if (cVar == f12267r) {
            this.f12277j = 0.00390625f;
        } else if (cVar == f12262m || cVar == f12263n) {
            this.f12277j = 0.00390625f;
        } else {
            this.f12277j = 1.0f;
        }
    }

    /* renamed from: c */
    private void m18035c(boolean z) {
        this.f12273f = false;
        C4064a.m18024d().mo14116g(this);
        this.f12276i = 0;
        this.f12270c = false;
        for (int i = 0; i < this.f12278k.size(); i++) {
            if (this.f12278k.get(i) != null) {
                this.f12278k.get(i).mo14143a(this, z, this.f12269b, this.f12268a);
            }
        }
        m18037g(this.f12278k);
    }

    /* renamed from: d */
    private float m18036d() {
        return this.f12272e.mo14129a(this.f12271d);
    }

    /* renamed from: g */
    private static <T> void m18037g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: k */
    private void m18038k() {
        if (!this.f12273f) {
            this.f12273f = true;
            if (!this.f12270c) {
                this.f12269b = m18036d();
            }
            float f = this.f12269b;
            if (f > this.f12274g || f < this.f12275h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C4064a.m18024d().mo14113a(this, 0);
        }
    }

    /* renamed from: a */
    public boolean mo14118a(long j) {
        long j2 = this.f12276i;
        if (j2 == 0) {
            this.f12276i = j;
            mo14125h(this.f12269b);
            return false;
        }
        this.f12276i = j;
        boolean l = mo14128l(j - j2);
        float min = Math.min(this.f12269b, this.f12274g);
        this.f12269b = min;
        float max = Math.max(min, this.f12275h);
        this.f12269b = max;
        mo14125h(max);
        if (l) {
            m18035c(false);
        }
        return l;
    }

    /* renamed from: b */
    public void mo14122b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f12273f) {
            m18035c(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo14123e() {
        return this.f12277j * 0.75f;
    }

    /* renamed from: f */
    public boolean mo14124f() {
        return this.f12273f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14125h(float f) {
        this.f12272e.mo14130b(this.f12271d, f);
        for (int i = 0; i < this.f12279l.size(); i++) {
            if (this.f12279l.get(i) != null) {
                this.f12279l.get(i).mo14144a(this, this.f12269b, this.f12268a);
            }
        }
        m18037g(this.f12279l);
    }

    /* renamed from: i */
    public T mo14126i(float f) {
        this.f12269b = f;
        this.f12270c = true;
        return this;
    }

    /* renamed from: j */
    public void mo14127j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f12273f) {
            m18038k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract boolean mo14128l(long j);
}
