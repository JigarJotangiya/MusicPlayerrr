package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0379b;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3536j;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.constraintlayout.widget.c */
/* compiled from: ConstraintSet */
public class C0430c {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f2316g = {0, 4, 8};

    /* renamed from: h */
    private static SparseIntArray f2317h = new SparseIntArray();

    /* renamed from: i */
    private static SparseIntArray f2318i = new SparseIntArray();

    /* renamed from: a */
    public String f2319a;

    /* renamed from: b */
    public String f2320b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f2321c = 0;

    /* renamed from: d */
    private HashMap<String, C0424a> f2322d = new HashMap<>();

    /* renamed from: e */
    private boolean f2323e = true;

    /* renamed from: f */
    private HashMap<Integer, C0431a> f2324f = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: ConstraintSet */
    public static class C0431a {

        /* renamed from: a */
        int f2325a;

        /* renamed from: b */
        String f2326b;

        /* renamed from: c */
        public final C0435d f2327c = new C0435d();

        /* renamed from: d */
        public final C0434c f2328d = new C0434c();

        /* renamed from: e */
        public final C0433b f2329e = new C0433b();

        /* renamed from: f */
        public final C0436e f2330f = new C0436e();

        /* renamed from: g */
        public HashMap<String, C0424a> f2331g = new HashMap<>();

        /* renamed from: h */
        C0432a f2332h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a */
        /* compiled from: ConstraintSet */
        static class C0432a {

            /* renamed from: a */
            int[] f2333a = new int[10];

            /* renamed from: b */
            int[] f2334b = new int[10];

            /* renamed from: c */
            int f2335c = 0;

            /* renamed from: d */
            int[] f2336d = new int[10];

            /* renamed from: e */
            float[] f2337e = new float[10];

            /* renamed from: f */
            int f2338f = 0;

            /* renamed from: g */
            int[] f2339g = new int[5];

            /* renamed from: h */
            String[] f2340h = new String[5];

            /* renamed from: i */
            int f2341i = 0;

            /* renamed from: j */
            int[] f2342j = new int[4];

            /* renamed from: k */
            boolean[] f2343k = new boolean[4];

            /* renamed from: l */
            int f2344l = 0;

