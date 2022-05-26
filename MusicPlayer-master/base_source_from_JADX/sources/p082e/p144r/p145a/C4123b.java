package p082e.p144r.p145a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3465a;
import p082e.p109h.p110h.C3621a;

/* renamed from: e.r.a.b */
/* compiled from: Palette */
public final class C4123b {

    /* renamed from: f */
    static final C4127c f12417f = new C4124a();

    /* renamed from: a */
    private final List<C4129e> f12418a;

    /* renamed from: b */
    private final List<C4130c> f12419b;

    /* renamed from: c */
    private final Map<C4130c, C4129e> f12420c = new C3465a();

    /* renamed from: d */
    private final SparseBooleanArray f12421d = new SparseBooleanArray();

    /* renamed from: e */
    private final C4129e f12422e = m18233a();

    /* renamed from: e.r.a.b$a */
    /* compiled from: Palette */
    static class C4124a implements C4127c {
        C4124a() {
        }

        /* renamed from: b */
        private boolean m18242b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        private boolean m18243c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        private boolean m18244d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        /* renamed from: a */
        public boolean mo14224a(int i, float[] fArr) {
            return !m18244d(fArr) && !m18242b(fArr) && !m18243c(fArr);
        }
    }

    /* renamed from: e.r.a.b$b */
    /* compiled from: Palette */
    public static final class C4125b {

        /* renamed from: a */
        private final List<C4129e> f12423a;

        /* renamed from: b */
        private final Bitmap f12424b;

        /* renamed from: c */
        private final List<C4130c> f12425c;

        /* renamed from: d */
        private int f12426d = 16;

        /* renamed from: e */
        private int f12427e = 12544;

        /* renamed from: f */
        private int f12428f = -1;

        /* renamed from: g */
        private final List<C4127c> f12429g;

        /* renamed from: h */
        private Rect f12430h;

        /* renamed from: e.r.a.b$b$a */
        /* compiled from: Palette */
        class C4126a extends AsyncTask<Bitmap, Void, C4123b> {

            /* renamed from: a */
            final /* synthetic */ C4128d f12431a;

            C4126a(C4128d dVar) {
                this.f12431a = dVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C4123b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C4125b.this.mo14226b();
                } catch (Exception e) {
                    Log.e("Palette", "Exception thrown during async generate", e);
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void onPostExecute(C4123b bVar) {
                this.f12431a.mo14231a(bVar);
            }
        }

        public C4125b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f12425c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f12429g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C4123b.f12417f);
            this.f12424b = bitmap;
            this.f12423a = null;
            arrayList.add(C4130c.f12442e);
            arrayList.add(C4130c.f12443f);
            arrayList.add(C4130c.f12444g);
            arrayList.add(C4130c.f12445h);
            arrayList.add(C4130c.f12446i);
            arrayList.add(C4130c.f12447j);
        }

        /* renamed from: c */
        private int[] m18246c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f12430h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f12430h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f12430h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: d */
        private Bitmap m18247d(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f12427e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f12427e;
                if (width > i2) {
                    d = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f12428f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f12428f)) {
                d = ((double) i) / ((double) max);
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(((double) bitmap.getHeight()) * d), false);
        }

        /* renamed from: a */
        public AsyncTask<Bitmap, Void, C4123b> mo14225a(C4128d dVar) {
            if (dVar != null) {
                return new C4126a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f12424b});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* renamed from: b */
        public C4123b mo14226b() {
            List<C4129e> list;
            C4127c[] cVarArr;
            Bitmap bitmap = this.f12424b;
            if (bitmap != null) {
                Bitmap d = m18247d(bitmap);
                Rect rect = this.f12430h;
                if (!(d == this.f12424b || rect == null)) {
                    double width = ((double) d.getWidth()) / ((double) this.f12424b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), d.getHeight());
                }
                int[] c = m18246c(d);
                int i = this.f12426d;
                if (this.f12429g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<C4127c> list2 = this.f12429g;
                    cVarArr = (C4127c[]) list2.toArray(new C4127c[list2.size()]);
                }
                C4120a aVar = new C4120a(c, i, cVarArr);
                if (d != this.f12424b) {
                    d.recycle();
                }
                list = aVar.mo14210d();
            } else {
                list = this.f12423a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C4123b bVar = new C4123b(list, this.f12425c);
            bVar.mo14221c();
            return bVar;
        }
    }

    /* renamed from: e.r.a.b$c */
    /* compiled from: Palette */
    public interface C4127c {
        /* renamed from: a */
        boolean mo14224a(int i, float[] fArr);
    }

    /* renamed from: e.r.a.b$d */
    /* compiled from: Palette */
    public interface C4128d {
        /* renamed from: a */
        void mo14231a(C4123b bVar);
    }

    /* renamed from: e.r.a.b$e */
    /* compiled from: Palette */
    public static final class C4129e {

        /* renamed from: a */
        private final int f12433a;

        /* renamed from: b */
        private final int f12434b;

        /* renamed from: c */
        private final int f12435c;

        /* renamed from: d */
        private final int f12436d;

        /* renamed from: e */
        private final int f12437e;

        /* renamed from: f */
        private boolean f12438f;

        /* renamed from: g */
        private int f12439g;

        /* renamed from: h */
        private int f12440h;

        /* renamed from: i */
        private float[] f12441i;

        public C4129e(int i, int i2) {
            this.f12433a = Color.red(i);
            this.f12434b = Color.green(i);
            this.f12435c = Color.blue(i);
            this.f12436d = i;
            this.f12437e = i2;
        }

        /* renamed from: a */
        private void m18254a() {
            int i;
            int i2;
            if (!this.f12438f) {
                int e = C3621a.m15587e(-1, this.f12436d, 4.5f);
                int e2 = C3621a.m15587e(-1, this.f12436d, 3.0f);
                if (e == -1 || e2 == -1) {
                    int e3 = C3621a.m15587e(-16777216, this.f12436d, 4.5f);
                    int e4 = C3621a.m15587e(-16777216, this.f12436d, 3.0f);
                    if (e3 == -1 || e4 == -1) {
                        if (e != -1) {
                            i = C3621a.m15595m(-1, e);
                        } else {
                            i = C3621a.m15595m(-16777216, e3);
                        }
                        this.f12440h = i;
                        if (e2 != -1) {
                            i2 = C3621a.m15595m(-1, e2);
                        } else {
                            i2 = C3621a.m15595m(-16777216, e4);
                        }
                        this.f12439g = i2;
                        this.f12438f = true;
                        return;
                    }
                    this.f12440h = C3621a.m15595m(-16777216, e3);
                    this.f12439g = C3621a.m15595m(-16777216, e4);
                    this.f12438f = true;
                    return;
                }
                this.f12440h = C3621a.m15595m(-1, e);
                this.f12439g = C3621a.m15595m(-1, e2);
                this.f12438f = true;
            }
        }

        /* renamed from: b */
        public int mo14232b() {
            m18254a();
            return this.f12440h;
        }

        /* renamed from: c */
        public float[] mo14233c() {
            if (this.f12441i == null) {
                this.f12441i = new float[3];
            }
            C3621a.m15583a(this.f12433a, this.f12434b, this.f12435c, this.f12441i);
            return this.f12441i;
        }

        /* renamed from: d */
        public int mo14234d() {
            return this.f12437e;
        }

        /* renamed from: e */
        public int mo14235e() {
            return this.f12436d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4129e.class != obj.getClass()) {
                return false;
            }
            C4129e eVar = (C4129e) obj;
            if (this.f12437e == eVar.f12437e && this.f12436d == eVar.f12436d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo14237f() {
            m18254a();
            return this.f12439g;
        }

        public int hashCode() {
            return (this.f12436d * 31) + this.f12437e;
        }

        public String toString() {
            return C4129e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(mo14235e()) + ']' + " [HSL: " + Arrays.toString(mo14233c()) + ']' + " [Population: " + this.f12437e + ']' + " [Title Text: #" + Integer.toHexString(mo14237f()) + ']' + " [Body Text: #" + Integer.toHexString(mo14232b()) + ']';
        }
    }

    C4123b(List<C4129e> list, List<C4130c> list2) {
        this.f12418a = list;
        this.f12419b = list2;
    }

    /* renamed from: a */
    private C4129e m18233a() {
        int size = this.f12418a.size();
        int i = Integer.MIN_VALUE;
        C4129e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C4129e eVar2 = this.f12418a.get(i2);
            if (eVar2.mo14234d() > i) {
                i = eVar2.mo14234d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public static C4125b m18234b(Bitmap bitmap) {
        return new C4125b(bitmap);
    }

    /* renamed from: d */
    private float m18235d(C4129e eVar, C4130c cVar) {
        float[] c = eVar.mo14233c();
        C4129e eVar2 = this.f12422e;
        int d = eVar2 != null ? eVar2.mo14234d() : 1;
        float f = 0.0f;
        float g = cVar.mo14246g() > 0.0f ? cVar.mo14246g() * (1.0f - Math.abs(c[1] - cVar.mo14248i())) : 0.0f;
        float a = cVar.mo14240a() > 0.0f ? cVar.mo14240a() * (1.0f - Math.abs(c[2] - cVar.mo14247h())) : 0.0f;
        if (cVar.mo14245f() > 0.0f) {
            f = cVar.mo14245f() * (((float) eVar.mo14234d()) / ((float) d));
        }
        return g + a + f;
    }

    /* renamed from: e */
    private C4129e m18236e(C4130c cVar) {
        C4129e g = m18237g(cVar);
        if (g != null && cVar.mo14249j()) {
            this.f12421d.append(g.mo14235e(), true);
        }
        return g;
    }

    /* renamed from: g */
    private C4129e m18237g(C4130c cVar) {
        int size = this.f12418a.size();
        float f = 0.0f;
        C4129e eVar = null;
        for (int i = 0; i < size; i++) {
            C4129e eVar2 = this.f12418a.get(i);
            if (m18238i(eVar2, cVar)) {
                float d = m18235d(eVar2, cVar);
                if (eVar == null || d > f) {
                    eVar = eVar2;
                    f = d;
                }
            }
        }
        return eVar;
    }

    /* renamed from: i */
    private boolean m18238i(C4129e eVar, C4130c cVar) {
        float[] c = eVar.mo14233c();
        if (c[1] < cVar.mo14244e() || c[1] > cVar.mo14242c() || c[2] < cVar.mo14243d() || c[2] > cVar.mo14241b() || this.f12421d.get(eVar.mo14235e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14221c() {
        int size = this.f12419b.size();
        for (int i = 0; i < size; i++) {
            C4130c cVar = this.f12419b.get(i);
            cVar.mo14250k();
            this.f12420c.put(cVar, m18236e(cVar));
        }
        this.f12421d.clear();
    }

    /* renamed from: f */
    public C4129e mo14222f() {
        return mo14223h(C4130c.f12445h);
    }

    /* renamed from: h */
    public C4129e mo14223h(C4130c cVar) {
        return this.f12420c.get(cVar);
    }
}