            C0432a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2973a(int i, float f) {
                int i2 = this.f2338f;
                int[] iArr = this.f2336d;
                if (i2 >= iArr.length) {
                    this.f2336d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2337e;
                    this.f2337e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2336d;
                int i3 = this.f2338f;
                iArr2[i3] = i;
                float[] fArr2 = this.f2337e;
                this.f2338f = i3 + 1;
                fArr2[i3] = f;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo2974b(int i, int i2) {
                int i3 = this.f2335c;
                int[] iArr = this.f2333a;
                if (i3 >= iArr.length) {
                    this.f2333a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2334b;
                    this.f2334b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2333a;
                int i4 = this.f2335c;
                iArr3[i4] = i;
                int[] iArr4 = this.f2334b;
                this.f2335c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo2975c(int i, String str) {
                int i2 = this.f2341i;
                int[] iArr = this.f2339g;
                if (i2 >= iArr.length) {
                    this.f2339g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2340h;
                    this.f2340h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2339g;
                int i3 = this.f2341i;
                iArr2[i3] = i;
                String[] strArr2 = this.f2340h;
                this.f2341i = i3 + 1;
                strArr2[i3] = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo2976d(int i, boolean z) {
                int i2 = this.f2344l;
                int[] iArr = this.f2342j;
                if (i2 >= iArr.length) {
                    this.f2342j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2343k;
                    this.f2343k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2342j;
                int i3 = this.f2344l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f2343k;
                this.f2344l = i3 + 1;
                zArr2[i3] = z;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo2977e(C0431a aVar) {
                for (int i = 0; i < this.f2335c; i++) {
                    C0430c.m2758O(aVar, this.f2333a[i], this.f2334b[i]);
                }
                for (int i2 = 0; i2 < this.f2338f; i2++) {
                    C0430c.m2757N(aVar, this.f2336d[i2], this.f2337e[i2]);
                }
                for (int i3 = 0; i3 < this.f2341i; i3++) {
                    C0430c.m2759P(aVar, this.f2339g[i3], this.f2340h[i3]);
                }
                for (int i4 = 0; i4 < this.f2344l; i4++) {
                    C0430c.m2760Q(aVar, this.f2342j[i4], this.f2343k[i4]);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m2799g(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2325a = i;
            C0433b bVar = this.f2329e;
            bVar.f2386h = layoutParams.f2216d;
            bVar.f2388i = layoutParams.f2218e;
            bVar.f2390j = layoutParams.f2220f;
            bVar.f2392k = layoutParams.f2222g;
            bVar.f2394l = layoutParams.f2224h;
            bVar.f2396m = layoutParams.f2226i;
            bVar.f2398n = layoutParams.f2228j;
            bVar.f2400o = layoutParams.f2230k;
            bVar.f2402p = layoutParams.f2232l;
            bVar.f2403q = layoutParams.f2234m;
            bVar.f2404r = layoutParams.f2236n;
            bVar.f2405s = layoutParams.f2244r;
            bVar.f2406t = layoutParams.f2246s;
            bVar.f2407u = layoutParams.f2248t;
            bVar.f2408v = layoutParams.f2250u;
            bVar.f2409w = layoutParams.f2187D;
            bVar.f2410x = layoutParams.f2188E;
            bVar.f2411y = layoutParams.f2189F;
            bVar.f2412z = layoutParams.f2238o;
            bVar.f2346A = layoutParams.f2240p;
            bVar.f2347B = layoutParams.f2242q;
            bVar.f2348C = layoutParams.f2204U;
            bVar.f2349D = layoutParams.f2205V;
            bVar.f2350E = layoutParams.f2206W;
            bVar.f2384g = layoutParams.f2214c;
            C0433b bVar2 = this.f2329e;
            bVar2.f2380e = layoutParams.f2210a;
            bVar2.f2382f = layoutParams.f2212b;
            bVar2.f2376c = layoutParams.width;
            bVar2.f2378d = layoutParams.height;
            bVar2.f2351F = layoutParams.leftMargin;
            bVar2.f2352G = layoutParams.rightMargin;
            bVar2.f2353H = layoutParams.topMargin;
            bVar2.f2354I = layoutParams.bottomMargin;
            bVar2.f2357L = layoutParams.f2186C;
            bVar2.f2365T = layoutParams.f2193J;
            bVar2.f2366U = layoutParams.f2192I;
            bVar2.f2368W = layoutParams.f2195L;
            bVar2.f2367V = layoutParams.f2194K;
            bVar2.f2395l0 = layoutParams.f2207X;
            bVar2.f2397m0 = layoutParams.f2208Y;
            bVar2.f2369X = layoutParams.f2196M;
            bVar2.f2370Y = layoutParams.f2197N;
            bVar2.f2371Z = layoutParams.f2200Q;
            bVar2.f2373a0 = layoutParams.f2201R;
            bVar2.f2375b0 = layoutParams.f2198O;
            bVar2.f2377c0 = layoutParams.f2199P;
            bVar2.f2379d0 = layoutParams.f2202S;
            bVar2.f2381e0 = layoutParams.f2203T;
            bVar2.f2393k0 = layoutParams.f2209Z;
            bVar2.f2359N = layoutParams.f2252w;
            C0433b bVar3 = this.f2329e;
            bVar3.f2361P = layoutParams.f2254y;
            bVar3.f2358M = layoutParams.f2251v;
            bVar3.f2360O = layoutParams.f2253x;
            bVar3.f2363R = layoutParams.f2255z;
            bVar3.f2362Q = layoutParams.f2184A;
            bVar3.f2364S = layoutParams.f2185B;
            bVar3.f2401o0 = layoutParams.f2211a0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar3.f2355J = layoutParams.getMarginEnd();
                this.f2329e.f2356K = layoutParams.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m2800h(int i, Constraints.LayoutParams layoutParams) {
            m2799g(i, layoutParams);
            this.f2327c.f2431d = layoutParams.f2274u0;
            C0436e eVar = this.f2330f;
            eVar.f2435b = layoutParams.f2277x0;
            eVar.f2436c = layoutParams.f2278y0;
            eVar.f2437d = layoutParams.f2279z0;
            eVar.f2438e = layoutParams.f2267A0;
            eVar.f2439f = layoutParams.f2268B0;
            eVar.f2440g = layoutParams.f2269C0;
            eVar.f2441h = layoutParams.f2270D0;
            eVar.f2443j = layoutParams.f2271E0;
            eVar.f2444k = layoutParams.f2272F0;
            eVar.f2445l = layoutParams.f2273G0;
            eVar.f2447n = layoutParams.f2276w0;
            eVar.f2446m = layoutParams.f2275v0;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m2801i(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m2800h(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0433b bVar = this.f2329e;
                bVar.f2387h0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2383f0 = barrier.getType();
                this.f2329e.f2389i0 = barrier.getReferencedIds();
                this.f2329e.f2385g0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2970d(C0431a aVar) {
            C0432a aVar2 = this.f2332h;
            if (aVar2 != null) {
                aVar2.mo2977e(aVar);
            }
        }

        /* renamed from: e */
        public void mo2971e(ConstraintLayout.LayoutParams layoutParams) {
            C0433b bVar = this.f2329e;
            layoutParams.f2216d = bVar.f2386h;
            layoutParams.f2218e = bVar.f2388i;
            layoutParams.f2220f = bVar.f2390j;
            layoutParams.f2222g = bVar.f2392k;
            layoutParams.f2224h = bVar.f2394l;
            layoutParams.f2226i = bVar.f2396m;
            layoutParams.f2228j = bVar.f2398n;
            layoutParams.f2230k = bVar.f2400o;
            layoutParams.f2232l = bVar.f2402p;
            layoutParams.f2234m = bVar.f2403q;
            layoutParams.f2236n = bVar.f2404r;
            layoutParams.f2244r = bVar.f2405s;
            layoutParams.f2246s = bVar.f2406t;
            layoutParams.f2248t = bVar.f2407u;
            layoutParams.f2250u = bVar.f2408v;
            layoutParams.leftMargin = bVar.f2351F;
            layoutParams.rightMargin = bVar.f2352G;
            layoutParams.topMargin = bVar.f2353H;
            layoutParams.bottomMargin = bVar.f2354I;
            layoutParams.f2255z = bVar.f2363R;
            layoutParams.f2184A = bVar.f2362Q;
            layoutParams.f2252w = bVar.f2359N;
            layoutParams.f2254y = bVar.f2361P;
            layoutParams.f2187D = bVar.f2409w;
            layoutParams.f2188E = bVar.f2410x;
            C0433b bVar2 = this.f2329e;
            layoutParams.f2238o = bVar2.f2412z;
            layoutParams.f2240p = bVar2.f2346A;
            layoutParams.f2242q = bVar2.f2347B;
            layoutParams.f2189F = bVar2.f2411y;
            layoutParams.f2204U = bVar2.f2348C;
            layoutParams.f2205V = bVar2.f2349D;
            layoutParams.f2193J = bVar2.f2365T;
            layoutParams.f2192I = bVar2.f2366U;
            layoutParams.f2195L = bVar2.f2368W;
            layoutParams.f2194K = bVar2.f2367V;
            layoutParams.f2207X = bVar2.f2395l0;
            layoutParams.f2208Y = bVar2.f2397m0;
            layoutParams.f2196M = bVar2.f2369X;
            layoutParams.f2197N = bVar2.f2370Y;
            layoutParams.f2200Q = bVar2.f2371Z;
            layoutParams.f2201R = bVar2.f2373a0;
            layoutParams.f2198O = bVar2.f2375b0;
            layoutParams.f2199P = bVar2.f2377c0;
            layoutParams.f2202S = bVar2.f2379d0;
            layoutParams.f2203T = bVar2.f2381e0;
            layoutParams.f2206W = bVar2.f2350E;
            layoutParams.f2214c = bVar2.f2384g;
            layoutParams.f2210a = bVar2.f2380e;
            layoutParams.f2212b = bVar2.f2382f;
            layoutParams.width = bVar2.f2376c;
            C0433b bVar3 = this.f2329e;
            layoutParams.height = bVar3.f2378d;
            String str = bVar3.f2393k0;
            if (str != null) {
                layoutParams.f2209Z = str;
            }
            layoutParams.f2211a0 = bVar3.f2401o0;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(bVar3.f2356K);
                layoutParams.setMarginEnd(this.f2329e.f2355J);
            }
            layoutParams.mo2891c();
        }

        /* renamed from: f */
        public C0431a clone() {
            C0431a aVar = new C0431a();
            aVar.f2329e.mo2978a(this.f2329e);
            aVar.f2328d.mo2980a(this.f2328d);
            aVar.f2327c.mo2982a(this.f2327c);
            aVar.f2330f.mo2984a(this.f2330f);
            aVar.f2325a = this.f2325a;
            aVar.f2332h = this.f2332h;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* compiled from: ConstraintSet */
    public static class C0433b {

        /* renamed from: p0 */
        private static SparseIntArray f2345p0;

        /* renamed from: A */
        public int f2346A = 0;

        /* renamed from: B */
        public float f2347B = 0.0f;

        /* renamed from: C */
        public int f2348C = -1;

        /* renamed from: D */
        public int f2349D = -1;

        /* renamed from: E */
        public int f2350E = -1;

        /* renamed from: F */
        public int f2351F = 0;

        /* renamed from: G */
        public int f2352G = 0;

        /* renamed from: H */
        public int f2353H = 0;

        /* renamed from: I */
        public int f2354I = 0;

        /* renamed from: J */
        public int f2355J = 0;

        /* renamed from: K */
        public int f2356K = 0;

        /* renamed from: L */
        public int f2357L = 0;

        /* renamed from: M */
        public int f2358M = Integer.MIN_VALUE;

        /* renamed from: N */
        public int f2359N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f2360O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f2361P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f2362Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f2363R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f2364S = Integer.MIN_VALUE;

        /* renamed from: T */
        public float f2365T = -1.0f;

        /* renamed from: U */
        public float f2366U = -1.0f;

        /* renamed from: V */
        public int f2367V = 0;

        /* renamed from: W */
        public int f2368W = 0;

        /* renamed from: X */
        public int f2369X = 0;

        /* renamed from: Y */
        public int f2370Y = 0;

        /* renamed from: Z */
        public int f2371Z = 0;

        /* renamed from: a */
        public boolean f2372a = false;

        /* renamed from: a0 */
        public int f2373a0 = 0;

        /* renamed from: b */
        public boolean f2374b = false;

        /* renamed from: b0 */
        public int f2375b0 = 0;

        /* renamed from: c */
        public int f2376c;

        /* renamed from: c0 */
        public int f2377c0 = 0;

        /* renamed from: d */
        public int f2378d;

        /* renamed from: d0 */
        public float f2379d0 = 1.0f;

        /* renamed from: e */
        public int f2380e = -1;

        /* renamed from: e0 */
        public float f2381e0 = 1.0f;

        /* renamed from: f */
        public int f2382f = -1;

        /* renamed from: f0 */
        public int f2383f0 = -1;

        /* renamed from: g */
        public float f2384g = -1.0f;

        /* renamed from: g0 */
        public int f2385g0 = 0;

        /* renamed from: h */
        public int f2386h = -1;

        /* renamed from: h0 */
        public int f2387h0 = -1;

        /* renamed from: i */
        public int f2388i = -1;

        /* renamed from: i0 */
        public int[] f2389i0;

        /* renamed from: j */
        public int f2390j = -1;

        /* renamed from: j0 */
        public String f2391j0;

        /* renamed from: k */
        public int f2392k = -1;

        /* renamed from: k0 */
        public String f2393k0;

        /* renamed from: l */
        public int f2394l = -1;

        /* renamed from: l0 */
        public boolean f2395l0 = false;

        /* renamed from: m */
        public int f2396m = -1;

        /* renamed from: m0 */
        public boolean f2397m0 = false;

        /* renamed from: n */
        public int f2398n = -1;

        /* renamed from: n0 */
        public boolean f2399n0 = true;

        /* renamed from: o */
        public int f2400o = -1;

        /* renamed from: o0 */
        public int f2401o0 = 0;

        /* renamed from: p */
        public int f2402p = -1;

        /* renamed from: q */
        public int f2403q = -1;

        /* renamed from: r */
        public int f2404r = -1;

        /* renamed from: s */
        public int f2405s = -1;

        /* renamed from: t */
        public int f2406t = -1;

        /* renamed from: u */
        public int f2407u = -1;

        /* renamed from: v */
        public int f2408v = -1;

        /* renamed from: w */
        public float f2409w = 0.5f;

        /* renamed from: x */
        public float f2410x = 0.5f;

        /* renamed from: y */
        public String f2411y = null;

        /* renamed from: z */
        public int f2412z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2345p0 = sparseIntArray;
            sparseIntArray.append(C0439f.Layout_layout_constraintLeft_toLeftOf, 24);
            f2345p0.append(C0439f.Layout_layout_constraintLeft_toRightOf, 25);
            f2345p0.append(C0439f.Layout_layout_constraintRight_toLeftOf, 28);
            f2345p0.append(C0439f.Layout_layout_constraintRight_toRightOf, 29);
            f2345p0.append(C0439f.Layout_layout_constraintTop_toTopOf, 35);
            f2345p0.append(C0439f.Layout_layout_constraintTop_toBottomOf, 34);
            f2345p0.append(C0439f.Layout_layout_constraintBottom_toTopOf, 4);
            f2345p0.append(C0439f.Layout_layout_constraintBottom_toBottomOf, 3);
            f2345p0.append(C0439f.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2345p0.append(C0439f.Layout_layout_editor_absoluteX, 6);
            f2345p0.append(C0439f.Layout_layout_editor_absoluteY, 7);
            f2345p0.append(C0439f.Layout_layout_constraintGuide_begin, 17);
            f2345p0.append(C0439f.Layout_layout_constraintGuide_end, 18);
            f2345p0.append(C0439f.Layout_layout_constraintGuide_percent, 19);
            f2345p0.append(C0439f.Layout_android_orientation, 26);
            f2345p0.append(C0439f.Layout_layout_constraintStart_toEndOf, 31);
            f2345p0.append(C0439f.Layout_layout_constraintStart_toStartOf, 32);
            f2345p0.append(C0439f.Layout_layout_constraintEnd_toStartOf, 10);
            f2345p0.append(C0439f.Layout_layout_constraintEnd_toEndOf, 9);
            f2345p0.append(C0439f.Layout_layout_goneMarginLeft, 13);
            f2345p0.append(C0439f.Layout_layout_goneMarginTop, 16);
            f2345p0.append(C0439f.Layout_layout_goneMarginRight, 14);
            f2345p0.append(C0439f.Layout_layout_goneMarginBottom, 11);
            f2345p0.append(C0439f.Layout_layout_goneMarginStart, 15);
            f2345p0.append(C0439f.Layout_layout_goneMarginEnd, 12);
            f2345p0.append(C0439f.Layout_layout_constraintVertical_weight, 38);
            f2345p0.append(C0439f.Layout_layout_constraintHorizontal_weight, 37);
            f2345p0.append(C0439f.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2345p0.append(C0439f.Layout_layout_constraintVertical_chainStyle, 40);
            f2345p0.append(C0439f.Layout_layout_constraintHorizontal_bias, 20);
            f2345p0.append(C0439f.Layout_layout_constraintVertical_bias, 36);
            f2345p0.append(C0439f.Layout_layout_constraintDimensionRatio, 5);
            f2345p0.append(C0439f.Layout_layout_constraintLeft_creator, 76);
            f2345p0.append(C0439f.Layout_layout_constraintTop_creator, 76);
            f2345p0.append(C0439f.Layout_layout_constraintRight_creator, 76);
            f2345p0.append(C0439f.Layout_layout_constraintBottom_creator, 76);
            f2345p0.append(C0439f.Layout_layout_constraintBaseline_creator, 76);
            f2345p0.append(C0439f.Layout_android_layout_marginLeft, 23);
            f2345p0.append(C0439f.Layout_android_layout_marginRight, 27);
            f2345p0.append(C0439f.Layout_android_layout_marginStart, 30);
            f2345p0.append(C0439f.Layout_android_layout_marginEnd, 8);
            f2345p0.append(C0439f.Layout_android_layout_marginTop, 33);
            f2345p0.append(C0439f.Layout_android_layout_marginBottom, 2);
            f2345p0.append(C0439f.Layout_android_layout_width, 22);
            f2345p0.append(C0439f.Layout_android_layout_height, 21);
            f2345p0.append(C0439f.Layout_layout_constraintWidth, 41);
            f2345p0.append(C0439f.Layout_layout_constraintHeight, 42);
            f2345p0.append(C0439f.Layout_layout_constrainedWidth, 41);
            f2345p0.append(C0439f.Layout_layout_constrainedHeight, 42);
            f2345p0.append(C0439f.Layout_layout_wrapBehaviorInParent, 97);
            f2345p0.append(C0439f.Layout_layout_constraintCircle, 61);
            f2345p0.append(C0439f.Layout_layout_constraintCircleRadius, 62);
            f2345p0.append(C0439f.Layout_layout_constraintCircleAngle, 63);
            f2345p0.append(C0439f.Layout_layout_constraintWidth_percent, 69);
            f2345p0.append(C0439f.Layout_layout_constraintHeight_percent, 70);
            f2345p0.append(C0439f.Layout_chainUseRtl, 71);
            f2345p0.append(C0439f.Layout_barrierDirection, 72);
            f2345p0.append(C0439f.Layout_barrierMargin, 73);
            f2345p0.append(C0439f.Layout_constraint_referenced_ids, 74);
            f2345p0.append(C0439f.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo2978a(C0433b bVar) {
            this.f2372a = bVar.f2372a;
            this.f2376c = bVar.f2376c;
            this.f2374b = bVar.f2374b;
            this.f2378d = bVar.f2378d;
            this.f2380e = bVar.f2380e;
            this.f2382f = bVar.f2382f;
            this.f2384g = bVar.f2384g;
            this.f2386h = bVar.f2386h;
            this.f2388i = bVar.f2388i;
            this.f2390j = bVar.f2390j;
            this.f2392k = bVar.f2392k;
            this.f2394l = bVar.f2394l;
            this.f2396m = bVar.f2396m;
            this.f2398n = bVar.f2398n;
            this.f2400o = bVar.f2400o;
            this.f2402p = bVar.f2402p;
            this.f2403q = bVar.f2403q;
            this.f2404r = bVar.f2404r;
            this.f2405s = bVar.f2405s;
            this.f2406t = bVar.f2406t;
            this.f2407u = bVar.f2407u;
            this.f2408v = bVar.f2408v;
            this.f2409w = bVar.f2409w;
            this.f2410x = bVar.f2410x;
            this.f2411y = bVar.f2411y;
            this.f2412z = bVar.f2412z;
            this.f2346A = bVar.f2346A;
            this.f2347B = bVar.f2347B;
            this.f2348C = bVar.f2348C;
            this.f2349D = bVar.f2349D;
            this.f2350E = bVar.f2350E;
            this.f2351F = bVar.f2351F;
            this.f2352G = bVar.f2352G;
            this.f2353H = bVar.f2353H;
            this.f2354I = bVar.f2354I;
            this.f2355J = bVar.f2355J;
            this.f2356K = bVar.f2356K;
            this.f2357L = bVar.f2357L;
            this.f2358M = bVar.f2358M;
            this.f2359N = bVar.f2359N;
            this.f2360O = bVar.f2360O;
            this.f2361P = bVar.f2361P;
            this.f2362Q = bVar.f2362Q;
            this.f2363R = bVar.f2363R;
            this.f2364S = bVar.f2364S;
            this.f2365T = bVar.f2365T;
            this.f2366U = bVar.f2366U;
            this.f2367V = bVar.f2367V;
            this.f2368W = bVar.f2368W;
            this.f2369X = bVar.f2369X;
            this.f2370Y = bVar.f2370Y;
            this.f2371Z = bVar.f2371Z;
            this.f2373a0 = bVar.f2373a0;
            this.f2375b0 = bVar.f2375b0;
            this.f2377c0 = bVar.f2377c0;
            this.f2379d0 = bVar.f2379d0;
            this.f2381e0 = bVar.f2381e0;
            this.f2383f0 = bVar.f2383f0;
            this.f2385g0 = bVar.f2385g0;
            this.f2387h0 = bVar.f2387h0;
            this.f2393k0 = bVar.f2393k0;
            int[] iArr = bVar.f2389i0;
            if (iArr == null || bVar.f2391j0 != null) {
                this.f2389i0 = null;
            } else {
                this.f2389i0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2391j0 = bVar.f2391j0;
            this.f2395l0 = bVar.f2395l0;
            this.f2397m0 = bVar.f2397m0;
            this.f2399n0 = bVar.f2399n0;
            this.f2401o0 = bVar.f2401o0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2979b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.Layout);
            this.f2374b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2345p0.get(index);
                if (i2 == 80) {
                    this.f2395l0 = obtainStyledAttributes.getBoolean(index, this.f2395l0);
                } else if (i2 == 81) {
                    this.f2397m0 = obtainStyledAttributes.getBoolean(index, this.f2397m0);
                } else if (i2 != 97) {
                    switch (i2) {
                        case 1:
                            this.f2402p = C0430c.m2751F(obtainStyledAttributes, index, this.f2402p);
                            break;
                        case 2:
                            this.f2354I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2354I);
                            break;
                        case 3:
                            this.f2400o = C0430c.m2751F(obtainStyledAttributes, index, this.f2400o);
                            break;
                        case 4:
                            this.f2398n = C0430c.m2751F(obtainStyledAttributes, index, this.f2398n);
                            break;
                        case 5:
                            this.f2411y = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f2348C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2348C);
                            break;
                        case 7:
                            this.f2349D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2349D);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2355J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2355J);
                                break;
                            }
                        case 9:
                            this.f2408v = C0430c.m2751F(obtainStyledAttributes, index, this.f2408v);
                            break;
                        case 10:
                            this.f2407u = C0430c.m2751F(obtainStyledAttributes, index, this.f2407u);
                            break;
                        case 11:
                            this.f2361P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2361P);
                            break;
                        case 12:
                            this.f2362Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2362Q);
                            break;
                        case 13:
                            this.f2358M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2358M);
                            break;
                        case 14:
                            this.f2360O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2360O);
                            break;
                        case 15:
                            this.f2363R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2363R);
                            break;
                        case 16:
                            this.f2359N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2359N);
                            break;
                        case 17:
                            this.f2380e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2380e);
                            break;
                        case 18:
                            this.f2382f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2382f);
                            break;
                        case 19:
                            this.f2384g = obtainStyledAttributes.getFloat(index, this.f2384g);
                            break;
                        case 20:
                            this.f2409w = obtainStyledAttributes.getFloat(index, this.f2409w);
                            break;
                        case 21:
                            this.f2378d = obtainStyledAttributes.getLayoutDimension(index, this.f2378d);
                            break;
                        case 22:
                            this.f2376c = obtainStyledAttributes.getLayoutDimension(index, this.f2376c);
                            break;
                        case 23:
                            this.f2351F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2351F);
                            break;
                        case 24:
                            this.f2386h = C0430c.m2751F(obtainStyledAttributes, index, this.f2386h);
                            break;
                        case 25:
                            this.f2388i = C0430c.m2751F(obtainStyledAttributes, index, this.f2388i);
                            break;
                        case 26:
                            this.f2350E = obtainStyledAttributes.getInt(index, this.f2350E);
                            break;
                        case 27:
                            this.f2352G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2352G);
                            break;
                        case 28:
                            this.f2390j = C0430c.m2751F(obtainStyledAttributes, index, this.f2390j);
                            break;
                        case 29:
                            this.f2392k = C0430c.m2751F(obtainStyledAttributes, index, this.f2392k);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f2356K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2356K);
                                break;
                            }
                        case 31:
                            this.f2405s = C0430c.m2751F(obtainStyledAttributes, index, this.f2405s);
                            break;
                        case 32:
                            this.f2406t = C0430c.m2751F(obtainStyledAttributes, index, this.f2406t);
                            break;
                        case 33:
                            this.f2353H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2353H);
                            break;
                        case 34:
                            this.f2396m = C0430c.m2751F(obtainStyledAttributes, index, this.f2396m);
                            break;
                        case 35:
                            this.f2394l = C0430c.m2751F(obtainStyledAttributes, index, this.f2394l);
                            break;
                        case 36:
                            this.f2410x = obtainStyledAttributes.getFloat(index, this.f2410x);
                            break;
                        case 37:
                            this.f2366U = obtainStyledAttributes.getFloat(index, this.f2366U);
                            break;
                        case 38:
                            this.f2365T = obtainStyledAttributes.getFloat(index, this.f2365T);
                            break;
                        case 39:
                            this.f2367V = obtainStyledAttributes.getInt(index, this.f2367V);
                            break;
                        case 40:
                            this.f2368W = obtainStyledAttributes.getInt(index, this.f2368W);
                            break;
                        case 41:
                            C0430c.m2752G(this, obtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            C0430c.m2752G(this, obtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2369X = obtainStyledAttributes.getInt(index, this.f2369X);
                                    break;
                                case 55:
                                    this.f2370Y = obtainStyledAttributes.getInt(index, this.f2370Y);
                                    break;
                                case 56:
                                    this.f2371Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2371Z);
                                    break;
                                case 57:
                                    this.f2373a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2373a0);
                                    break;
                                case 58:
                                    this.f2375b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2375b0);
                                    break;
                                case 59:
                                    this.f2377c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2377c0);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2412z = C0430c.m2751F(obtainStyledAttributes, index, this.f2412z);
                                            break;
                                        case 62:
                                            this.f2346A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2346A);
                                            break;
                                        case 63:
                                            this.f2347B = obtainStyledAttributes.getFloat(index, this.f2347B);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2379d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2381e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f2383f0 = obtainStyledAttributes.getInt(index, this.f2383f0);
                                                    break;
                                                case 73:
                                                    this.f2385g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2385g0);
                                                    break;
                                                case 74:
                                                    this.f2391j0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2399n0 = obtainStyledAttributes.getBoolean(index, this.f2399n0);
                                                    break;
                                                case 76:
                                                    String hexString = Integer.toHexString(index);
                                                    int i3 = f2345p0.get(index);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                                                    sb.append("unused attribute 0x");
                                                    sb.append(hexString);
                                                    sb.append("   ");
                                                    sb.append(i3);
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                                case 77:
                                                    this.f2393k0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 91:
                                                            this.f2403q = C0430c.m2751F(obtainStyledAttributes, index, this.f2403q);
                                                            break;
                                                        case 92:
                                                            this.f2404r = C0430c.m2751F(obtainStyledAttributes, index, this.f2404r);
                                                            break;
                                                        case 93:
                                                            this.f2357L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2357L);
                                                            break;
                                                        case 94:
                                                            this.f2364S = obtainStyledAttributes.getDimensionPixelSize(index, this.f2364S);
                                                            break;
                                                        default:
                                                            String hexString2 = Integer.toHexString(index);
                                                            int i4 = f2345p0.get(index);
                                                            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                                                            sb2.append("Unknown attribute 0x");
                                                            sb2.append(hexString2);
                                                            sb2.append("   ");
                                                            sb2.append(i4);
                                                            Log.w("ConstraintSet", sb2.toString());
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2401o0 = obtainStyledAttributes.getInt(index, this.f2401o0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    /* compiled from: ConstraintSet */
    public static class C0434c {

        /* renamed from: o */
        private static SparseIntArray f2413o;

        /* renamed from: a */
        public boolean f2414a = false;

        /* renamed from: b */
        public int f2415b = -1;

        /* renamed from: c */
        public int f2416c = 0;

        /* renamed from: d */
        public String f2417d = null;

        /* renamed from: e */
        public int f2418e = -1;

        /* renamed from: f */
        public int f2419f = 0;

        /* renamed from: g */
        public float f2420g = Float.NaN;

        /* renamed from: h */
        public int f2421h = -1;

        /* renamed from: i */
        public float f2422i = Float.NaN;

        /* renamed from: j */
        public float f2423j = Float.NaN;

        /* renamed from: k */
        public int f2424k = -1;

        /* renamed from: l */
        public String f2425l = null;

        /* renamed from: m */
        public int f2426m = -3;

        /* renamed from: n */
        public int f2427n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2413o = sparseIntArray;
            sparseIntArray.append(C0439f.Motion_motionPathRotate, 1);
            f2413o.append(C0439f.Motion_pathMotionArc, 2);
            f2413o.append(C0439f.Motion_transitionEasing, 3);
            f2413o.append(C0439f.Motion_drawPath, 4);
            f2413o.append(C0439f.Motion_animateRelativeTo, 5);
            f2413o.append(C0439f.Motion_animateCircleAngleTo, 6);
            f2413o.append(C0439f.Motion_motionStagger, 7);
            f2413o.append(C0439f.Motion_quantizeMotionSteps, 8);
            f2413o.append(C0439f.Motion_quantizeMotionPhase, 9);
            f2413o.append(C0439f.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void mo2980a(C0434c cVar) {
            this.f2414a = cVar.f2414a;
            this.f2415b = cVar.f2415b;
            this.f2417d = cVar.f2417d;
            this.f2418e = cVar.f2418e;
            this.f2419f = cVar.f2419f;
            this.f2422i = cVar.f2422i;
            this.f2420g = cVar.f2420g;
            this.f2421h = cVar.f2421h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2981b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.Motion);
            this.f2414a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2413o.get(index)) {
                    case 1:
                        this.f2422i = obtainStyledAttributes.getFloat(index, this.f2422i);
                        break;
                    case 2:
                        this.f2418e = obtainStyledAttributes.getInt(index, this.f2418e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2417d = C3500c.f11187c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2417d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2419f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2415b = C0430c.m2751F(obtainStyledAttributes, index, this.f2415b);
                        break;
                    case 6:
                        this.f2416c = obtainStyledAttributes.getInteger(index, this.f2416c);
                        break;
                    case 7:
                        this.f2420g = obtainStyledAttributes.getFloat(index, this.f2420g);
                        break;
                    case 8:
                        this.f2424k = obtainStyledAttributes.getInteger(index, this.f2424k);
                        break;
                    case 9:
                        this.f2423j = obtainStyledAttributes.getFloat(index, this.f2423j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f2426m = obtainStyledAttributes.getInteger(index, this.f2427n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f2425l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f2426m = -1;
                                    break;
                                } else {
                                    this.f2427n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f2426m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2427n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f2426m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    /* compiled from: ConstraintSet */
    public static class C0435d {

        /* renamed from: a */
        public boolean f2428a = false;

        /* renamed from: b */
        public int f2429b = 0;

        /* renamed from: c */
        public int f2430c = 0;

        /* renamed from: d */
        public float f2431d = 1.0f;

        /* renamed from: e */
        public float f2432e = Float.NaN;

        /* renamed from: a */
        public void mo2982a(C0435d dVar) {
            this.f2428a = dVar.f2428a;
            this.f2429b = dVar.f2429b;
            this.f2431d = dVar.f2431d;
            this.f2432e = dVar.f2432e;
            this.f2430c = dVar.f2430c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2983b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.PropertySet);
            this.f2428a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.PropertySet_android_alpha) {
                    this.f2431d = obtainStyledAttributes.getFloat(index, this.f2431d);
                } else if (index == C0439f.PropertySet_android_visibility) {
                    this.f2429b = obtainStyledAttributes.getInt(index, this.f2429b);
                    this.f2429b = C0430c.f2316g[this.f2429b];
                } else if (index == C0439f.PropertySet_visibilityMode) {
                    this.f2430c = obtainStyledAttributes.getInt(index, this.f2430c);
                } else if (index == C0439f.PropertySet_motionProgress) {
                    this.f2432e = obtainStyledAttributes.getFloat(index, this.f2432e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    /* compiled from: ConstraintSet */
    public static class C0436e {

        /* renamed from: o */
        private static SparseIntArray f2433o;

        /* renamed from: a */
        public boolean f2434a = false;

        /* renamed from: b */
        public float f2435b = 0.0f;

        /* renamed from: c */
        public float f2436c = 0.0f;

        /* renamed from: d */
        public float f2437d = 0.0f;

        /* renamed from: e */
        public float f2438e = 1.0f;

        /* renamed from: f */
        public float f2439f = 1.0f;

        /* renamed from: g */
        public float f2440g = Float.NaN;

        /* renamed from: h */
        public float f2441h = Float.NaN;

        /* renamed from: i */
        public int f2442i = -1;

        /* renamed from: j */
        public float f2443j = 0.0f;

        /* renamed from: k */
        public float f2444k = 0.0f;

        /* renamed from: l */
        public float f2445l = 0.0f;

        /* renamed from: m */
        public boolean f2446m = false;

        /* renamed from: n */
        public float f2447n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2433o = sparseIntArray;
            sparseIntArray.append(C0439f.Transform_android_rotation, 1);
            f2433o.append(C0439f.Transform_android_rotationX, 2);
            f2433o.append(C0439f.Transform_android_rotationY, 3);
            f2433o.append(C0439f.Transform_android_scaleX, 4);
            f2433o.append(C0439f.Transform_android_scaleY, 5);
            f2433o.append(C0439f.Transform_android_transformPivotX, 6);
            f2433o.append(C0439f.Transform_android_transformPivotY, 7);
            f2433o.append(C0439f.Transform_android_translationX, 8);
            f2433o.append(C0439f.Transform_android_translationY, 9);
            f2433o.append(C0439f.Transform_android_translationZ, 10);
            f2433o.append(C0439f.Transform_android_elevation, 11);
            f2433o.append(C0439f.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void mo2984a(C0436e eVar) {
            this.f2434a = eVar.f2434a;
            this.f2435b = eVar.f2435b;
            this.f2436c = eVar.f2436c;
            this.f2437d = eVar.f2437d;
            this.f2438e = eVar.f2438e;
            this.f2439f = eVar.f2439f;
            this.f2440g = eVar.f2440g;
            this.f2441h = eVar.f2441h;
            this.f2442i = eVar.f2442i;
            this.f2443j = eVar.f2443j;
            this.f2444k = eVar.f2444k;
            this.f2445l = eVar.f2445l;
            this.f2446m = eVar.f2446m;
            this.f2447n = eVar.f2447n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2985b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.Transform);
            this.f2434a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2433o.get(index)) {
                    case 1:
                        this.f2435b = obtainStyledAttributes.getFloat(index, this.f2435b);
                        break;
                    case 2:
                        this.f2436c = obtainStyledAttributes.getFloat(index, this.f2436c);
                        break;
                    case 3:
                        this.f2437d = obtainStyledAttributes.getFloat(index, this.f2437d);
                        break;
                    case 4:
                        this.f2438e = obtainStyledAttributes.getFloat(index, this.f2438e);
                        break;
                    case 5:
                        this.f2439f = obtainStyledAttributes.getFloat(index, this.f2439f);
                        break;
                    case 6:
                        this.f2440g = obtainStyledAttributes.getDimension(index, this.f2440g);
                        break;
                    case 7:
                        this.f2441h = obtainStyledAttributes.getDimension(index, this.f2441h);
                        break;
                    case 8:
                        this.f2443j = obtainStyledAttributes.getDimension(index, this.f2443j);
                        break;
                    case 9:
                        this.f2444k = obtainStyledAttributes.getDimension(index, this.f2444k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2445l = obtainStyledAttributes.getDimension(index, this.f2445l);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2446m = true;
                            this.f2447n = obtainStyledAttributes.getDimension(index, this.f2447n);
                            break;
                        }
                    case 12:
                        this.f2442i = C0430c.m2751F(obtainStyledAttributes, index, this.f2442i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2317h.append(C0439f.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2317h.append(C0439f.Constraint_layout_constraintLeft_toRightOf, 26);
        f2317h.append(C0439f.Constraint_layout_constraintRight_toLeftOf, 29);
        f2317h.append(C0439f.Constraint_layout_constraintRight_toRightOf, 30);
        f2317h.append(C0439f.Constraint_layout_constraintTop_toTopOf, 36);
        f2317h.append(C0439f.Constraint_layout_constraintTop_toBottomOf, 35);
        f2317h.append(C0439f.Constraint_layout_constraintBottom_toTopOf, 4);
        f2317h.append(C0439f.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2317h.append(C0439f.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2317h.append(C0439f.Constraint_layout_constraintBaseline_toTopOf, 91);
        f2317h.append(C0439f.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f2317h.append(C0439f.Constraint_layout_editor_absoluteX, 6);
        f2317h.append(C0439f.Constraint_layout_editor_absoluteY, 7);
        f2317h.append(C0439f.Constraint_layout_constraintGuide_begin, 17);
        f2317h.append(C0439f.Constraint_layout_constraintGuide_end, 18);
        f2317h.append(C0439f.Constraint_layout_constraintGuide_percent, 19);
        f2317h.append(C0439f.Constraint_android_orientation, 27);
        f2317h.append(C0439f.Constraint_layout_constraintStart_toEndOf, 32);
        f2317h.append(C0439f.Constraint_layout_constraintStart_toStartOf, 33);
        f2317h.append(C0439f.Constraint_layout_constraintEnd_toStartOf, 10);
        f2317h.append(C0439f.Constraint_layout_constraintEnd_toEndOf, 9);
        f2317h.append(C0439f.Constraint_layout_goneMarginLeft, 13);
        f2317h.append(C0439f.Constraint_layout_goneMarginTop, 16);
        f2317h.append(C0439f.Constraint_layout_goneMarginRight, 14);
        f2317h.append(C0439f.Constraint_layout_goneMarginBottom, 11);
        f2317h.append(C0439f.Constraint_layout_goneMarginStart, 15);
        f2317h.append(C0439f.Constraint_layout_goneMarginEnd, 12);
        f2317h.append(C0439f.Constraint_layout_constraintVertical_weight, 40);
        f2317h.append(C0439f.Constraint_layout_constraintHorizontal_weight, 39);
        f2317h.append(C0439f.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2317h.append(C0439f.Constraint_layout_constraintVertical_chainStyle, 42);
        f2317h.append(C0439f.Constraint_layout_constraintHorizontal_bias, 20);
        f2317h.append(C0439f.Constraint_layout_constraintVertical_bias, 37);
        f2317h.append(C0439f.Constraint_layout_constraintDimensionRatio, 5);
        f2317h.append(C0439f.Constraint_layout_constraintLeft_creator, 87);
        f2317h.append(C0439f.Constraint_layout_constraintTop_creator, 87);
        f2317h.append(C0439f.Constraint_layout_constraintRight_creator, 87);
        f2317h.append(C0439f.Constraint_layout_constraintBottom_creator, 87);
        f2317h.append(C0439f.Constraint_layout_constraintBaseline_creator, 87);
        f2317h.append(C0439f.Constraint_android_layout_marginLeft, 24);
        f2317h.append(C0439f.Constraint_android_layout_marginRight, 28);
        f2317h.append(C0439f.Constraint_android_layout_marginStart, 31);
        f2317h.append(C0439f.Constraint_android_layout_marginEnd, 8);
        f2317h.append(C0439f.Constraint_android_layout_marginTop, 34);
        f2317h.append(C0439f.Constraint_android_layout_marginBottom, 2);
        f2317h.append(C0439f.Constraint_android_layout_width, 23);
        f2317h.append(C0439f.Constraint_android_layout_height, 21);
        f2317h.append(C0439f.Constraint_layout_constraintWidth, 95);
        f2317h.append(C0439f.Constraint_layout_constraintHeight, 96);
        f2317h.append(C0439f.Constraint_android_visibility, 22);
        f2317h.append(C0439f.Constraint_android_alpha, 43);
        f2317h.append(C0439f.Constraint_android_elevation, 44);
        f2317h.append(C0439f.Constraint_android_rotationX, 45);
        f2317h.append(C0439f.Constraint_android_rotationY, 46);
        f2317h.append(C0439f.Constraint_android_rotation, 60);
        f2317h.append(C0439f.Constraint_android_scaleX, 47);
        f2317h.append(C0439f.Constraint_android_scaleY, 48);
        f2317h.append(C0439f.Constraint_android_transformPivotX, 49);
        f2317h.append(C0439f.Constraint_android_transformPivotY, 50);
        f2317h.append(C0439f.Constraint_android_translationX, 51);
        f2317h.append(C0439f.Constraint_android_translationY, 52);
        f2317h.append(C0439f.Constraint_android_translationZ, 53);
        f2317h.append(C0439f.Constraint_layout_constraintWidth_default, 54);
        f2317h.append(C0439f.Constraint_layout_constraintHeight_default, 55);
        f2317h.append(C0439f.Constraint_layout_constraintWidth_max, 56);
        f2317h.append(C0439f.Constraint_layout_constraintHeight_max, 57);
        f2317h.append(C0439f.Constraint_layout_constraintWidth_min, 58);
        f2317h.append(C0439f.Constraint_layout_constraintHeight_min, 59);
        f2317h.append(C0439f.Constraint_layout_constraintCircle, 61);
        f2317h.append(C0439f.Constraint_layout_constraintCircleRadius, 62);
        f2317h.append(C0439f.Constraint_layout_constraintCircleAngle, 63);
        f2317h.append(C0439f.Constraint_animateRelativeTo, 64);
        f2317h.append(C0439f.Constraint_transitionEasing, 65);
        f2317h.append(C0439f.Constraint_drawPath, 66);
        f2317h.append(C0439f.Constraint_transitionPathRotate, 67);
        f2317h.append(C0439f.Constraint_motionStagger, 79);
        f2317h.append(C0439f.Constraint_android_id, 38);
        f2317h.append(C0439f.Constraint_motionProgress, 68);
        f2317h.append(C0439f.Constraint_layout_constraintWidth_percent, 69);
        f2317h.append(C0439f.Constraint_layout_constraintHeight_percent, 70);
        f2317h.append(C0439f.Constraint_layout_wrapBehaviorInParent, 97);
        f2317h.append(C0439f.Constraint_chainUseRtl, 71);
        f2317h.append(C0439f.Constraint_barrierDirection, 72);
        f2317h.append(C0439f.Constraint_barrierMargin, 73);
        f2317h.append(C0439f.Constraint_constraint_referenced_ids, 74);
        f2317h.append(C0439f.Constraint_barrierAllowsGoneWidgets, 75);
        f2317h.append(C0439f.Constraint_pathMotionArc, 76);
        f2317h.append(C0439f.Constraint_layout_constraintTag, 77);
        f2317h.append(C0439f.Constraint_visibilityMode, 78);
        f2317h.append(C0439f.Constraint_layout_constrainedWidth, 80);
        f2317h.append(C0439f.Constraint_layout_constrainedHeight, 81);
        f2317h.append(C0439f.Constraint_polarRelativeTo, 82);
        f2317h.append(C0439f.Constraint_transformPivotTarget, 83);
        f2317h.append(C0439f.Constraint_quantizeMotionSteps, 84);
        f2317h.append(C0439f.Constraint_quantizeMotionPhase, 85);
        f2317h.append(C0439f.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f2318i;
        int i = C0439f.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f2318i.append(i, 7);
        f2318i.append(C0439f.ConstraintOverride_android_orientation, 27);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginLeft, 13);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginTop, 16);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginRight, 14);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginBottom, 11);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginStart, 15);
        f2318i.append(C0439f.ConstraintOverride_layout_goneMarginEnd, 12);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintVertical_weight, 40);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintVertical_bias, 37);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintLeft_creator, 87);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintTop_creator, 87);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintRight_creator, 87);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintBottom_creator, 87);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginLeft, 24);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginRight, 28);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginStart, 31);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginEnd, 8);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginTop, 34);
        f2318i.append(C0439f.ConstraintOverride_android_layout_marginBottom, 2);
        f2318i.append(C0439f.ConstraintOverride_android_layout_width, 23);
        f2318i.append(C0439f.ConstraintOverride_android_layout_height, 21);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintWidth, 95);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHeight, 96);
        f2318i.append(C0439f.ConstraintOverride_android_visibility, 22);
        f2318i.append(C0439f.ConstraintOverride_android_alpha, 43);
        f2318i.append(C0439f.ConstraintOverride_android_elevation, 44);
        f2318i.append(C0439f.ConstraintOverride_android_rotationX, 45);
        f2318i.append(C0439f.ConstraintOverride_android_rotationY, 46);
        f2318i.append(C0439f.ConstraintOverride_android_rotation, 60);
        f2318i.append(C0439f.ConstraintOverride_android_scaleX, 47);
        f2318i.append(C0439f.ConstraintOverride_android_scaleY, 48);
        f2318i.append(C0439f.ConstraintOverride_android_transformPivotX, 49);
        f2318i.append(C0439f.ConstraintOverride_android_transformPivotY, 50);
        f2318i.append(C0439f.ConstraintOverride_android_translationX, 51);
        f2318i.append(C0439f.ConstraintOverride_android_translationY, 52);
        f2318i.append(C0439f.ConstraintOverride_android_translationZ, 53);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintWidth_default, 54);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHeight_default, 55);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintWidth_max, 56);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHeight_max, 57);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintWidth_min, 58);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHeight_min, 59);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintCircleRadius, 62);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintCircleAngle, 63);
        f2318i.append(C0439f.ConstraintOverride_animateRelativeTo, 64);
        f2318i.append(C0439f.ConstraintOverride_transitionEasing, 65);
        f2318i.append(C0439f.ConstraintOverride_drawPath, 66);
        f2318i.append(C0439f.ConstraintOverride_transitionPathRotate, 67);
        f2318i.append(C0439f.ConstraintOverride_motionStagger, 79);
        f2318i.append(C0439f.ConstraintOverride_android_id, 38);
        f2318i.append(C0439f.ConstraintOverride_motionTarget, 98);
        f2318i.append(C0439f.ConstraintOverride_motionProgress, 68);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintWidth_percent, 69);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintHeight_percent, 70);
        f2318i.append(C0439f.ConstraintOverride_chainUseRtl, 71);
        f2318i.append(C0439f.ConstraintOverride_barrierDirection, 72);
        f2318i.append(C0439f.ConstraintOverride_barrierMargin, 73);
        f2318i.append(C0439f.ConstraintOverride_constraint_referenced_ids, 74);
        f2318i.append(C0439f.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f2318i.append(C0439f.ConstraintOverride_pathMotionArc, 76);
        f2318i.append(C0439f.ConstraintOverride_layout_constraintTag, 77);
        f2318i.append(C0439f.ConstraintOverride_visibilityMode, 78);
        f2318i.append(C0439f.ConstraintOverride_layout_constrainedWidth, 80);
        f2318i.append(C0439f.ConstraintOverride_layout_constrainedHeight, 81);
        f2318i.append(C0439f.ConstraintOverride_polarRelativeTo, 82);
        f2318i.append(C0439f.ConstraintOverride_transformPivotTarget, 83);
        f2318i.append(C0439f.ConstraintOverride_quantizeMotionSteps, 84);
        f2318i.append(C0439f.ConstraintOverride_quantizeMotionPhase, 85);
        f2318i.append(C0439f.ConstraintOverride_quantizeMotionInterpolator, 86);
        f2318i.append(C0439f.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static int m2751F(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: G */
    static void m2752G(Object obj, TypedArray typedArray, int i, int i2) {
        if (obj != null) {
            int i3 = typedArray.peekValue(i).type;
            if (i3 != 3) {
                int i4 = -2;
                boolean z = false;
                if (i3 != 5) {
                    int i5 = typedArray.getInt(i, 0);
                    if (i5 != -4) {
                        i4 = (i5 == -3 || !(i5 == -2 || i5 == -1)) ? 0 : i5;
                    } else {
                        z = true;
                    }
                } else {
                    i4 = typedArray.getDimensionPixelSize(i, 0);
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        layoutParams.width = i4;
                        layoutParams.f2207X = z;
                        return;
                    }
                    layoutParams.height = i4;
                    layoutParams.f2208Y = z;
                } else if (obj instanceof C0433b) {
                    C0433b bVar = (C0433b) obj;
                    if (i2 == 0) {
                        bVar.f2376c = i4;
                        bVar.f2395l0 = z;
                        return;
                    }
                    bVar.f2378d = i4;
                    bVar.f2397m0 = z;
                } else if (obj instanceof C0431a.C0432a) {
                    C0431a.C0432a aVar = (C0431a.C0432a) obj;
                    if (i2 == 0) {
                        aVar.mo2974b(23, i4);
                        aVar.mo2976d(80, z);
                        return;
                    }
                    aVar.mo2974b(21, i4);
                    aVar.mo2976d(81, z);
                }
            } else {
                m2753H(obj, typedArray.getString(i), i2);
            }
        }
    }

    /* renamed from: H */
    static void m2753H(Object obj, String str, int i) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams.width = 0;
                            } else {
                                layoutParams.height = 0;
                            }
                            m2754I(layoutParams, trim2);
                        } else if (obj instanceof C0433b) {
                            ((C0433b) obj).f2411y = trim2;
                        } else if (obj instanceof C0431a.C0432a) {
                            ((C0431a.C0432a) obj).mo2975c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.LayoutParams) {
                                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                                if (i == 0) {
                                    layoutParams2.width = 0;
                                    layoutParams2.f2192I = parseFloat;
                                    return;
                                }
                                layoutParams2.height = 0;
                                layoutParams2.f2193J = parseFloat;
                            } else if (obj instanceof C0433b) {
                                C0433b bVar = (C0433b) obj;
                                if (i == 0) {
                                    bVar.f2376c = 0;
                                    bVar.f2366U = parseFloat;
                                    return;
                                }
                                bVar.f2378d = 0;
                                bVar.f2365T = parseFloat;
                            } else if (obj instanceof C0431a.C0432a) {
                                C0431a.C0432a aVar = (C0431a.C0432a) obj;
                                if (i == 0) {
                                    aVar.mo2974b(23, 0);
                                    aVar.mo2973a(39, parseFloat);
                                    return;
                                }
                                aVar.mo2974b(21, 0);
                                aVar.mo2973a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams3.width = 0;
                                layoutParams3.f2202S = max;
                                layoutParams3.f2196M = 2;
                                return;
                            }
                            layoutParams3.height = 0;
                            layoutParams3.f2203T = max;
                            layoutParams3.f2197N = 2;
                        } else if (obj instanceof C0433b) {
                            C0433b bVar2 = (C0433b) obj;
                            if (i == 0) {
                                bVar2.f2376c = 0;
                                bVar2.f2379d0 = max;
                                bVar2.f2369X = 2;
                                return;
                            }
                            bVar2.f2378d = 0;
                            bVar2.f2381e0 = max;
                            bVar2.f2370Y = 2;
                        } else if (obj instanceof C0431a.C0432a) {
                            C0431a.C0432a aVar2 = (C0431a.C0432a) obj;
                            if (i == 0) {
                                aVar2.mo2974b(23, 0);
                                aVar2.mo2974b(54, 2);
                                return;
                            }
                            aVar2.mo2974b(21, 0);
                            aVar2.mo2974b(55, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I */
    static void m2754I(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        layoutParams.f2189F = str;
        layoutParams.f2190G = f;
        layoutParams.f2191H = i;
    }

    /* renamed from: J */
    private void m2755J(Context context, C0431a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            m2756K(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0439f.Constraint_android_id || C0439f.Constraint_android_layout_marginStart == index || C0439f.Constraint_android_layout_marginEnd == index)) {
                aVar.f2328d.f2414a = true;
                aVar.f2329e.f2374b = true;
                aVar.f2327c.f2428a = true;
                aVar.f2330f.f2434a = true;
            }
            switch (f2317h.get(index)) {
                case 1:
                    C0433b bVar = aVar.f2329e;
                    bVar.f2402p = m2751F(typedArray, index, bVar.f2402p);
                    break;
                case 2:
                    C0433b bVar2 = aVar.f2329e;
                    bVar2.f2354I = typedArray.getDimensionPixelSize(index, bVar2.f2354I);
                    break;
                case 3:
                    C0433b bVar3 = aVar.f2329e;
                    bVar3.f2400o = m2751F(typedArray, index, bVar3.f2400o);
                    break;
                case 4:
                    C0433b bVar4 = aVar.f2329e;
                    bVar4.f2398n = m2751F(typedArray, index, bVar4.f2398n);
                    break;
                case 5:
                    aVar.f2329e.f2411y = typedArray.getString(index);
                    break;
                case 6:
                    C0433b bVar5 = aVar.f2329e;
                    bVar5.f2348C = typedArray.getDimensionPixelOffset(index, bVar5.f2348C);
                    break;
                case 7:
                    C0433b bVar6 = aVar.f2329e;
                    bVar6.f2349D = typedArray.getDimensionPixelOffset(index, bVar6.f2349D);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0433b bVar7 = aVar.f2329e;
                        bVar7.f2355J = typedArray.getDimensionPixelSize(index, bVar7.f2355J);
                        break;
                    }
                case 9:
                    C0433b bVar8 = aVar.f2329e;
                    bVar8.f2408v = m2751F(typedArray, index, bVar8.f2408v);
                    break;
                case 10:
                    C0433b bVar9 = aVar.f2329e;
                    bVar9.f2407u = m2751F(typedArray, index, bVar9.f2407u);
                    break;
                case 11:
                    C0433b bVar10 = aVar.f2329e;
                    bVar10.f2361P = typedArray.getDimensionPixelSize(index, bVar10.f2361P);
                    break;
                case 12:
                    C0433b bVar11 = aVar.f2329e;
                    bVar11.f2362Q = typedArray.getDimensionPixelSize(index, bVar11.f2362Q);
                    break;
                case 13:
                    C0433b bVar12 = aVar.f2329e;
                    bVar12.f2358M = typedArray.getDimensionPixelSize(index, bVar12.f2358M);
                    break;
                case 14:
                    C0433b bVar13 = aVar.f2329e;
                    bVar13.f2360O = typedArray.getDimensionPixelSize(index, bVar13.f2360O);
                    break;
                case 15:
                    C0433b bVar14 = aVar.f2329e;
                    bVar14.f2363R = typedArray.getDimensionPixelSize(index, bVar14.f2363R);
                    break;
                case 16:
                    C0433b bVar15 = aVar.f2329e;
                    bVar15.f2359N = typedArray.getDimensionPixelSize(index, bVar15.f2359N);
                    break;
                case 17:
                    C0433b bVar16 = aVar.f2329e;
                    bVar16.f2380e = typedArray.getDimensionPixelOffset(index, bVar16.f2380e);
                    break;
                case 18:
                    C0433b bVar17 = aVar.f2329e;
                    bVar17.f2382f = typedArray.getDimensionPixelOffset(index, bVar17.f2382f);
                    break;
                case 19:
                    C0433b bVar18 = aVar.f2329e;
                    bVar18.f2384g = typedArray.getFloat(index, bVar18.f2384g);
                    break;
                case 20:
                    C0433b bVar19 = aVar.f2329e;
                    bVar19.f2409w = typedArray.getFloat(index, bVar19.f2409w);
                    break;
                case 21:
                    C0433b bVar20 = aVar.f2329e;
                    bVar20.f2378d = typedArray.getLayoutDimension(index, bVar20.f2378d);
                    break;
                case 22:
                    C0435d dVar = aVar.f2327c;
                    dVar.f2429b = typedArray.getInt(index, dVar.f2429b);
                    C0435d dVar2 = aVar.f2327c;
                    dVar2.f2429b = f2316g[dVar2.f2429b];
                    break;
                case 23:
                    C0433b bVar21 = aVar.f2329e;
                    bVar21.f2376c = typedArray.getLayoutDimension(index, bVar21.f2376c);
                    break;
                case 24:
                    C0433b bVar22 = aVar.f2329e;
                    bVar22.f2351F = typedArray.getDimensionPixelSize(index, bVar22.f2351F);
                    break;
                case 25:
                    C0433b bVar23 = aVar.f2329e;
                    bVar23.f2386h = m2751F(typedArray, index, bVar23.f2386h);
                    break;
                case 26:
                    C0433b bVar24 = aVar.f2329e;
                    bVar24.f2388i = m2751F(typedArray, index, bVar24.f2388i);
                    break;
                case 27:
                    C0433b bVar25 = aVar.f2329e;
                    bVar25.f2350E = typedArray.getInt(index, bVar25.f2350E);
                    break;
                case 28:
                    C0433b bVar26 = aVar.f2329e;
                    bVar26.f2352G = typedArray.getDimensionPixelSize(index, bVar26.f2352G);
                    break;
                case 29:
                    C0433b bVar27 = aVar.f2329e;
                    bVar27.f2390j = m2751F(typedArray, index, bVar27.f2390j);
                    break;
                case 30:
                    C0433b bVar28 = aVar.f2329e;
                    bVar28.f2392k = m2751F(typedArray, index, bVar28.f2392k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0433b bVar29 = aVar.f2329e;
                        bVar29.f2356K = typedArray.getDimensionPixelSize(index, bVar29.f2356K);
                        break;
                    }
                case 32:
                    C0433b bVar30 = aVar.f2329e;
                    bVar30.f2405s = m2751F(typedArray, index, bVar30.f2405s);
                    break;
                case 33:
                    C0433b bVar31 = aVar.f2329e;
                    bVar31.f2406t = m2751F(typedArray, index, bVar31.f2406t);
                    break;
                case 34:
                    C0433b bVar32 = aVar.f2329e;
                    bVar32.f2353H = typedArray.getDimensionPixelSize(index, bVar32.f2353H);
                    break;
                case 35:
                    C0433b bVar33 = aVar.f2329e;
                    bVar33.f2396m = m2751F(typedArray, index, bVar33.f2396m);
                    break;
                case 36:
                    C0433b bVar34 = aVar.f2329e;
                    bVar34.f2394l = m2751F(typedArray, index, bVar34.f2394l);
                    break;
                case 37:
                    C0433b bVar35 = aVar.f2329e;
                    bVar35.f2410x = typedArray.getFloat(index, bVar35.f2410x);
                    break;
                case 38:
                    aVar.f2325a = typedArray.getResourceId(index, aVar.f2325a);
                    break;
                case 39:
                    C0433b bVar36 = aVar.f2329e;
                    bVar36.f2366U = typedArray.getFloat(index, bVar36.f2366U);
                    break;
                case 40:
                    C0433b bVar37 = aVar.f2329e;
                    bVar37.f2365T = typedArray.getFloat(index, bVar37.f2365T);
                    break;
                case 41:
                    C0433b bVar38 = aVar.f2329e;
                    bVar38.f2367V = typedArray.getInt(index, bVar38.f2367V);
                    break;
                case 42:
                    C0433b bVar39 = aVar.f2329e;
                    bVar39.f2368W = typedArray.getInt(index, bVar39.f2368W);
                    break;
                case 43:
                    C0435d dVar3 = aVar.f2327c;
                    dVar3.f2431d = typedArray.getFloat(index, dVar3.f2431d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0436e eVar = aVar.f2330f;
                        eVar.f2446m = true;
                        eVar.f2447n = typedArray.getDimension(index, eVar.f2447n);
                        break;
                    }
                case 45:
                    C0436e eVar2 = aVar.f2330f;
                    eVar2.f2436c = typedArray.getFloat(index, eVar2.f2436c);
                    break;
                case 46:
                    C0436e eVar3 = aVar.f2330f;
                    eVar3.f2437d = typedArray.getFloat(index, eVar3.f2437d);
                    break;
                case 47:
                    C0436e eVar4 = aVar.f2330f;
                    eVar4.f2438e = typedArray.getFloat(index, eVar4.f2438e);
                    break;
                case 48:
                    C0436e eVar5 = aVar.f2330f;
                    eVar5.f2439f = typedArray.getFloat(index, eVar5.f2439f);
                    break;
                case 49:
                    C0436e eVar6 = aVar.f2330f;
                    eVar6.f2440g = typedArray.getDimension(index, eVar6.f2440g);
                    break;
                case 50:
                    C0436e eVar7 = aVar.f2330f;
                    eVar7.f2441h = typedArray.getDimension(index, eVar7.f2441h);
                    break;
                case 51:
                    C0436e eVar8 = aVar.f2330f;
                    eVar8.f2443j = typedArray.getDimension(index, eVar8.f2443j);
                    break;
                case 52:
                    C0436e eVar9 = aVar.f2330f;
                    eVar9.f2444k = typedArray.getDimension(index, eVar9.f2444k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0436e eVar10 = aVar.f2330f;
                        eVar10.f2445l = typedArray.getDimension(index, eVar10.f2445l);
                        break;
                    }
                case 54:
                    C0433b bVar40 = aVar.f2329e;
                    bVar40.f2369X = typedArray.getInt(index, bVar40.f2369X);
                    break;
                case 55:
                    C0433b bVar41 = aVar.f2329e;
                    bVar41.f2370Y = typedArray.getInt(index, bVar41.f2370Y);
                    break;
                case 56:
                    C0433b bVar42 = aVar.f2329e;
                    bVar42.f2371Z = typedArray.getDimensionPixelSize(index, bVar42.f2371Z);
                    break;
                case 57:
                    C0433b bVar43 = aVar.f2329e;
                    bVar43.f2373a0 = typedArray.getDimensionPixelSize(index, bVar43.f2373a0);
                    break;
                case 58:
                    C0433b bVar44 = aVar.f2329e;
                    bVar44.f2375b0 = typedArray.getDimensionPixelSize(index, bVar44.f2375b0);
                    break;
                case 59:
                    C0433b bVar45 = aVar.f2329e;
                    bVar45.f2377c0 = typedArray.getDimensionPixelSize(index, bVar45.f2377c0);
                    break;
                case 60:
                    C0436e eVar11 = aVar.f2330f;
                    eVar11.f2435b = typedArray.getFloat(index, eVar11.f2435b);
                    break;
                case 61:
                    C0433b bVar46 = aVar.f2329e;
                    bVar46.f2412z = m2751F(typedArray, index, bVar46.f2412z);
                    break;
                case 62:
                    C0433b bVar47 = aVar.f2329e;
                    bVar47.f2346A = typedArray.getDimensionPixelSize(index, bVar47.f2346A);
                    break;
                case 63:
                    C0433b bVar48 = aVar.f2329e;
                    bVar48.f2347B = typedArray.getFloat(index, bVar48.f2347B);
                    break;
                case 64:
                    C0434c cVar = aVar.f2328d;
                    cVar.f2415b = m2751F(typedArray, index, cVar.f2415b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f2328d.f2417d = C3500c.f11187c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f2328d.f2417d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f2328d.f2419f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0434c cVar2 = aVar.f2328d;
                    cVar2.f2422i = typedArray.getFloat(index, cVar2.f2422i);
                    break;
                case 68:
                    C0435d dVar4 = aVar.f2327c;
                    dVar4.f2432e = typedArray.getFloat(index, dVar4.f2432e);
                    break;
                case 69:
                    aVar.f2329e.f2379d0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2329e.f2381e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0433b bVar49 = aVar.f2329e;
                    bVar49.f2383f0 = typedArray.getInt(index, bVar49.f2383f0);
                    break;
                case 73:
                    C0433b bVar50 = aVar.f2329e;
                    bVar50.f2385g0 = typedArray.getDimensionPixelSize(index, bVar50.f2385g0);
                    break;
                case 74:
                    aVar.f2329e.f2391j0 = typedArray.getString(index);
                    break;
                case 75:
                    C0433b bVar51 = aVar.f2329e;
                    bVar51.f2399n0 = typedArray.getBoolean(index, bVar51.f2399n0);
                    break;
                case 76:
                    C0434c cVar3 = aVar.f2328d;
                    cVar3.f2418e = typedArray.getInt(index, cVar3.f2418e);
                    break;
                case 77:
                    aVar.f2329e.f2393k0 = typedArray.getString(index);
                    break;
                case 78:
                    C0435d dVar5 = aVar.f2327c;
                    dVar5.f2430c = typedArray.getInt(index, dVar5.f2430c);
                    break;
                case 79:
                    C0434c cVar4 = aVar.f2328d;
                    cVar4.f2420g = typedArray.getFloat(index, cVar4.f2420g);
                    break;
                case 80:
                    C0433b bVar52 = aVar.f2329e;
                    bVar52.f2395l0 = typedArray.getBoolean(index, bVar52.f2395l0);
                    break;
                case 81:
                    C0433b bVar53 = aVar.f2329e;
                    bVar53.f2397m0 = typedArray.getBoolean(index, bVar53.f2397m0);
                    break;
                case 82:
                    C0434c cVar5 = aVar.f2328d;
                    cVar5.f2416c = typedArray.getInteger(index, cVar5.f2416c);
                    break;
                case 83:
                    C0436e eVar12 = aVar.f2330f;
                    eVar12.f2442i = m2751F(typedArray, index, eVar12.f2442i);
                    break;
                case 84:
                    C0434c cVar6 = aVar.f2328d;
                    cVar6.f2424k = typedArray.getInteger(index, cVar6.f2424k);
                    break;
                case 85:
                    C0434c cVar7 = aVar.f2328d;
                    cVar7.f2423j = typedArray.getFloat(index, cVar7.f2423j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0434c cVar8 = aVar.f2328d;
                            cVar8.f2426m = typedArray.getInteger(index, cVar8.f2427n);
                            break;
                        } else {
                            aVar.f2328d.f2425l = typedArray.getString(index);
                            if (aVar.f2328d.f2425l.indexOf("/") <= 0) {
                                aVar.f2328d.f2426m = -1;
                                break;
                            } else {
                                aVar.f2328d.f2427n = typedArray.getResourceId(index, -1);
                                aVar.f2328d.f2426m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f2328d.f2427n = typedArray.getResourceId(index, -1);
                        C0434c cVar9 = aVar.f2328d;
                        if (cVar9.f2427n == -1) {
                            break;
                        } else {
                            cVar9.f2426m = -2;
                            break;
                        }
                    }
                case 87:
                    String hexString = Integer.toHexString(index);
                    int i3 = f2317h.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i3);
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 91:
                    C0433b bVar54 = aVar.f2329e;
                    bVar54.f2403q = m2751F(typedArray, index, bVar54.f2403q);
                    break;
                case 92:
                    C0433b bVar55 = aVar.f2329e;
                    bVar55.f2404r = m2751F(typedArray, index, bVar55.f2404r);
                    break;
                case 93:
                    C0433b bVar56 = aVar.f2329e;
                    bVar56.f2357L = typedArray.getDimensionPixelSize(index, bVar56.f2357L);
                    break;
                case 94:
                    C0433b bVar57 = aVar.f2329e;
                    bVar57.f2364S = typedArray.getDimensionPixelSize(index, bVar57.f2364S);
                    break;
                case 95:
                    m2752G(aVar.f2329e, typedArray, index, 0);
                    break;
                case 96:
                    m2752G(aVar.f2329e, typedArray, index, 1);
                    break;
                case 97:
                    C0433b bVar58 = aVar.f2329e;
                    bVar58.f2401o0 = typedArray.getInt(index, bVar58.f2401o0);
                    break;
                default:
                    String hexString2 = Integer.toHexString(index);
                    int i4 = f2317h.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                    sb2.append("Unknown attribute 0x");
                    sb2.append(hexString2);
                    sb2.append("   ");
                    sb2.append(i4);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
            }
        }
        C0433b bVar59 = aVar.f2329e;
        if (bVar59.f2391j0 != null) {
            bVar59.f2389i0 = null;
        }
    }

    /* renamed from: K */
    private static void m2756K(Context context, C0431a aVar, TypedArray typedArray) {
        C0431a aVar2 = aVar;
        TypedArray typedArray2 = typedArray;
        int indexCount = typedArray.getIndexCount();
        C0431a.C0432a aVar3 = new C0431a.C0432a();
        aVar2.f2332h = aVar3;
        aVar2.f2328d.f2414a = false;
        aVar2.f2329e.f2374b = false;
        aVar2.f2327c.f2428a = false;
        aVar2.f2330f.f2434a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray2.getIndex(i);
            switch (f2318i.get(index)) {
                case 2:
                    aVar3.mo2974b(2, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2354I));
                    break;
                case 5:
                    aVar3.mo2975c(5, typedArray2.getString(index));
                    break;
                case 6:
                    aVar3.mo2974b(6, typedArray2.getDimensionPixelOffset(index, aVar2.f2329e.f2348C));
                    break;
                case 7:
                    aVar3.mo2974b(7, typedArray2.getDimensionPixelOffset(index, aVar2.f2329e.f2349D));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar3.mo2974b(8, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2355J));
                        break;
                    }
                case 11:
                    aVar3.mo2974b(11, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2361P));
                    break;
                case 12:
                    aVar3.mo2974b(12, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2362Q));
                    break;
                case 13:
                    aVar3.mo2974b(13, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2358M));
                    break;
                case 14:
                    aVar3.mo2974b(14, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2360O));
                    break;
                case 15:
                    aVar3.mo2974b(15, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2363R));
                    break;
                case 16:
                    aVar3.mo2974b(16, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2359N));
                    break;
                case 17:
                    aVar3.mo2974b(17, typedArray2.getDimensionPixelOffset(index, aVar2.f2329e.f2380e));
                    break;
                case 18:
                    aVar3.mo2974b(18, typedArray2.getDimensionPixelOffset(index, aVar2.f2329e.f2382f));
                    break;
                case 19:
                    aVar3.mo2973a(19, typedArray2.getFloat(index, aVar2.f2329e.f2384g));
                    break;
                case 20:
                    aVar3.mo2973a(20, typedArray2.getFloat(index, aVar2.f2329e.f2409w));
                    break;
                case 21:
                    aVar3.mo2974b(21, typedArray2.getLayoutDimension(index, aVar2.f2329e.f2378d));
                    break;
                case 22:
                    aVar3.mo2974b(22, f2316g[typedArray2.getInt(index, aVar2.f2327c.f2429b)]);
                    break;
                case 23:
                    aVar3.mo2974b(23, typedArray2.getLayoutDimension(index, aVar2.f2329e.f2376c));
                    break;
                case 24:
                    aVar3.mo2974b(24, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2351F));
                    break;
                case 27:
                    aVar3.mo2974b(27, typedArray2.getInt(index, aVar2.f2329e.f2350E));
                    break;
                case 28:
                    aVar3.mo2974b(28, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2352G));
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        aVar3.mo2974b(31, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2356K));
                        break;
                    }
                case 34:
                    aVar3.mo2974b(34, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2353H));
                    break;
                case 37:
                    aVar3.mo2973a(37, typedArray2.getFloat(index, aVar2.f2329e.f2410x));
                    break;
                case 38:
                    int resourceId = typedArray2.getResourceId(index, aVar2.f2325a);
                    aVar2.f2325a = resourceId;
                    aVar3.mo2974b(38, resourceId);
                    break;
                case 39:
                    aVar3.mo2973a(39, typedArray2.getFloat(index, aVar2.f2329e.f2366U));
                    break;
                case 40:
                    aVar3.mo2973a(40, typedArray2.getFloat(index, aVar2.f2329e.f2365T));
                    break;
                case 41:
                    aVar3.mo2974b(41, typedArray2.getInt(index, aVar2.f2329e.f2367V));
                    break;
                case 42:
                    aVar3.mo2974b(42, typedArray2.getInt(index, aVar2.f2329e.f2368W));
                    break;
                case 43:
                    aVar3.mo2973a(43, typedArray2.getFloat(index, aVar2.f2327c.f2431d));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar3.mo2976d(44, true);
                        aVar3.mo2973a(44, typedArray2.getDimension(index, aVar2.f2330f.f2447n));
                        break;
                    }
                case 45:
                    aVar3.mo2973a(45, typedArray2.getFloat(index, aVar2.f2330f.f2436c));
                    break;
                case 46:
                    aVar3.mo2973a(46, typedArray2.getFloat(index, aVar2.f2330f.f2437d));
                    break;
                case 47:
                    aVar3.mo2973a(47, typedArray2.getFloat(index, aVar2.f2330f.f2438e));
                    break;
                case 48:
                    aVar3.mo2973a(48, typedArray2.getFloat(index, aVar2.f2330f.f2439f));
                    break;
                case 49:
                    aVar3.mo2973a(49, typedArray2.getDimension(index, aVar2.f2330f.f2440g));
                    break;
                case 50:
                    aVar3.mo2973a(50, typedArray2.getDimension(index, aVar2.f2330f.f2441h));
                    break;
                case 51:
                    aVar3.mo2973a(51, typedArray2.getDimension(index, aVar2.f2330f.f2443j));
                    break;
                case 52:
                    aVar3.mo2973a(52, typedArray2.getDimension(index, aVar2.f2330f.f2444k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        aVar3.mo2973a(53, typedArray2.getDimension(index, aVar2.f2330f.f2445l));
                        break;
                    }
                case 54:
                    aVar3.mo2974b(54, typedArray2.getInt(index, aVar2.f2329e.f2369X));
                    break;
                case 55:
                    aVar3.mo2974b(55, typedArray2.getInt(index, aVar2.f2329e.f2370Y));
                    break;
                case 56:
                    aVar3.mo2974b(56, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2371Z));
                    break;
                case 57:
                    aVar3.mo2974b(57, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2373a0));
                    break;
                case 58:
                    aVar3.mo2974b(58, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2375b0));
                    break;
                case 59:
                    aVar3.mo2974b(59, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2377c0));
                    break;
                case 60:
                    aVar3.mo2973a(60, typedArray2.getFloat(index, aVar2.f2330f.f2435b));
                    break;
                case 62:
                    aVar3.mo2974b(62, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2346A));
                    break;
                case 63:
                    aVar3.mo2973a(63, typedArray2.getFloat(index, aVar2.f2329e.f2347B));
                    break;
                case 64:
                    aVar3.mo2974b(64, m2751F(typedArray2, index, aVar2.f2328d.f2415b));
                    break;
                case 65:
                    if (typedArray2.peekValue(index).type != 3) {
                        aVar3.mo2975c(65, C3500c.f11187c[typedArray2.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar3.mo2975c(65, typedArray2.getString(index));
                        break;
                    }
                case 66:
                    aVar3.mo2974b(66, typedArray2.getInt(index, 0));
                    break;
                case 67:
                    aVar3.mo2973a(67, typedArray2.getFloat(index, aVar2.f2328d.f2422i));
                    break;
                case 68:
                    aVar3.mo2973a(68, typedArray2.getFloat(index, aVar2.f2327c.f2432e));
                    break;
                case 69:
                    aVar3.mo2973a(69, typedArray2.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar3.mo2973a(70, typedArray2.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar3.mo2974b(72, typedArray2.getInt(index, aVar2.f2329e.f2383f0));
                    break;
                case 73:
                    aVar3.mo2974b(73, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2385g0));
                    break;
                case 74:
                    aVar3.mo2975c(74, typedArray2.getString(index));
                    break;
                case 75:
                    aVar3.mo2976d(75, typedArray2.getBoolean(index, aVar2.f2329e.f2399n0));
                    break;
                case 76:
                    aVar3.mo2974b(76, typedArray2.getInt(index, aVar2.f2328d.f2418e));
                    break;
                case 77:
                    aVar3.mo2975c(77, typedArray2.getString(index));
                    break;
                case 78:
                    aVar3.mo2974b(78, typedArray2.getInt(index, aVar2.f2327c.f2430c));
                    break;
                case 79:
                    aVar3.mo2973a(79, typedArray2.getFloat(index, aVar2.f2328d.f2420g));
                    break;
                case 80:
                    aVar3.mo2976d(80, typedArray2.getBoolean(index, aVar2.f2329e.f2395l0));
                    break;
                case 81:
                    aVar3.mo2976d(81, typedArray2.getBoolean(index, aVar2.f2329e.f2397m0));
                    break;
                case 82:
                    aVar3.mo2974b(82, typedArray2.getInteger(index, aVar2.f2328d.f2416c));
                    break;
                case 83:
                    aVar3.mo2974b(83, m2751F(typedArray2, index, aVar2.f2330f.f2442i));
                    break;
                case 84:
                    aVar3.mo2974b(84, typedArray2.getInteger(index, aVar2.f2328d.f2424k));
                    break;
                case 85:
                    aVar3.mo2973a(85, typedArray2.getFloat(index, aVar2.f2328d.f2423j));
                    break;
                case 86:
                    int i2 = typedArray2.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0434c cVar = aVar2.f2328d;
                            cVar.f2426m = typedArray2.getInteger(index, cVar.f2427n);
                            aVar3.mo2974b(88, aVar2.f2328d.f2426m);
                            break;
                        } else {
                            aVar2.f2328d.f2425l = typedArray2.getString(index);
                            aVar3.mo2975c(90, aVar2.f2328d.f2425l);
                            if (aVar2.f2328d.f2425l.indexOf("/") <= 0) {
                                aVar2.f2328d.f2426m = -1;
                                aVar3.mo2974b(88, -1);
                                break;
                            } else {
                                aVar2.f2328d.f2427n = typedArray2.getResourceId(index, -1);
                                aVar3.mo2974b(89, aVar2.f2328d.f2427n);
                                aVar2.f2328d.f2426m = -2;
                                aVar3.mo2974b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar2.f2328d.f2427n = typedArray2.getResourceId(index, -1);
                        aVar3.mo2974b(89, aVar2.f2328d.f2427n);
                        C0434c cVar2 = aVar2.f2328d;
                        if (cVar2.f2427n == -1) {
                            break;
                        } else {
                            cVar2.f2426m = -2;
                            aVar3.mo2974b(88, -2);
                            break;
                        }
                    }
                case 87:
                    String hexString = Integer.toHexString(index);
                    int i3 = f2317h.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i3);
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 93:
                    aVar3.mo2974b(93, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2357L));
                    break;
                case 94:
                    aVar3.mo2974b(94, typedArray2.getDimensionPixelSize(index, aVar2.f2329e.f2364S));
                    break;
                case 95:
                    m2752G(aVar3, typedArray2, index, 0);
                    break;
                case 96:
                    m2752G(aVar3, typedArray2, index, 1);
                    break;
                case 97:
                    aVar3.mo2974b(97, typedArray2.getInt(index, aVar2.f2329e.f2401o0));
                    break;
                case 98:
                    if (!MotionLayout.f1622Y0) {
                        if (typedArray2.peekValue(index).type != 3) {
                            aVar2.f2325a = typedArray2.getResourceId(index, aVar2.f2325a);
                            break;
                        } else {
                            aVar2.f2326b = typedArray2.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray2.getResourceId(index, aVar2.f2325a);
                        aVar2.f2325a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar2.f2326b = typedArray2.getString(index);
                            break;
                        }
                    }
                default:
                    String hexString2 = Integer.toHexString(index);
                    int i4 = f2317h.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                    sb2.append("Unknown attribute 0x");
                    sb2.append(hexString2);
                    sb2.append("   ");
                    sb2.append(i4);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static void m2757N(C0431a aVar, int i, float f) {
        if (i == 19) {
            aVar.f2329e.f2384g = f;
        } else if (i == 20) {
            aVar.f2329e.f2409w = f;
        } else if (i == 37) {
            aVar.f2329e.f2410x = f;
        } else if (i == 60) {
            aVar.f2330f.f2435b = f;
        } else if (i == 63) {
            aVar.f2329e.f2347B = f;
        } else if (i == 79) {
            aVar.f2328d.f2420g = f;
        } else if (i == 85) {
            aVar.f2328d.f2423j = f;
        } else if (i == 87) {
        } else {
            if (i == 39) {
                aVar.f2329e.f2366U = f;
            } else if (i != 40) {
                switch (i) {
                    case 43:
                        aVar.f2327c.f2431d = f;
                        return;
                    case 44:
                        C0436e eVar = aVar.f2330f;
                        eVar.f2447n = f;
                        eVar.f2446m = true;
                        return;
                    case 45:
                        aVar.f2330f.f2436c = f;
                        return;
                    case 46:
                        aVar.f2330f.f2437d = f;
                        return;
                    case 47:
                        aVar.f2330f.f2438e = f;
                        return;
                    case 48:
                        aVar.f2330f.f2439f = f;
                        return;
                    case 49:
                        aVar.f2330f.f2440g = f;
                        return;
                    case 50:
                        aVar.f2330f.f2441h = f;
                        return;
                    case 51:
                        aVar.f2330f.f2443j = f;
                        return;
                    case 52:
                        aVar.f2330f.f2444k = f;
                        return;
                    case 53:
                        aVar.f2330f.f2445l = f;
                        return;
                    default:
                        switch (i) {
                            case 67:
                                aVar.f2328d.f2422i = f;
                                return;
                            case 68:
                                aVar.f2327c.f2432e = f;
                                return;
                            case 69:
                                aVar.f2329e.f2379d0 = f;
                                return;
                            case 70:
                                aVar.f2329e.f2381e0 = f;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                aVar.f2329e.f2365T = f;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static void m2758O(C0431a aVar, int i, int i2) {
        if (i == 6) {
            aVar.f2329e.f2348C = i2;
        } else if (i == 7) {
            aVar.f2329e.f2349D = i2;
        } else if (i == 8) {
            aVar.f2329e.f2355J = i2;
        } else if (i == 27) {
            aVar.f2329e.f2350E = i2;
        } else if (i == 28) {
            aVar.f2329e.f2352G = i2;
        } else if (i == 41) {
            aVar.f2329e.f2367V = i2;
        } else if (i == 42) {
            aVar.f2329e.f2368W = i2;
        } else if (i == 61) {
            aVar.f2329e.f2412z = i2;
        } else if (i == 62) {
            aVar.f2329e.f2346A = i2;
        } else if (i == 72) {
            aVar.f2329e.f2383f0 = i2;
        } else if (i != 73) {
            switch (i) {
                case 2:
                    aVar.f2329e.f2354I = i2;
                    return;
                case 11:
                    aVar.f2329e.f2361P = i2;
                    return;
                case 12:
                    aVar.f2329e.f2362Q = i2;
                    return;
                case 13:
                    aVar.f2329e.f2358M = i2;
                    return;
                case 14:
                    aVar.f2329e.f2360O = i2;
                    return;
                case 15:
                    aVar.f2329e.f2363R = i2;
                    return;
                case 16:
                    aVar.f2329e.f2359N = i2;
                    return;
                case 17:
                    aVar.f2329e.f2380e = i2;
                    return;
                case 18:
                    aVar.f2329e.f2382f = i2;
                    return;
                case 31:
                    aVar.f2329e.f2356K = i2;
                    return;
                case 34:
                    aVar.f2329e.f2353H = i2;
                    return;
                case 38:
                    aVar.f2325a = i2;
                    return;
                case 64:
                    aVar.f2328d.f2415b = i2;
                    return;
                case 66:
                    aVar.f2328d.f2419f = i2;
                    return;
                case 76:
                    aVar.f2328d.f2418e = i2;
                    return;
                case 78:
                    aVar.f2327c.f2430c = i2;
                    return;
                case 93:
                    aVar.f2329e.f2357L = i2;
                    return;
                case 94:
                    aVar.f2329e.f2364S = i2;
                    return;
                case 97:
                    aVar.f2329e.f2401o0 = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            aVar.f2329e.f2378d = i2;
                            return;
                        case 22:
                            aVar.f2327c.f2429b = i2;
                            return;
                        case 23:
                            aVar.f2329e.f2376c = i2;
                            return;
                        case 24:
                            aVar.f2329e.f2351F = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    aVar.f2329e.f2369X = i2;
                                    return;
                                case 55:
                                    aVar.f2329e.f2370Y = i2;
                                    return;
                                case 56:
                                    aVar.f2329e.f2371Z = i2;
                                    return;
                                case 57:
                                    aVar.f2329e.f2373a0 = i2;
                                    return;
                                case 58:
                                    aVar.f2329e.f2375b0 = i2;
                                    return;
                                case 59:
                                    aVar.f2329e.f2377c0 = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            aVar.f2328d.f2416c = i2;
                                            return;
                                        case 83:
                                            aVar.f2330f.f2442i = i2;
                                            return;
                                        case 84:
                                            aVar.f2328d.f2424k = i2;
                                            return;
                                        default:
                                            switch (i) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    aVar.f2328d.f2426m = i2;
                                                    return;
                                                case 89:
                                                    aVar.f2328d.f2427n = i2;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar.f2329e.f2385g0 = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static void m2759P(C0431a aVar, int i, String str) {
        if (i == 5) {
            aVar.f2329e.f2411y = str;
        } else if (i == 65) {
            aVar.f2328d.f2417d = str;
        } else if (i == 74) {
            C0433b bVar = aVar.f2329e;
            bVar.f2391j0 = str;
            bVar.f2389i0 = null;
        } else if (i == 77) {
            aVar.f2329e.f2393k0 = str;
        } else if (i == 87) {
        } else {
            if (i != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2328d.f2425l = str;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static void m2760Q(C0431a aVar, int i, boolean z) {
        if (i == 44) {
            aVar.f2330f.f2446m = z;
        } else if (i == 75) {
            aVar.f2329e.f2399n0 = z;
        } else if (i == 87) {
        } else {
            if (i == 80) {
                aVar.f2329e.f2395l0 = z;
            } else if (i != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f2329e.f2397m0 = z;
            }
        }
    }

    /* renamed from: m */
    public static C0431a m2767m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0431a aVar = new C0431a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C0439f.ConstraintOverride);
        m2756K(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: t */
    private int[] m2768t(View view, String str) {
        int i;
        Object g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0438e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g = ((ConstraintLayout) view.getParent()).mo2864g(0, trim)) != null && (g instanceof Integer)) {
                i = ((Integer) g).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: u */
    private C0431a m2769u(Context context, AttributeSet attributeSet, boolean z) {
        C0431a aVar = new C0431a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C0439f.ConstraintOverride : C0439f.Constraint);
        m2755J(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: v */
    private C0431a m2770v(int i) {
        if (!this.f2324f.containsKey(Integer.valueOf(i))) {
            this.f2324f.put(Integer.valueOf(i), new C0431a());
        }
        return this.f2324f.get(Integer.valueOf(i));
    }

    /* renamed from: A */
    public int mo2944A(int i) {
        return m2770v(i).f2327c.f2429b;
    }

    /* renamed from: B */
    public int mo2945B(int i) {
        return m2770v(i).f2327c.f2430c;
    }

    /* renamed from: C */
    public int mo2946C(int i) {
        return m2770v(i).f2329e.f2376c;
    }

    /* renamed from: D */
    public void mo2947D(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0431a u = m2769u(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        u.f2329e.f2372a = true;
                    }
                    this.f2324f.put(Integer.valueOf(u.f2325a), u);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cd, code lost:
        continue;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2948E(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01dc
            if (r0 == 0) goto L_0x01ca
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cd
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cd
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.f2324f     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r3 = r2.f2325a     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r2 = r1
            goto L_0x01cd
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            r5 = 56
            switch(r4) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01a8;
                case 3: goto L_0x019b;
                case 4: goto L_0x0176;
                case 5: goto L_0x0150;
                case 6: goto L_0x012a;
                case 7: goto L_0x0104;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00e2;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x01cd
        L_0x00e2:
            if (r2 == 0) goto L_0x00eb
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f2331g     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.C0424a.m2733i(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01cd
        L_0x00eb:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x0104:
            if (r2 == 0) goto L_0x0111
            androidx.constraintlayout.widget.c$c r0 = r2.f2328d     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r0.mo2981b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01cd
        L_0x0111:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x012a:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.c$b r0 = r2.f2329e     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r0.mo2979b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01cd
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x0150:
            if (r2 == 0) goto L_0x015d
            androidx.constraintlayout.widget.c$e r0 = r2.f2330f     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r0.mo2985b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01cd
        L_0x015d:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x0176:
            if (r2 == 0) goto L_0x0182
            androidx.constraintlayout.widget.c$d r0 = r2.f2327c     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r0.mo2983b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01cd
        L_0x0182:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x019b:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$a r0 = r9.m2769u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$b r2 = r0.f2329e     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r2.f2387h0 = r3     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01c8
        L_0x01a8:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$a r0 = r9.m2769u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$b r2 = r0.f2329e     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r2.f2372a = r3     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            r2.f2374b = r3     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01c8
        L_0x01b7:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$a r0 = r9.m2769u(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x01c8
        L_0x01c0:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            androidx.constraintlayout.widget.c$a r0 = r9.m2769u(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x01c8:
            r2 = r0
            goto L_0x01cd
        L_0x01ca:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
        L_0x01cd:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d8, IOException -> 0x01d3 }
            goto L_0x0006
        L_0x01d3:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01dc
        L_0x01d8:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0430c.mo2948E(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: L */
    public void mo2949L(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2323e || id != -1) {
                if (!this.f2324f.containsKey(Integer.valueOf(id))) {
                    this.f2324f.put(Integer.valueOf(id), new C0431a());
                }
                C0431a aVar = this.f2324f.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (!aVar.f2329e.f2374b) {
                        aVar.m2799g(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            aVar.f2329e.f2389i0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f2329e.f2399n0 = barrier.getAllowsGoneWidget();
                                aVar.f2329e.f2383f0 = barrier.getType();
                                aVar.f2329e.f2385g0 = barrier.getMargin();
                            }
                        }
                        aVar.f2329e.f2374b = true;
                    }
                    C0435d dVar = aVar.f2327c;
                    if (!dVar.f2428a) {
                        dVar.f2429b = childAt.getVisibility();
                        aVar.f2327c.f2431d = childAt.getAlpha();
                        aVar.f2327c.f2428a = true;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 17) {
                        C0436e eVar = aVar.f2330f;
                        if (!eVar.f2434a) {
                            eVar.f2434a = true;
                            eVar.f2435b = childAt.getRotation();
                            aVar.f2330f.f2436c = childAt.getRotationX();
                            aVar.f2330f.f2437d = childAt.getRotationY();
                            aVar.f2330f.f2438e = childAt.getScaleX();
                            aVar.f2330f.f2439f = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                                C0436e eVar2 = aVar.f2330f;
                                eVar2.f2440g = pivotX;
                                eVar2.f2441h = pivotY;
                            }
                            aVar.f2330f.f2443j = childAt.getTranslationX();
                            aVar.f2330f.f2444k = childAt.getTranslationY();
                            if (i2 >= 21) {
                                aVar.f2330f.f2445l = childAt.getTranslationZ();
                                C0436e eVar3 = aVar.f2330f;
                                if (eVar3.f2446m) {
                                    eVar3.f2447n = childAt.getElevation();
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: M */
    public void mo2950M(C0430c cVar) {
        for (Integer next : cVar.f2324f.keySet()) {
            int intValue = next.intValue();
            C0431a aVar = cVar.f2324f.get(next);
            if (!this.f2324f.containsKey(Integer.valueOf(intValue))) {
                this.f2324f.put(Integer.valueOf(intValue), new C0431a());
            }
            C0431a aVar2 = this.f2324f.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                C0433b bVar = aVar2.f2329e;
                if (!bVar.f2374b) {
                    bVar.mo2978a(aVar.f2329e);
                }
                C0435d dVar = aVar2.f2327c;
                if (!dVar.f2428a) {
                    dVar.mo2982a(aVar.f2327c);
                }
                C0436e eVar = aVar2.f2330f;
                if (!eVar.f2434a) {
                    eVar.mo2984a(aVar.f2330f);
                }
                C0434c cVar2 = aVar2.f2328d;
                if (!cVar2.f2414a) {
                    cVar2.mo2980a(aVar.f2328d);
                }
                for (String next2 : aVar.f2331g.keySet()) {
                    if (!aVar2.f2331g.containsKey(next2)) {
                        aVar2.f2331g.put(next2, aVar.f2331g.get(next2));
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public void mo2951R(boolean z) {
        this.f2323e = z;
    }

    /* renamed from: S */
    public void mo2952S(boolean z) {
    }

    /* renamed from: g */
    public void mo2953g(ConstraintLayout constraintLayout) {
        C0431a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2324f.containsKey(Integer.valueOf(id))) {
                String valueOf = String.valueOf(C0379b.m2242d(childAt));
                Log.w("ConstraintSet", valueOf.length() != 0 ? "id unknown ".concat(valueOf) : new String("id unknown "));
            } else if (this.f2323e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f2324f.containsKey(Integer.valueOf(id)) && (aVar = this.f2324f.get(Integer.valueOf(id))) != null) {
                C0424a.m2734j(childAt, aVar.f2331g);
            }
        }
    }

    /* renamed from: h */
    public void mo2954h(C0430c cVar) {
        for (C0431a next : cVar.f2324f.values()) {
            if (next.f2332h != null) {
                if (next.f2326b != null) {
                    for (Integer intValue : this.f2324f.keySet()) {
                        C0431a w = mo2965w(intValue.intValue());
                        String str = w.f2329e.f2393k0;
                        if (str != null && next.f2326b.matches(str)) {
                            next.f2332h.mo2977e(w);
                            w.f2331g.putAll((HashMap) next.f2331g.clone());
                        }
                    }
                } else {
                    next.f2332h.mo2977e(mo2965w(next.f2325a));
                }
            }
        }
    }

    /* renamed from: i */
    public void mo2955i(ConstraintLayout constraintLayout) {
        mo2957k(constraintLayout, true);
        constraintLayout.setConstraintSet((C0430c) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: j */
    public void mo2956j(ConstraintHelper constraintHelper, C3527e eVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C3527e> sparseArray) {
        C0431a aVar;
        int id = constraintHelper.getId();
        if (this.f2324f.containsKey(Integer.valueOf(id)) && (aVar = this.f2324f.get(Integer.valueOf(id))) != null && (eVar instanceof C3536j)) {
            constraintHelper.mo2384p(aVar, (C3536j) eVar, layoutParams, sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2957k(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2324f.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2324f.containsKey(Integer.valueOf(id))) {
                String valueOf = String.valueOf(C0379b.m2242d(childAt));
                Log.w("ConstraintSet", valueOf.length() != 0 ? "id unknown ".concat(valueOf) : new String("id unknown "));
            } else if (this.f2323e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2324f.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0431a aVar = this.f2324f.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f2329e.f2387h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2329e.f2383f0);
                            barrier.setMargin(aVar.f2329e.f2385g0);
                            barrier.setAllowsGoneWidget(aVar.f2329e.f2399n0);
                            C0433b bVar = aVar.f2329e;
                            int[] iArr = bVar.f2389i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2391j0;
                                if (str != null) {
                                    bVar.f2389i0 = m2768t(barrier, str);
                                    barrier.setReferencedIds(aVar.f2329e.f2389i0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.mo2891c();
                        aVar.mo2971e(layoutParams);
                        if (z) {
                            C0424a.m2734j(childAt, aVar.f2331g);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0435d dVar = aVar.f2327c;
                        if (dVar.f2430c == 0) {
                            childAt.setVisibility(dVar.f2429b);
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 17) {
                            childAt.setAlpha(aVar.f2327c.f2431d);
                            childAt.setRotation(aVar.f2330f.f2435b);
                            childAt.setRotationX(aVar.f2330f.f2436c);
                            childAt.setRotationY(aVar.f2330f.f2437d);
                            childAt.setScaleX(aVar.f2330f.f2438e);
                            childAt.setScaleY(aVar.f2330f.f2439f);
                            C0436e eVar = aVar.f2330f;
                            if (eVar.f2442i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f2330f.f2442i);
                                if (findViewById != null) {
                                    float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                    float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - ((float) childAt.getLeft()));
                                        childAt.setPivotY(top - ((float) childAt.getTop()));
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2440g)) {
                                    childAt.setPivotX(aVar.f2330f.f2440g);
                                }
                                if (!Float.isNaN(aVar.f2330f.f2441h)) {
                                    childAt.setPivotY(aVar.f2330f.f2441h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2330f.f2443j);
                            childAt.setTranslationY(aVar.f2330f.f2444k);
                            if (i2 >= 21) {
                                childAt.setTranslationZ(aVar.f2330f.f2445l);
                                C0436e eVar2 = aVar.f2330f;
                                if (eVar2.f2446m) {
                                    childAt.setElevation(eVar2.f2447n);
                                }
                            }
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("WARNING NO CONSTRAINTS for view ");
                    sb.append(id);
                    Log.v("ConstraintSet", sb.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0431a aVar2 = this.f2324f.get(num);
            if (aVar2 != null) {
                if (aVar2.f2329e.f2387h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0433b bVar2 = aVar2.f2329e;
                    int[] iArr2 = bVar2.f2389i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f2391j0;
                        if (str2 != null) {
                            bVar2.f2389i0 = m2768t(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2329e.f2389i0);
                        }
                    }
                    barrier2.setType(aVar2.f2329e.f2383f0);
                    barrier2.setMargin(aVar2.f2329e.f2385g0);
                    ConstraintLayout.LayoutParams e = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo2858w();
                    aVar2.mo2971e(e);
                    constraintLayout.addView(barrier2, e);
                }
                if (aVar2.f2329e.f2372a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams e2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo2971e(e2);
                    constraintLayout.addView(guideline, e2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo2411j(constraintLayout);
            }
        }
    }

    /* renamed from: l */
    public void mo2958l(int i, ConstraintLayout.LayoutParams layoutParams) {
        C0431a aVar;
        if (this.f2324f.containsKey(Integer.valueOf(i)) && (aVar = this.f2324f.get(Integer.valueOf(i))) != null) {
            aVar.mo2971e(layoutParams);
        }
    }

    /* renamed from: n */
    public void mo2959n(int i, int i2) {
        C0431a aVar;
        if (this.f2324f.containsKey(Integer.valueOf(i)) && (aVar = this.f2324f.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    C0433b bVar = aVar.f2329e;
                    bVar.f2388i = -1;
                    bVar.f2386h = -1;
                    bVar.f2351F = -1;
                    bVar.f2358M = Integer.MIN_VALUE;
                    return;
                case 2:
                    C0433b bVar2 = aVar.f2329e;
                    bVar2.f2392k = -1;
                    bVar2.f2390j = -1;
                    bVar2.f2352G = -1;
                    bVar2.f2360O = Integer.MIN_VALUE;
                    return;
                case 3:
                    C0433b bVar3 = aVar.f2329e;
                    bVar3.f2396m = -1;
                    bVar3.f2394l = -1;
                    bVar3.f2353H = 0;
                    bVar3.f2359N = Integer.MIN_VALUE;
                    return;
                case 4:
                    C0433b bVar4 = aVar.f2329e;
                    bVar4.f2398n = -1;
                    bVar4.f2400o = -1;
                    bVar4.f2354I = 0;
                    bVar4.f2361P = Integer.MIN_VALUE;
                    return;
                case 5:
                    C0433b bVar5 = aVar.f2329e;
                    bVar5.f2402p = -1;
                    bVar5.f2403q = -1;
                    bVar5.f2404r = -1;
                    bVar5.f2357L = 0;
                    bVar5.f2364S = Integer.MIN_VALUE;
                    return;
                case 6:
                    C0433b bVar6 = aVar.f2329e;
                    bVar6.f2405s = -1;
                    bVar6.f2406t = -1;
                    bVar6.f2356K = 0;
                    bVar6.f2363R = Integer.MIN_VALUE;
                    return;
                case 7:
                    C0433b bVar7 = aVar.f2329e;
                    bVar7.f2407u = -1;
                    bVar7.f2408v = -1;
                    bVar7.f2355J = 0;
                    bVar7.f2362Q = Integer.MIN_VALUE;
                    return;
                case 8:
                    C0433b bVar8 = aVar.f2329e;
                    bVar8.f2347B = -1.0f;
                    bVar8.f2346A = -1;
                    bVar8.f2412z = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: o */
    public void mo2960o(Context context, int i) {
        mo2961p((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: p */
    public void mo2961p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2324f.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2323e || id != -1) {
                if (!this.f2324f.containsKey(Integer.valueOf(id))) {
                    this.f2324f.put(Integer.valueOf(id), new C0431a());
                }
                C0431a aVar = this.f2324f.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f2331g = C0424a.m2732c(this.f2322d, childAt);
                    aVar.m2799g(id, layoutParams);
                    aVar.f2327c.f2429b = childAt.getVisibility();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 17) {
                        aVar.f2327c.f2431d = childAt.getAlpha();
                        aVar.f2330f.f2435b = childAt.getRotation();
                        aVar.f2330f.f2436c = childAt.getRotationX();
                        aVar.f2330f.f2437d = childAt.getRotationY();
                        aVar.f2330f.f2438e = childAt.getScaleX();
                        aVar.f2330f.f2439f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0436e eVar = aVar.f2330f;
                            eVar.f2440g = pivotX;
                            eVar.f2441h = pivotY;
                        }
                        aVar.f2330f.f2443j = childAt.getTranslationX();
                        aVar.f2330f.f2444k = childAt.getTranslationY();
                        if (i2 >= 21) {
                            aVar.f2330f.f2445l = childAt.getTranslationZ();
                            C0436e eVar2 = aVar.f2330f;
                            if (eVar2.f2446m) {
                                eVar2.f2447n = childAt.getElevation();
                            }
                        }
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f2329e.f2399n0 = barrier.getAllowsGoneWidget();
                        aVar.f2329e.f2389i0 = barrier.getReferencedIds();
                        aVar.f2329e.f2383f0 = barrier.getType();
                        aVar.f2329e.f2385g0 = barrier.getMargin();
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: q */
    public void mo2962q(C0430c cVar) {
        this.f2324f.clear();
        for (Integer next : cVar.f2324f.keySet()) {
            C0431a aVar = cVar.f2324f.get(next);
            if (aVar != null) {
                this.f2324f.put(next, aVar.clone());
            }
        }
    }

    /* renamed from: r */
    public void mo2963r(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2324f.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2323e || id != -1) {
                if (!this.f2324f.containsKey(Integer.valueOf(id))) {
                    this.f2324f.put(Integer.valueOf(id), new C0431a());
                }
                C0431a aVar = this.f2324f.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (childAt instanceof ConstraintHelper) {
                        aVar.m2801i((ConstraintHelper) childAt, id, layoutParams);
                    }
                    aVar.m2800h(id, layoutParams);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: s */
    public void mo2964s(int i, int i2, int i3, float f) {
        C0433b bVar = m2770v(i).f2329e;
        bVar.f2412z = i2;
        bVar.f2346A = i3;
        bVar.f2347B = f;
    }

    /* renamed from: w */
    public C0431a mo2965w(int i) {
        if (this.f2324f.containsKey(Integer.valueOf(i))) {
            return this.f2324f.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: x */
    public int mo2966x(int i) {
        return m2770v(i).f2329e.f2378d;
    }

    /* renamed from: y */
    public int[] mo2967y() {
        Integer[] numArr = (Integer[]) this.f2324f.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: z */
    public C0431a mo2968z(int i) {
        return m2770v(i);
    }
}
